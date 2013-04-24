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
using System.Drawing;
using System.IO;
using System.Windows.Forms;
using DataDictionary;
using DataDictionary.Functions;
using DataDictionary.Interpreter;
using ErtmsSolutions.Etcs.Subset26.BrakingCurves;
using ErtmsSolutions.SiUnits;

namespace GUI.GraphView
{
    public partial class GraphView : Form, IBaseForm
    {
        /// <summary>
        /// The functions to be displayed in this graph view
        /// </summary>
        public List<DataDictionary.Functions.Function> Functions { get; set; }

        /// <summary>
        /// The bitmap as proposed by gnuplot
        /// </summary>
        private Bitmap OriginalBitmap { get; set; }

        /// <summary>
        /// The bitmap sized for the picture box
        /// </summary>
        private Bitmap SizedBitmap { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public GraphView()
        {
            InitializeComponent();
            FormClosed += new FormClosedEventHandler(GraphView_FormClosed);
            SizeChanged += new EventHandler(GraphView_SizeChanged);

            AllowDrop = true;
            DragEnter += new DragEventHandler(GraphView_DragEnter);
            DragDrop += new DragEventHandler(GraphView_DragDrop);

            Functions = new List<DataDictionary.Functions.Function>();
        }

        void GraphView_DragEnter(object sender, DragEventArgs e)
        {
            e.Effect = DragDropEffects.Move;
        }

        void GraphView_DragDrop(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent("WindowsForms10PersistentObject", false))
            {
                BaseTreeNode SourceNode = (BaseTreeNode)e.Data.GetData("WindowsForms10PersistentObject");
                DataDictionaryView.FunctionTreeNode functionTreeNode = SourceNode as DataDictionaryView.FunctionTreeNode;
                if (functionTreeNode != null)
                {
                    AddFunction(functionTreeNode.Item);
                }
                else
                {
                    Shortcuts.ShortcutTreeNode shortcutTreeNode = SourceNode as Shortcuts.ShortcutTreeNode;
                    if (shortcutTreeNode != null)
                    {
                        AddFunction(shortcutTreeNode.Item.GetReference() as Function);
                    }
                }
            }
        }

