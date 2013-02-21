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
namespace DataDictionary
{
    using Utils;

    public static class Filter
    {
        /// <summary>
        /// Predicate which indicates whether the namable provided matches the expectation for the semantic analysis
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public delegate bool AcceptableChoice(INamable value);

        /// <summary>
        /// Predicate which indicates that all namables match
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool AllMatches(INamable value)
        {
            return true;
        }

        /// <summary>
        /// Predicates which indicates that the namable is either a variable or a value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsVariable(INamable value)
        {
            return value is Variables.IVariable;
        }

        /// <summary>
        /// Predicates which indicates that the namable is either a variable or a value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsValue(INamable value)
        {
            return value is Values.IValue;
        }

        /// <summary>
        /// Predicates which indicates that the namable is either a variable or a value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsVariableOrValue(INamable value)
        {
            return IsVariable(value) || IsValue(value);
        }

        /// <summary>
        /// Predicates which indicates that the namable is a typed element
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsTypedElement(INamable value)
        {
            return value is Types.ITypedElement;
        }

        /// <summary>
        /// Predicates which indicates that the namable is a typed element
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsLeftSide(INamable value)
        {
            return IsVariableOrValue(value) || value is Types.StructureElement;
        }

        /// <summary>
        /// Predicates which indicates that the namable is a structure type
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsStructure(INamable value)
        {
            return value is Types.Structure;
        }

        /// <summary>
        /// Predicate which indicates that the namable can be called
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool IsCallable(INamable value)
        {
            return (value is Interpreter.ICallable) || (value is Types.Range);
        }
    }
}
