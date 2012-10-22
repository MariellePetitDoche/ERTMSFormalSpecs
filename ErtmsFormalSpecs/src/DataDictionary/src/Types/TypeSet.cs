using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DataDictionary.Types
{
    public class NameSpace : Generated.NameSpace
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public NameSpace() : base()
        {
        }

        /// <summary>
        /// The ranges types
        /// </summary>
        public System.Collections.ArrayList Ranges
        {
            get
            {
                if (allRanges() == null)
                {
                    setAllRanges(new System.Collections.ArrayList());
                }
                return allRanges();
            }
        }

        /// <summary>
        /// The enumeration types
        /// </summary>
        public System.Collections.ArrayList Enumerations
        {
            get
            {
                if (allEnumerations() == null)
                {
                    setAllEnumerations(new System.Collections.ArrayList());
                }
                return allEnumerations();
            }
        }

        /// <summary>
        /// The structure types
        /// </summary>
        public System.Collections.ArrayList Structures
        {
            get
            {
                if (allStructures() == null)
                {
                    setAllStructures(new System.Collections.ArrayList());
                }
                return allStructures();
            }
        }


        /// <summary>
        /// The collection types
        /// </summary>
        public System.Collections.ArrayList Collections
        {
            get
            {
                if (allCollections() == null)
                {
                    setAllCollections(new System.Collections.ArrayList());
                }
                return allCollections();
            }
        }


        /// <summary>
        /// The functions
        /// </summary>
        public System.Collections.ArrayList Functions
        {
            get
            {
                if (allFunctions() == null)
                {
                    setAllFunctions(new System.Collections.ArrayList());
                }
                return allFunctions();
            }
        }

        /// <summary>
        /// The types in the dictionary
        /// </summary>
        public HashSet<Type> DefinedTypes
        {
            get { return TypeFinder.INSTANCE.find(this); }
        }

        /// <summary>
        /// Provides the type which corresponds to the given name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Type findTypeByName(string name)
        {
            return (Type)Utils.INamableUtils.findByName(name, DefinedTypes);
        }
    }
}
