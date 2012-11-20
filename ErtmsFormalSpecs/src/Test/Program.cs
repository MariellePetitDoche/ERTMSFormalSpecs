using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace test
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Subset26.Subset26 specs;
            RuleBase.RuleSet ruleBase;
            DataDictionary.Dictionnary dictionnary;

            specs = Subset26.Util.load ( "e:\\yafl\\ERTMS\\ErtmsFormalSpecs\\subset-026-xml\\subset-026_formatted.xml" );
            ruleBase = RuleBase.Util.load ( "E:\\yafl\\ERTMS\\ErtmsFormalSpecs\\prototype\\src\\ertmsspecs\\rules.xml", specs );
            dictionnary = DataDictionary.Util.load("E:\\yafl\\ERTMS\\ErtmsFormalSpecs\\prototype\\src\\ertmsspecs\\data_dictionnary.xml");

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
