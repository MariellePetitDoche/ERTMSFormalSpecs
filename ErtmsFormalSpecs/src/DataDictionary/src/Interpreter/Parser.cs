// ------------------------------------------------------------------------------
// -- Copyright ERTMS Solutions
// -- Licensed under the EUPL V.1.1
// -- http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
// --
// -- This file is part of ERTMSFormalSpec software and documentation
// --
// --  ERTMSFormalSpec is free software: you can redistribute it and/or modify
// --  it under the terms of the EUPL General Public License, v.1.1
// --
// -- ERTMSFormalSpec is distributed in the hope that it will be useful,
// -- but WITHOUT ANY WARRANTY; without even the implied warranty of
// -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// --
// ------------------------------------------------------------------------------
using System;
using System.Collections.Generic;

using DataDictionary.Values;

namespace DataDictionary.Interpreter
{
    public class Parser
    {
        /// <summary>
        /// The root element for which this expression is built
        /// </summary>
        public ModelElement Root { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem">The system in which the parser is built</param>
        public Parser(EFSSystem efsSystem)
        {
            EFSSystem = efsSystem;
        }

        /// <summary>
        /// The EFSSystem for which the parser is built
        /// </summary>
        public EFSSystem EFSSystem { get; private set; }

        /// <summary>
        /// The buffer which holds the expression
        /// </summary>
        private char[] buffer;
        private char[] Buffer
        {
            get { return buffer; }
            set
            {
                buffer = value;
                Index = 0;
            }
        }

        /// <summary>
        /// The current index in the buffer
        /// </summary>
        private int index;
        private int Index
        {
            get { return index; }
            set { index = value; }
        }

        /// <summary>
        /// Skips white spaces, tab and new lines
        /// </summary>
        private void skipWhiteSpaces()
        {
            while (Index < Buffer.Length && Char.IsWhiteSpace(Buffer[index]))
            {
                Index = Index + 1;
            }
        }

        /// <summary>
        /// Provides the identifier at the current position
        /// </summary>
        /// <returns></returns>
        private string Identifier(bool acceptDot = false)
        {
            string retVal = null;

            skipWhiteSpaces();
            if (Index < Buffer.Length)
            {
                if (Char.IsLetter(Buffer[Index]) || Buffer[Index] == '_')
                {
                    int i = 1;

                    while (Index + i < Buffer.Length && (Char.IsLetterOrDigit(Buffer[Index + i]) ||
                                                         Buffer[Index + i] == '_' ||
                                                         (acceptDot && Buffer[Index + i] == '.')))
                    {
                        i = i + 1;
                    }

                    retVal = new String(Buffer, Index, i);
                    Index = Index + i;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the designator at position Index of the Buffer.
        /// </summary>
        /// <param name="root">The root element for which this designator is built</param>
        /// <returns>null if the element at position Index is not an identifier</returns>
        private Designator Designator()
        {
            Designator retVal = null;

            skipWhiteSpaces();
            string identifier = Identifier();
            if (identifier != null)
            {
                retVal = new Designator(Root, identifier);
            }

            return retVal;
        }

        /// <summary>
        /// Ensures that a signle string is at position index in the buffer
        /// </summary>
        /// <param name="expected">The expected string</param>
        /// <returns></returns>
        private bool LookAhead(string expected)
        {
            bool retVal = false;

            skipWhiteSpaces();
            int i = 0;
            while (Index + i < Buffer.Length && i < expected.Length)
            {
                if (expected[i].CompareTo(Buffer[Index + i]) != 0)
                {
                    return false;
                }
                i = i + 1;
            }
            retVal = i == expected.Length;

            char lastChar = expected[expected.Length - 1];
            if (retVal && (Char.IsLetterOrDigit(lastChar) || '_'.Equals(lastChar)))
            {
                // Ensure that the next character is not an identifier constituent
                // (=> is a separator)
                if (i < Buffer.Length)
                {
                    if (Char.IsLetterOrDigit(Buffer[Index + i]) || Buffer[Index + i] == '_')
                    {
                        retVal = false;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Ensures that one of the expected strings is at position index in the buffer
        /// </summary>
        /// <param name="expected">The expected string</param>
        /// <returns></returns>
        private string LookAhead(string[] expected)
        {
            foreach (string value in expected)
            {
                if (LookAhead(value))
                {
                    return value;
                }
            }
            return null;
        }

        /// <summary>
        /// Matches a single string in the buffer
        /// </summary>
        /// <param name="expected"></param>
        /// <returns></returns>
        private void Match(string expected)
        {
            if (LookAhead(expected))
            {
                Index = Index + expected.Length;
            }
            else
            {
                throw new ParseErrorException("Expecting " + expected);
            }
        }

        /// <summary>
        /// Evaluates the value of a literal
        /// </summary>
        /// <param name="designator">The designator currently parsed, if any</param>
        /// <param name="root">The root element for which this literal is built</param>
        /// <returns></returns>
        public Expression EvaluateLiteral()
        {
            Expression retVal = null;

            retVal = EvaluateString();
            if (retVal != null)
            {
                return retVal;
            }

            retVal = EvaluateInt();
            if (retVal != null)
            {
                return retVal;
            }

            retVal = EvaluateList();
            if (retVal != null)
            {
                return retVal;
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates the current input as a string
        /// </summary>
        /// <param name="root">The root element for which this string is built</param>
        /// <returns></returns>
        public StringExpression EvaluateString()
        {
            StringExpression retVal = null;
            int backup = Index;

            if (LookAhead("'"))
            {
                Match("'");
                int start = Index;
                while (!LookAhead("'") && Index < Buffer.Length)
                {
                    Index = Index + 1;
                }

                if (LookAhead("'"))
                {
                    Match("'");
                    retVal = new StringExpression(Root, new String(Buffer, start, Index - start - 1));
                }
                else
                {
                    Index = backup;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates the current input as a integer
        /// </summary>
        /// <returns></returns>
        public NumberExpression EvaluateInt()
        {
            NumberExpression retVal = null;

            int backup = Index;

            int len = 0;
            bool digitFound = false;
            Types.Type type = EFSSystem.IntegerType;

            if (Index < Buffer.Length && Buffer[Index] == '-')
            {
                len += 1;
            }
            while (Index + len < Buffer.Length && Char.IsDigit(Buffer[Index + len]))
            {
                digitFound = true;
                len = len + 1;
            }

            if (len > 0 && Index + len < Buffer.Length && Buffer[Index + len] == '.')
            {
                type = EFSSystem.DoubleType;
                len = len + 1;
                while (Index + len < Buffer.Length && Char.IsDigit(Buffer[Index + len]))
                {
                    len = len + 1;
                }
            }

            if (Index + len < Buffer.Length && Buffer[Index + len] == 'E')
            {
                type = EFSSystem.DoubleType;
                len = len + 1;
                while (Index + len < Buffer.Length && Char.IsDigit(Buffer[Index + len]))
                {
                    len = len + 1;
                }
            }

            if (digitFound)
            {
                string str = new String(Buffer, Index, len);
                retVal = new NumberExpression(Root, str, type);
                Index += len;
            }

            if (retVal == null)
            {
                Index = backup;
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates the current input as a list
        /// </summary>
        /// <param name="root">the root element for which this list is built</param>
        /// <returns></returns>
        public ListExpression EvaluateList()
        {
            ListExpression retVal = null;

            int backup = Index;
            if (LookAhead("["))
            {
                Match("[");
                List<Expression> list = new List<Expression>();
                Types.Type elementType = null;

                if (LookAhead("]"))
                {
                    Match("]");
                    retVal = new ListExpression(Root, list);
                }
                else
                {
                    bool cont = true;
                    while (cont)
                    {
                        Expression expression = Expression(0);
                        if (expression != null)
                        {
                            list.Add(expression);

                            if (LookAhead(","))
                            {
                                Match(",");
                                continue;
                            }
                            else if (LookAhead("]"))
                            {
                                Match("]");

                                retVal = new ListExpression(Root, list);
                                break;
                            }
                            else
                            {
                                Root.AddError("] expected");
                                break;
                            }
                        }
                        else
                        {
                            Root.AddError("Cannot parse expression");
                            break;
                        }
                    }
                }
            }

            if (retVal == null)
            {
                Index = backup;
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates the current input as a structure
        /// </summary>
        /// <returns></returns>
        public Expression EvaluateStructure()
        {
            StructExpression retVal = null;
            int backup = Index;

            Expression structureId = DerefExpression();
            if (structureId != null)
            {
                if (LookAhead("{"))
                {
                    Match("{");
                    Dictionary<string, Expression> associations = new Dictionary<string, Interpreter.Expression>();

                    if (LookAhead("}"))
                    {
                        Match("}");
                        retVal = new StructExpression(Root, structureId, associations);
                    }
                    else
                    {
                        while (true)
                        {
                            string id = Identifier();
                            if (id != null)
                            {
                                Match("=>");
                                Expression expression = Expression(0);
                                if (expression != null)
                                {
                                    associations[id] = expression;
                                }
                                else
                                {
                                    Root.AddError("Cannot parse expression after " + id + " => ");
                                    break;
                                }
                            }
                            else
                            {
                                if (Index < Buffer.Length)
                                {
                                    Root.AddError("Identifier expected, but found " + Buffer[Index]);
                                }
                                else
                                {
                                    Root.AddError("Identifier expected, but EOF found ");
                                }
                                break;
                            }
                            if (LookAhead(","))
                            {
                                Match(",");
                                continue;
                            }
                            else if (LookAhead("}"))
                            {
                                Match("}");
                                retVal = new StructExpression(Root, structureId, associations);
                                break;
                            }
                            else
                            {
                                if (Index < Buffer.Length)
                                {
                                    Root.AddError(", or } expected, but found " + Buffer[Index]);
                                }
                                else
                                {
                                    Root.AddError(", or } expected, but EOF found ");
                                }
                                break;
                            }

                        }
                    }
                }
            }

            if (retVal == null)
            {
                Index = backup;
            }

            return retVal;
        }

        /// <summary>
        /// Creates a redef expression based on the input of the parser
        /// </summary>
        /// <returns></returns>
        private Expression DerefExpression()
        {
            Expression retVal = null;

            List<Expression> derefArguments = new List<Expression>();
            string id = Identifier();
            while (id != null)
            {
                Designator designator = new Interpreter.Designator(Root, id);
                Term term = new Term(Root, designator);
                UnaryExpression unaryExpression = new UnaryExpression(Root, term);
                derefArguments.Add(unaryExpression);

                id = null;
                if (LookAhead("."))
                {
                    Match(".");
                    id = Identifier();
                }
            }

            if (derefArguments.Count == 1)
            {
                retVal = derefArguments[0];
            }
            else if (derefArguments.Count > 1)
            {
                retVal = new DerefExpression(Root, derefArguments);
            }

            return retVal;
        }

        /// <summary>
        /// Creates a redef expression based on the input of the parser
        /// </summary>
        /// <returns></returns>
        public Expression DerefExpression(ModelElement root, string expression)
        {
            Buffer = expression.ToCharArray();
            Root = root;

            return DerefExpression();
        }

        /// <summary>
        /// Provides the Term at position Index of the Buffer.        
        /// </summary>
        /// <param name="root">The root element for which this term is built</param>
        /// <returns></returns>
        public Term Term()
        {
            Term retVal = null;

            bool performLog = ModelElement.PerformLog;
            try
            {
                ModelElement.PerformLog = false;
                Expression literalValue = EvaluateLiteral();
                if (literalValue != null)
                {
                    retVal = new Term(Root, literalValue);
                }

                if (retVal == null)
                {
                    Designator designator = Designator();
                    if (designator != null)
                    {
                        retVal = new Term(Root, designator);
                    }
                }
            }
            finally
            {
                ModelElement.PerformLog = performLog;
            }

            return retVal;
        }

        /// <summary>
        /// Finds a value in a list of values
        /// </summary>
        /// <param name="val">The value to find</param>
        /// <param name="list">The list of values to evaluate</param>
        /// <returns></returns>
        private bool FindInList(IValue val, ListValue list)
        {
            bool retVal = false;

            foreach (Value value in list.Val)
            {
                if (val == value)
                {
                    retVal = true;
                    break;
                }
            }

            return retVal;
        }



        private const int DOT_CONTINUATION = 7;

        /// <summary>
        /// Provides the parse tree associated to the expression stored in the buffer
        /// </summary>
        /// <param name="expressionLevel">the current level of the expression</param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        /// <returns></returns>
        private Expression Expression(int expressionLevel)
        {
            Expression retVal = null;

            switch (expressionLevel)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    ///
                    /// Binary expressions
                    ///
                    retVal = Expression(expressionLevel + 1);
                    if (retVal != null)
                    {
                        retVal = ExpressionContinuation(expressionLevel, retVal);
                    }
                    break;

                case 6:
                    // Continuation, either by . operator, or by function call
                    retVal = Continuation(Expression(expressionLevel + 1));
                    break;

                case 7:
                    ///
                    /// List operations
                    /// 
                    retVal = EvaluateListExpression();
                    if (retVal == null)
                    {
                        ////
                        /// Unary expressions
                        /// 
                        retVal = EvaluateUnaryExpression();
                    }
                    break;
            }

            return retVal;
        }

        /// <summary>
        /// Implements the following grammar rules
        /// Expression_iCont -> {op_i+1} Expression_i+1 Expression_iCont
        /// Expression_iCont -> Epsilon
        /// </summary>
        /// <param name="expressionLevel">the current level of the expression</param>
        /// <param name="expressionLeft">the left part of the current expression</param>
        /// <param name="enclosing">the root element for which this expression should be parsed</param>
        /// <returns></returns>
        private Expression ExpressionContinuation(int expressionLevel, Expression expressionLeft)
        {
            Expression retVal = expressionLeft;

            string[] operators = BinaryExpression.Images(BinaryExpression.OperatorsByLevel[expressionLevel]);
            string op = LookAhead(operators);
            if (op != null && op.CompareTo("<") == 0)
            {
                // Avoid <- to be confused with < -1
                if (Index < Buffer.Length - 1 && Buffer[Index + 1] == '-')
                {
                    op = null;
                }
            }

            if (op != null) // Expression_iCont -> {op_i+1} Expression_i+1 Expression_iCont
            {
                Match(op);
                BinaryExpression.OPERATOR oper = BinaryExpression.FindOperatorByName(op);
                Expression expressionRight = Expression(expressionLevel + 1);
                if (expressionRight != null)
                {
                    retVal = new BinaryExpression(Root, expressionLeft, oper, expressionRight);  // {op_i+1} Expression_i+1
                    retVal = ExpressionContinuation(expressionLevel, retVal);  // Expression_iCont
                }
            }

            return retVal;
        }

        /// <summary>
        /// The continuation operators
        /// </summary>
        private static string[] CONTINUATION_OPERATORS = new string[] { ".", "(" };

        /// <summary>
        /// Implements the dot continuation or the function call continuation
        /// </summary>
        /// <param name="expressionLevel">the level of the right expression</param>
        /// <param name="expressionLeft">the left part of the current expression</param>
        /// <returns></returns>
        private Expression Continuation(Expression expressionLeft)
        {
            Expression current = expressionLeft;
            int first = Index;

            List<Expression> derefArguments = new List<Expression>();
            while (!Utils.Utils.isEmpty(LookAhead(CONTINUATION_OPERATORS)))
            {
                List<Expression> tmp = new List<Expression>();
                while (LookAhead("."))
                {
                    if (current != null)
                    {
                        tmp.Add(current);
                    }
                    else
                    {
                        string invalidDeref = expressionLeft + (new String(Buffer).Substring(first, Index - first));
                        Root.AddWarning("Invalid deref expression for [" + invalidDeref + "] skipping empty dereference");
                    }
                    Match(".");
                    current = Expression(7);
                }
                if (tmp.Count > 0)
                {
                    if (current != null)
                    {
                        tmp.Add(current);
                    }
                    else
                    {
                        string invalidDeref = expressionLeft + (new String(Buffer).Substring(first, Index - first));
                        Root.AddWarning("Invalid deref expression for [" + invalidDeref + "] skipping empty dereference");
                    }
                    current = new DerefExpression(Root, tmp);
                }

                while (LookAhead("("))
                {
                    current = EvaluateFunctionCallExpression(current);
                }
            }

            if (derefArguments.Count > 0)
            {
                derefArguments.Add(current);
                current = new DerefExpression(Root, derefArguments);
            }

            return current;
        }

        /// <summary>
        /// Evaluates a function call, when the left part (function identification) has been parsed
        /// </summary>
        /// <param name="left">The left part of the function call expression</param>
        /// <returns></returns>
        private Expression EvaluateFunctionCallExpression(Expression left)
        {
            Call retVal = null;
            int current = Index;

            skipWhiteSpaces();
            if (LookAhead("("))
            {
                retVal = new Call(Root, left);
                Match("(");
                bool cont = true;
                while (cont)
                {
                    skipWhiteSpaces();
                    if (LookAhead(")"))
                    {
                        Match(")");
                        cont = false;
                    }
                    else
                    {
                        // Handle named parameters
                        int current2 = Index;
                        string id = Identifier();
                        if (id != null)
                        {
                            if (LookAhead("=>"))
                            {
                                Match("=>");
                            }
                            else
                            {
                                id = null;
                                Index = current2;
                            }
                        }

                        Expression arg = Expression(0);
                        if (arg != null)
                        {
                            retVal.AddActualParameter(id, arg);
                            if (LookAhead(","))
                            {
                                Match(",");
                            }
                            else if (LookAhead(")"))
                            {
                                Match(")");
                                cont = false;
                            }
                        }
                        else
                        {
                            throw new ParseErrorException("Syntax error");
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates a list expression
        /// </summary>
        /// <returns></returns>
        private Expression EvaluateListExpression()
        {
            Expression retVal = null;

            string listOp = LookAhead(ListOperators.ListOperatorExpression.LIST_OPERATORS);
            if (listOp != null)
            {
                Match(listOp);
                Expression listExpression = Expression(0);

                Expression condition = null;
                if (LookAhead("|"))
                {
                    Match("|");
                    condition = Expression(0);
                }

                if (listOp.CompareTo(ListOperators.MapExpression.OPERATOR) == 0
                    || listOp.CompareTo(ListOperators.ReduceExpression.OPERATOR) == 0
                    || listOp.CompareTo(ListOperators.SumExpression.OPERATOR) == 0)
                {
                    Match("USING");
                    Expression iteratorExpression = Expression(0);
                    if (iteratorExpression != null)
                    {
                        if (ListOperators.MapExpression.OPERATOR.CompareTo(listOp) == 0)
                        {
                            retVal = new ListOperators.MapExpression(Root, listExpression, condition, iteratorExpression);
                        }
                        else if (ListOperators.SumExpression.OPERATOR.CompareTo(listOp) == 0)
                        {
                            retVal = new ListOperators.SumExpression(Root, listExpression, condition, iteratorExpression);
                        }
                        else if (ListOperators.ReduceExpression.OPERATOR.CompareTo(listOp) == 0)
                        {
                            Match("INITIAL_VALUE");
                            Expression initialValue = Expression(0);
                            if (initialValue != null)
                            {
                                retVal = new ListOperators.ReduceExpression(Root, listExpression, condition, iteratorExpression, initialValue);
                            }
                            else
                            {
                                throw new ParseErrorException("REDUCE requires an initial value");
                            }
                        }
                    }
                    else
                    {
                        throw new ParseErrorException("Function designator expected");
                    }
                }
                else
                {
                    // Create the right class for this list operation
                    if (ListOperators.ThereIsExpression.OPERATOR.CompareTo(listOp) == 0)
                    {
                        retVal = new ListOperators.ThereIsExpression(Root, listExpression, condition);
                    }
                    else if (ListOperators.ForAllExpression.OPERATOR.CompareTo(listOp) == 0)
                    {
                        retVal = new ListOperators.ForAllExpression(Root, listExpression, condition);
                    }
                    else if (ListOperators.FirstExpression.OPERATOR.CompareTo(listOp) == 0)
                    {
                        retVal = new ListOperators.FirstExpression(Root, listExpression, condition);
                    }
                    else if (ListOperators.LastExpression.OPERATOR.CompareTo(listOp) == 0)
                    {
                        retVal = new ListOperators.LastExpression(Root, listExpression, condition);
                    }
                    else if (ListOperators.CountExpression.OPERATOR.CompareTo(listOp) == 0)
                    {
                        retVal = new ListOperators.CountExpression(Root, listExpression, condition);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates a unary expression
        ///  . NOT expression
        ///  . Term
        /// </summary>
        /// <param name="enclosing"></param>
        /// <returns></returns>
        private Expression EvaluateUnaryExpression()
        {
            Expression retVal = null;

            string unaryOp = LookAhead(UnaryExpression.UNARY_OPERATORS);
            if (unaryOp != null)
            {
                Match(unaryOp);
                Expression expression = Expression(6);
                retVal = new UnaryExpression(Root, expression, unaryOp);
            }
            else
            {
                if (LookAhead("STABILIZE"))
                {
                    Match("STABILIZE");
                    Expression expression = Expression(0);
                    Match("INITIAL_VALUE");
                    Expression initialValue = Expression(0);
                    Match("STOP_CONDITION");
                    Expression condition = Expression(0);

                    retVal = new StabilizeExpression(Root, expression, initialValue, condition);
                }
                else
                {
                    retVal = EvaluateStructure();
                    if (retVal == null)
                    {
                        retVal = EvaluateFunction();
                    }
                    if (retVal == null)
                    {
                        Term term = Term();
                        if (term != null)
                        {
                            retVal = new UnaryExpression(Root, term);
                        }
                        else if (LookAhead("("))
                        {
                            Match("(");
                            retVal = new UnaryExpression(Root, Expression(0));
                            Match(")");

                            if (retVal != null)
                            {
                                retVal = Continuation(retVal);
                            }
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates a function declaration expression
        /// </summary>
        /// <returns></returns>
        private FunctionExpression EvaluateFunction()
        {
            FunctionExpression retVal = null;
            int current = Index;

            if (LookAhead("FUNCTION"))
            {
                List<Parameter> parameters = new List<Parameter>();
                bool cont = true;
                Match("FUNCTION");
                while (cont)
                {
                    string id = Identifier();
                    if (id != null)
                    {
                        skipWhiteSpaces();
                        Match(":");
                        skipWhiteSpaces();
                        string typeName = Identifier(true);
                        if (typeName != null)
                        {
                            Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
                            parameter.Name = id;
                            parameter.TypeName = typeName;
                            parameters.Add(parameter);
                        }
                        else
                        {
                            throw new ParseErrorException("Parameter type expected");
                        }
                    }
                    else
                    {
                        throw new ParseErrorException("Parameter identifier expected");
                    }

                    cont = LookAhead(",");
                    if (cont)
                    {
                        Match(",");
                    }
                }

                skipWhiteSpaces();
                Match("=>");
                Expression expression = Expression(0);
                if (expression != null)
                {
                    retVal = new FunctionExpression(Root, parameters, expression);
                }
                else
                {
                    throw new ParseErrorException("Function expression expected");
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parse tree according to the expression provided
        /// </summary>
        /// <param name="root">the element for which this expression should be parsed</param>
        /// <param name="expression"></param>
        /// <returns></returns>
        public Expression Expression(ModelElement root, string expression)
        {
            Expression retVal = null;

            Root = root;
            Buffer = expression.ToCharArray();
            retVal = Expression(0);

            skipWhiteSpaces();
            if (Index != Buffer.Length)
            {
                retVal = null;
                if (Index < Buffer.Length)
                {
                    Root.AddError("End of expression expected, but found " + Buffer[Index]);
                }
                else
                {
                    Root.AddError("End of expression expected, but found EOF");
                }
            }
            if (retVal != null)
            {
                retVal.SemanticAnalysis(Filter.IsVariableOrValue);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the Term at position Index of the Buffer.        
        /// </summary>
        /// <param name="root">The root element for which this term is built</param>
        /// <returns></returns>
        private Statement.Statement Statement(ModelElement root)
        {
            Statement.Statement retVal = null;

            Root = root;
            if (LookAhead("APPLY"))
            {
                Match("APPLY");
                Call callExpression = Expression(0) as Call;
                if (callExpression != null)
                {
                    Statement.ProcedureCallStatement call = new Statement.ProcedureCallStatement(root, callExpression);
                    Match("ON");
                    Expression listExpression = Expression(0);
                    retVal = new Statement.ApplyStatement(root, call, listExpression);
                }
                else
                {
                    Root.AddError("Cannot parse call expression");
                }
            }
            else if (LookAhead("INSERT"))
            {
                Match("INSERT");
                Expression value = Expression(0);
                if (value != null)
                {
                    Match("IN");
                    Expression list = Expression(0);
                    Expression replaceElement = null;
                    if (LookAhead("WHEN"))
                    {
                        Match("WHEN");
                        Match("FULL");
                        Match("REPLACE");

                        replaceElement = Expression(0);
                    }
                    retVal = new Statement.InsertStatement(root, value, list, replaceElement);
                }
            }
            else if (LookAhead("REMOVE"))
            {
                Match("REMOVE");

                Statement.RemoveStatement.PositionEnum position = Interpreter.Statement.RemoveStatement.PositionEnum.First;
                if (LookAhead("FIRST"))
                {
                    Match("FIRST");
                }
                else if (LookAhead("LAST"))
                {
                    Match("LAST");
                    position = Interpreter.Statement.RemoveStatement.PositionEnum.Last;
                }
                else if (LookAhead("ALL"))
                {
                    Match("ALL");
                    position = Interpreter.Statement.RemoveStatement.PositionEnum.All;
                }

                Expression condition = null;
                if (!LookAhead("IN"))
                {
                    condition = Expression(0);
                }
                Match("IN");
                Expression list = Expression(0);
                retVal = new Statement.RemoveStatement(root, condition, position, list);
            }
            else if (LookAhead("REPLACE"))
            {
                Match("REPLACE");
                Expression condition = Expression(0);
                Match("IN");
                Expression list = Expression(0);
                Match("BY");
                Expression value = Expression(0);

                retVal = new Statement.ReplaceStatement(root, value, list, condition);
            }
            else
            {
                Expression expression = Expression(0);
                if (expression != null)
                {
                    if (LookAhead("<-"))
                    {
                        // This is a variable update
                        Match("<-");
                        if (LookAhead("%"))
                        {
                            Match("%");
                        }
                        Expression expression2 = Expression(0);

                        if (expression2 != null)
                        {
                            retVal = new Statement.VariableUpdateStatement(root, expression, expression2);
                        }
                        else
                        {
                            Root.AddError("Invalid <- right side");
                        }
                        expression.Enclosing = retVal;
                    }
                    else
                    {
                        // This is a procedure call
                        Call call = expression as Call;
                        if (call != null)
                        {
                            retVal = new Statement.ProcedureCallStatement(root, call);
                        }
                        else
                        {
                            Root.AddError("Cannot parse call expression");
                        }
                    }
                }
                else
                {
                    Root.AddError("Cannot parse expression");
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parse tree according to the statement provided
        /// </summary>
        /// <param name="root">the element for which this statemennt should be parsed</param>
        /// <param name="expression"></param>
        /// <returns></returns>
        public Statement.Statement Statement(ModelElement root, string expression)
        {
            Statement.Statement retVal = null;

            Root = root;
            Buffer = expression.ToCharArray();
            retVal = Statement(root);

            skipWhiteSpaces();
            if (Index != Buffer.Length)
            {
                if (Index < Buffer.Length)
                {
                    throw new ParseErrorException("End of statement expected at " + Index + ", but found " + Buffer[Index]);
                }
            }

            if (retVal != null)
            {
                retVal.SemanticAnalysis();
            }

            return retVal;
        }


        /// <summary>
        /// Evaluates a term based on a string representation of that term
        /// </summary>
        /// <param name="root"></param>
        /// <param name="expression"></param>
        /// <returns></returns>
        internal Interpreter.Term Term(ModelElement root, string expression)
        {
            Term retVal = null;

            Root = root;
            Buffer = expression.ToCharArray();
            retVal = Term();

            return retVal;
        }
    }
}
