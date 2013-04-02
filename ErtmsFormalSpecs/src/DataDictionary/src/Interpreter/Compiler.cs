// -----------------------------------------------------------------------
// <copyright file="Compiler.cs" company="">
// TODO: Update copyright text.
// </copyright>
// -----------------------------------------------------------------------

namespace DataDictionary.Interpreter
{

    /// <summary>
    /// Compiles all expressions and statements located in the model & tests
    /// </summary>
    public class Compiler : Generated.Visitor
    {
        /// <summary>
        /// Indicates that everything should be recompiled
        /// </summary>
        public bool Rebuild { get; set; }

        /// <summary>
        /// The EFS system that need to be compiled
        /// </summary>
        public EFSSystem System { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="rebuild"></param>
        public Compiler(EFSSystem system, bool rebuild = false)
        {
            Rebuild = rebuild;
            System = system;
        }

        #region Compilation
        /// <summary>
        /// Compiles or recompiles everything
        /// </summary>
        public void Compile()
        {
            foreach (DataDictionary.Dictionary dictionary in System.Dictionaries)
            {
                visit(dictionary, true);
            }
        }

        public override void visit(Generated.Action obj, bool visitSubNodes)
        {
            Rules.Action action = (Rules.Action)obj;

            if (Rebuild)
            {
                action.Statement = null;
            }

            // Side effect : compiles or recompiles the statement
            DataDictionary.Interpreter.Statement.Statement statement = action.Statement;

            base.visit(obj, visitSubNodes);
        }

        public override void visit(Generated.PreCondition obj, bool visitSubNodes)
        {
            Rules.PreCondition preCondition = (Rules.PreCondition)obj;

            if (Rebuild)
            {
                preCondition.ExpressionTree = null;
            }

            // Side effect : compiles or recompiles the expression
            DataDictionary.Interpreter.Expression expression = preCondition.ExpressionTree;

            base.visit(obj, visitSubNodes);
        }

        public override void visit(Generated.Expectation obj, bool visitSubNodes)
        {
            Tests.Expectation expectation = (Tests.Expectation)obj;

            if (Rebuild)
            {
                expectation.ExpressionTree = null;
            }

            // Side effect : compiles or recompiles the expression
            DataDictionary.Interpreter.Expression expression = expectation.ExpressionTree;

            base.visit(obj, visitSubNodes);
        }
        #endregion
    }
}
