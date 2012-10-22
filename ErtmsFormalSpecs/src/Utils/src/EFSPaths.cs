using System;
using System.IO;
using System.Reflection;
using System.Windows.Forms;
using ErtmsSolutions.Utils.ApplicationPaths;


namespace Utils
{
    public class EFSPaths : ApplicationPaths
    {

        public static void Initialize()
        {
            string BinPath = Path.GetDirectoryName(Application.ExecutablePath);

            /* Remove the trailing '/bin' */
            string BasePath = BinPath.Substring(0, BinPath.Length - 4);

            EFSPaths.SetAbsoluteBasePath(BasePath);
            EFSPaths.SetRelativeBinPath("bin");
            EFSPaths.SetAbsoluteDataPath(Path.Combine(BasePath, "data"));
        }

    }
}
