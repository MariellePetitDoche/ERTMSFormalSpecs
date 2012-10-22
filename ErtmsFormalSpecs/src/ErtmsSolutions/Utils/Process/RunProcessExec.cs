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
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Threading;

namespace ErtmsSolutions.Utils.RunProcessExec
{
    /**
     * This class permit to run a process.
     *
     */
    public class RunProcessExec
    {
        /*****************************************************************/
        /* This is an (invalid) attempt to fix the 'losing of focus' when
           Gnupliot is involed on certain machines.
           The idea is to lock the focus before creating the new process
               LockSetForegroundWindow (LSFW_LOCK);
           and unlocking it afterwards.
               LockSetForegroundWindow (LSFW_UNLOCK);
           Doesn's work. WTF !
        *****************************************************************/
        // [DllImport("user32.dll"), SuppressUnmanagedCodeSecurity]
        // [return: MarshalAs(UnmanagedType.Bool)]
        // private static extern bool LockSetForegroundWindow(uint uLockCode);
        // private static readonly uint LSFW_LOCK = 1;
        // private static readonly uint LSFW_UNLOCK = 2;


        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);


        private string WorkingDirectory;
        private string Path;
        private string Program;
        private string Arguments;
        private string FName_StandardInput;
        private string FName_StandardOutput;
        private string FName_StandardError;
        private TimeSpan TimeOut;

        private StreamReader stdin = null;
        private StreamWriter stdout = null;
        private StreamWriter stderr = null;


        private bool processHasExited;

        /**
         * The constructor
         *
         * @param Path The process path
         * @param Program The process name
         * @param Arguments The arguments to add to the process
         *                  execution
         * @param FName_StandardInput File where to redirect the input
         * @param FName_StandardOutput File where to redirect the ouput
         * @param FName_StandardError File where to redirect the errors
         * @param TimeOut The maximum time before to kill the process,
         *                if TimeOut si null then the process run
         *                infinitely
         *
         */
        public RunProcessExec(string WorkingDirectory, string Path, string Program, string Arguments, string FName_StandardInput, string FName_StandardOutput, string FName_StandardError, TimeSpan TimeOut)
        {
            processHasExited = false;

            this.Path = Path;
            this.Program = Program;
            this.Arguments = Arguments;
            this.FName_StandardInput = FName_StandardInput;
            this.FName_StandardOutput = FName_StandardOutput;
            this.FName_StandardError = FName_StandardError;
            this.TimeOut = TimeOut;
            this.WorkingDirectory = WorkingDirectory;
        }

        private string Quoted(string filename)
        {
            if (filename.IndexOf(' ') != -1)
                return '"' + filename + '"';
            else
                return filename;
        }

        /** An enum that defines the differents state of the process
         *   */
        public enum ProcessExecResult_Enum
        {
            OK,/**< The process finished correctly*/
            Error,/**< An error occurs when the process started whit ProcessStartInfo*/
            TimeOut/**< The process runs longer than the time out define by the user*/
        }

        /**A struct that defines the state of the process, its exit
         * code and message */
        public struct ProcessExecResult_Struct
        {
            public ProcessExecResult_Enum ExecResult; /**< Define the process ExecResult */
            public int ExitCode; /**< The process exit code if it finished correctly*/
            public string Message;/**< The message concerning the ExecResult*/
        }


        private void StdOutputHandler(object sendingProcess, DataReceivedEventArgs outLine)
        {
            if (!String.IsNullOrEmpty(outLine.Data))
            {
                if (stdout != null)
                {
                    stdout.WriteLine(outLine.Data);
                }
                else
                {
                    Log.WarnFormat("Output not written in the file because it's closed : {0}", outLine.Data);
                }
            }

        }

        private void StdErrorHandler(object sendingProcess, DataReceivedEventArgs outLine)
        {
            if (!String.IsNullOrEmpty(outLine.Data))
            {
                if (stderr != null)
                {
                    stderr.WriteLine(outLine.Data);
                }
                else
                {
                    Log.WarnFormat("Error not written in the file because it's closed : {0}", outLine.Data);
                }
            }
        }


