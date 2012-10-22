using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Utils
{
    public interface IAction
    {
        /// <summary>
        /// The variable on which the action is executed
        /// </summary>
        string Variable
        {
            get;
        }

        /// <summary>
        /// The expression to be assigned to the variable
        /// </summary>
        string Expression
        {
            get;
        }
    }
}