        /// <summary>
        /// Adds a new function to this graph
        /// </summary>
        /// <param name="function"></param>
        private void AddFunction(Function function)
        {
            if (function != null)
            {
                InterpretationContext context = new InterpretationContext(function);
                if (function.FormalParameters.Count == 1)
                {
                    Parameter parameter = (Parameter)function.FormalParameters[0];
                    Graph graph = function.createGraph(context, parameter);
                    if (graph != null)
                    {
                        Functions.Add(function);
                        Refresh();
                    }
                }
                else if (function.FormalParameters.Count == 2)
                {
                    Surface surface = function.createSurface(context);
                    if (surface != null)
                    {
                        Functions.Add(function);
                        Refresh();
                    }
                    else
                    {
                        MessageBox.Show("Cannot add this function to the display view", "Cannot display function", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        /// <summary>
        /// Handles a change of the size of the window
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void GraphView_SizeChanged(object sender, EventArgs e)
        {
            if (SizedBitmap != null)
            {
                SizedBitmap.Dispose();
                SizedBitmap = null;
            }

            if (OriginalBitmap != null)
            {
                SizedBitmap = new Bitmap(OriginalBitmap, pictureBox.Size);
                pictureBox.Image = SizedBitmap;
            }
        }

        /// <summary>
        /// Handles the close event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void GraphView_FormClosed(object sender, FormClosedEventArgs e)
        {
            CleanUp();
            MDIWindow.HandleSubWindowClosed(this);
        }

        /// <summary>
        /// The property grid used to edit elements properties
        /// </summary>
        public MyPropertyGrid Properties { get { return null; } }

        /// <summary>
        /// The text editor for expressions
        /// </summary>
        public RichTextBox ExpressionTextBox { get { return null; } }

        /// <summary>
        /// The text editor for comments
        /// </summary>
        public RichTextBox CommentsTextBox { get { return null; } }

        /// <summary>
        /// The text editor for messages
        /// </summary>
        public RichTextBox MessagesTextBox { get { return null; } }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUI.FormsUtils.EnclosingForm(this.Parent) as MainWindow; }
        }

        /// <summary>
        /// The main tree view of the form
        /// </summary>
        public BaseTreeView TreeView { get { return null; } }

        /// <summary>
        /// The sub tree view of the form
        /// </summary>
        public BaseTreeView subTreeView { get { return null; } }

        /// <summary>
        /// The explain text box
        /// </summary>
        public ExplainTextBox ExplainTextBox { get { return null; } }

        /// <summary>
        /// Allows to refresh the view, according to the fact that the structure for the model could change
        /// </summary>
        public override void Refresh()
        {
            CleanUp();
            OriginalBitmap = Display();
            if (OriginalBitmap != null)
            {
                SizedBitmap = new Bitmap(OriginalBitmap, pictureBox.Size);
                pictureBox.Image = SizedBitmap;
            }
            else
            {
                pictureBox.Image = null;
            }
        }

        /// <summary>
        /// Refreshes the model
        /// </summary>
        public void RefreshModel()
        {
            // The model is always the same function
        }

        private void CleanUp()
        {
            if (OriginalBitmap != null)
            {
                OriginalBitmap.Dispose();
                OriginalBitmap = null;
            }

            if (SizedBitmap != null)
            {
                SizedBitmap.Dispose();
                SizedBitmap = null;
            }
        }

        /// <summary>
        /// Colors used to display functions
        /// </summary>
        private static string[] COLORS = { "blue", "red", "green", "orange", "black", "purple", "yellow" };

        /// <summary>
        /// Provides the model element currently selected in this IBaseForm
        /// </summary>
        public Utils.IModelElement Selected { get { return null; } }

        /// <summary>
        /// Creates the picture associated to this graph
        /// </summary>
        /// <param name="name"></param>
        /// <returns>the corresponding bitmap</returns>
        public Bitmap Display()
        {
            Bitmap retVal = null;

            SpeedDistanceCurvePlotter display = new SpeedDistanceCurvePlotter();
            String name = null;

            /// Computes the expected end to display
            double expectedEndX = 0;
            Dictionary<Function, Graph> graphs = new Dictionary<Function, Graph>();
            foreach (Function function in Functions)
            {
                InterpretationContext context = new InterpretationContext(function);
                if (function.FormalParameters.Count == 1)
                {
                    Parameter parameter = (Parameter)function.FormalParameters[0];
                    Graph graph = function.createGraph(context, parameter);
                    if (graph != null)
                    {
                        expectedEndX = Math.Max(expectedEndX, graph.ExpectedEndX());
                        graphs.Add(function, graph);
                    }
                }
            }

            double expectedEndY = 0;
            Dictionary<Function, Surface> surfaces = new Dictionary<Function, Surface>();
            foreach (Function function in Functions)
            {
                InterpretationContext context = new InterpretationContext(function);
                if (function.FormalParameters.Count == 2)
                {
                    Surface surface = function.createSurface(context);
                    if (surface != null)
                    {
                        expectedEndX = Math.Max(expectedEndX, surface.ExpectedEndX());
                        expectedEndY = Math.Max(expectedEndY, surface.ExpectedEndY());
                        surfaces.Add(function, surface);
                    }
                }
            }

            // Don't display surfaces that are too big 
            if (setMaximumYValueCheckBox.Checked)
            {
                try
                {
                    int maxY = Int32.Parse(maximumYValueTextBox.Text);
                    expectedEndY = Math.Min(expectedEndY, maxY);
                }
                catch (Exception)
                {
                }
            }
            expectedEndY = Math.Min(600, expectedEndY);

            int i = 0;
            /// Creates the graphs
            foreach (KeyValuePair<Function, Graph> pair in graphs)
            {
                Function function = pair.Key;
                Graph graph = pair.Value;

                if (graph != null)
                {
                    if (graph.IsFlat())
                    {
                        FlatSpeedDistanceCurve curve = graph.FlatSpeedDistanceCurve(expectedEndX);
                        display.AddCurve(curve, function.FullName, COLORS[i % COLORS.Length]);
                    }
                    else
                    {
                        QuadraticSpeedDistanceCurve curve = graph.QuadraticSpeedDistanceCurve(expectedEndX);
                        display.AddCurve(curve, function.FullName, COLORS[i % COLORS.Length]);
                    }

                    if (name == null)
                    {
                        name = function.Name;
                    }
                }
                i += 1;
            }

            /// Creates the surfaces
            foreach (KeyValuePair<Function, Surface> pair in surfaces)
            {
                Function function = pair.Key;
                Surface surface = pair.Value;

                if (surface != null)
                {
                    AccelerationSpeedDistanceSurface curve = surface.createAccelerationSpeedDistanceSurface(expectedEndX, expectedEndY);
                    display.AddCurve(curve, function.FullName);
                    if (name == null)
                    {
                        name = function.Name;
                    }
                }
            }

            if (name != null)
            {
                display.GnuPlot_Home_Path = Path.GetDirectoryName(Application.ExecutablePath) + "\\gnuplot\\bin";
                string outputDir = System.Environment.GetFolderPath(System.Environment.SpecialFolder.ApplicationData) + "\\ERTMSFormalSpecs";
                System.IO.Directory.CreateDirectory(outputDir);
                display.Output_Path = outputDir;
                display.Base_Name = "EFSPicture_" + name;
                display.ImageWidth = 1200;
                display.ImageHeight = 600;
                display.EraseTemporaryFiles = false;
                display.ShowColouredSegments = false;

                if (setMinimumValueCheckBox.Checked)
                {
                    try
                    {
                        double val = double.Parse(minimumValueTextBox.Text);
                        display.Min_X = new SiDistance(val, SiDistance_SubUnits.Meter);
                    }
                    catch (Exception)
                    {
                    }
                }

                if (setMaximumValueCheckBox.Checked)
                {
                    try
                    {
                        double val = double.Parse(maximumValueTextBox.Text);
                        display.Max_X = new SiDistance(val, SiDistance_SubUnits.Meter);
                    }
                    catch (Exception)
                    {
                    }
                }

                if (display.Plot())
                {
                    // Sometimes, a handle is still open on the corresponding file which forbids opening the stream on it
                    // Wait a bit until the handle is no more open
                    System.IO.FileStream stream = null;

                    System.DateTime start = System.DateTime.Now;
                    while (stream == null && System.DateTime.Now - start < new TimeSpan(0, 0, 5))
                    {
                        try
                        {
                            stream = new System.IO.FileStream(display.ImageFileName, System.IO.FileMode.Open, System.IO.FileAccess.Read);
                        }
                        catch (Exception)
                        {
                            System.Threading.Thread.Sleep(100);
                        }
                    }

                    if (stream != null)
                    {
                        try
                        {
                            retVal = new Bitmap(stream);
                        }
                        catch (Exception)
                        {
                        }
                        finally
                        {
                            stream.Close();
                            // System.IO.File.Delete(display.ImageFileName);
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks that the values of the check box & text box are consistent with bounds
        /// </summary>
        /// <param name="checkBox">The check box to check</param>
        /// <param name="textBox">The text box to check</param>
        /// <returns></returns>
        private bool CheckValue(CheckBox checkBox, TextBox textBox)
        {
            bool retVal = true;

            if (checkBox.Checked)
            {
                try
                {
                    double.Parse(textBox.Text);
                }
                catch (Exception)
                {
                    retVal = false;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the minimun and maximum values
        /// </summary>
        /// <returns></returns>
        private bool CheckMinAndMaxValues()
        {
            bool retVal = true;

            retVal = retVal && CheckValue(setMinimumValueCheckBox, minimumValueTextBox);
            retVal = retVal && CheckValue(setMaximumValueCheckBox, maximumValueTextBox);
            retVal = retVal && CheckValue(setMaximumYValueCheckBox, maximumYValueTextBox);

            return retVal;
        }

        private void setMinimumValueCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            minimumValueTextBox.Enabled = setMinimumValueCheckBox.Checked;
            if (CheckMinAndMaxValues())
            {
                Refresh();
            }
        }

        private void setMaximumValueCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            maximumValueTextBox.Enabled = setMaximumValueCheckBox.Checked;
            if (CheckMinAndMaxValues())
            {
                Refresh();
            }
        }

        private void minimumValueTextBox_LostFocus(object sender, EventArgs e)
        {
            if (CheckMinAndMaxValues())
            {
                Refresh();
            }
        }

        private void maximumValueTextBox_LostFocus(object sender, EventArgs e)
        {
            if (CheckMinAndMaxValues())
            {
                Refresh();
            }
        }

        private void maximumYValueTextBox_TextChanged(object sender, EventArgs e)
        {
            if (CheckMinAndMaxValues())
            {
                Refresh();
            }
        }
    }
}