        /**
         *
         * @return ProcessExecResult_Struct
         */
        public ProcessExecResult_Struct StartAndWait()
        {
            ProcessExecResult_Struct result = new ProcessExecResult_Struct();
            TimeSpan ElapsedTime;

            Process p = new Process();

            p.StartInfo.Arguments = Arguments;
            p.StartInfo.FileName = Quoted(System.IO.Path.Combine(Path.Replace('/', '\\'), Program.Replace('/', '\\')));
            p.StartInfo.WorkingDirectory = Quoted(WorkingDirectory.Replace('/', '\\'));
            p.StartInfo.CreateNoWindow = true;
            p.StartInfo.UseShellExecute = false;
            //p.StartInfo.WindowStyle       = System.Diagnostics.ProcessWindowStyle.Hidden;

            if (FName_StandardOutput != null)
            {
                p.StartInfo.RedirectStandardOutput = true;
                p.OutputDataReceived += new DataReceivedEventHandler(StdOutputHandler);
                stdout = new StreamWriter(FName_StandardOutput);
            }
            if (FName_StandardError != null)
            {
                p.StartInfo.RedirectStandardError = true;
                p.ErrorDataReceived += new DataReceivedEventHandler(StdErrorHandler);
                stderr = new StreamWriter(FName_StandardError);
            }
            if (FName_StandardInput != null)
            {
                p.StartInfo.RedirectStandardInput = true;
                stdin = new StreamReader(FName_StandardInput);
            }

            if (Log.IsDebugEnabled)
            {
                Log.DebugFormat("ErtmsSolutions.WorkingDirectory           = '{0}'", WorkingDirectory);
                Log.DebugFormat("ErtmsSolutions.Path                       = '{0}'", Path);
                Log.DebugFormat("ErtmsSolutions.Program                    = '{0}'", Program);
                Log.DebugFormat("ErtmsSolutions.Arguments                  = '{0}'", Arguments);
                Log.DebugFormat("ErtmsSolutions.StdIn                      = '{0}'", FName_StandardInput);
                Log.DebugFormat("ErtmsSolutions.StdOut                     = '{0}'", FName_StandardOutput);
                Log.DebugFormat("ErtmsSolutions.StdErr                     = '{0}'", FName_StandardError);
                Log.DebugFormat("ErtmsSolutions.Timeout                    = '{0}'", TimeOut);

                Log.DebugFormat("p.StartInfo.Arguments                     = '{0}'", p.StartInfo.Arguments);
                Log.DebugFormat("p.StartInfo.FileName                      = '{0}'", p.StartInfo.FileName);
                Log.DebugFormat("p.StartInfo.WorkingDirectory              = '{0}'", p.StartInfo.WorkingDirectory);
                Log.DebugFormat("p.StartInfo.CreateNoWindow                = '{0}'", p.StartInfo.CreateNoWindow);
                Log.DebugFormat("p.StartInfo.UseShellExecute               = '{0}'", p.StartInfo.UseShellExecute);
                Log.DebugFormat("p.StartInfo.RedirectStandardOutput        = '{0}'", p.StartInfo.RedirectStandardOutput);
                Log.DebugFormat("p.StartInfo.RedirectStandardError         = '{0}'", p.StartInfo.RedirectStandardError);
                Log.DebugFormat("p.StartInfo.RedirectStandardInput         = '{0}'", p.StartInfo.RedirectStandardInput);
            }

            // LockSetForegroundWindow (LSFW_LOCK);
            try
            {
                p.Start();
                result.ExecResult = ProcessExecResult_Enum.OK;
                result.ExitCode = 0;
                Log.DebugFormat("  Process started.");
            }
            catch (InvalidOperationException e)
            {
                result.ExitCode = 0;
                result.ExecResult = ProcessExecResult_Enum.Error;
                result.Message = e.ToString();
            }
            catch (Win32Exception e)
            {
                result.ExitCode = 0;
                result.ExecResult = ProcessExecResult_Enum.Error;
                result.Message = e.ToString();
            }

            if (result.ExecResult == ProcessExecResult_Enum.OK)
            {
                if (FName_StandardOutput != null)
                    p.BeginOutputReadLine();
                if (FName_StandardError != null)
                    p.BeginErrorReadLine();

                if (stdin != null)
                {
                    p.StandardInput.WriteLine(stdin.ReadToEnd());
                    p.StandardInput.Close();
                }


                do
                {
                    ElapsedTime = DateTime.Now - p.StartTime;

                    if (p.HasExited)
                    {
                        Log.DebugFormat("  Processs has exited");
                        result.ExecResult = ProcessExecResult_Enum.OK;
                        result.ExitCode = p.ExitCode;
                        result.Message = "terminated";
                        this.processHasExited = true;
                        break;
                    }

                    if (TimeOut.TotalMilliseconds > 0.0)
                    {
                        if (ElapsedTime > TimeOut)
                        {
                            Log.DebugFormat("  Killing process because of timeout {0}.", ElapsedTime);
                            p.Kill();
                            result.Message = "Time out";
                            result.ExecResult = ProcessExecResult_Enum.TimeOut;
                            this.processHasExited = true;
                            break;
                        }
                    }
                    Thread.Sleep(20/*ms*/);

                } while (true);
            }


            if (stdout != null)
            {
                try
                {
                    p.CancelOutputRead();
                }
                catch (Exception)
                {
                }
                stdout.Close();
                //Set to null to verify if the file is opened yet while it is receiving an Output event
                stdout = null;
            }
            if (stderr != null)
            {
                try
                {
                    p.CancelErrorRead();
                }
                catch (Exception)
                {
                }
                stderr.Close();
                //Set to null to verify if the file is opened yet while it is receiving an Error event
                stderr = null;
            }

            // LockSetForegroundWindow (LSFW_UNLOCK);

            Log.DebugFormat("  Process result : Result={0} ('{1}'), ExitCode={2}", result.ExecResult, result.Message, result.ExitCode);

            return result;
        }

        public bool ProcessFinished
        {
            get { return processHasExited; }

        }
    }
}
