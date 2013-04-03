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
using System.Linq;
using System.Windows.Forms;

namespace GUI
{
    public partial class MainWindow : Form
    {
        /// <summary>
        /// The sub IBaseForms handled in this MDI
        /// </summary>
        private HashSet<IBaseForm> subWindows = new HashSet<IBaseForm>();

        public HashSet<IBaseForm> SubWindows
        {
            get
            {
                return subWindows;
            }
        }

        /// <summary>
        /// Selects the model element in all opened sub windows
        /// </summary>
        /// <param name="model"></param>
        public void Select(Utils.IModelElement model)
        {
            if (model != null)
            {
                foreach (IBaseForm form in SubWindows)
                {
                    if (form.TreeView != null)
                    {
                        form.TreeView.Select(model);
                    }
                }
            }
        }

        public void HandleSubWindowClosed(Form form)
        {
            if (form is IBaseForm)
            {
                SubWindows.Remove((IBaseForm)form);
            }
        }

        /// <summary>
        /// Provides a data dictionary window
        /// </summary>
        public DataDictionaryView.Window DataDictionaryWindow
        {
            get
            {
                foreach (IBaseForm form in SubWindows)
                {
                    if (form is DataDictionaryView.Window)
                    {
                        return (DataDictionaryView.Window)form;
                    }
                }

                return null;
            }
        }

        /// <summary>
        /// Provides a specification window
        /// </summary>
        public SpecificationView.Window SpecificationWindow
        {
            get
            {
                foreach (IBaseForm form in SubWindows)
                {
                    if (form is SpecificationView.Window)
                    {
                        return (SpecificationView.Window)form;
                    }
                }

                return null;
            }
        }

        /// <summary>
        /// Provides a test runner window
        /// </summary>
        public TestRunnerView.Window TestWindow
        {
            get
            {
                foreach (IBaseForm form in SubWindows)
                {
                    if (form is TestRunnerView.Window)
                    {
                        return (TestRunnerView.Window)form;
                    }
                }

                return null;
            }
        }

        /// <summary>
        /// The translation window
        /// </summary>
        private TranslationRules.Window TranslationWindow
        {
            get
            {
                TranslationRules.Window retVal = null;
                DataDictionary.Dictionary dictionary = GetActiveDictionary();
                if (dictionary != null)
                {
                    retVal = new TranslationRules.Window(dictionary.TranslationDictionary);
                    AddChildWindow(retVal);
                }
                return retVal;
            }
        }

        /// <summary>
        /// The shortcuts window
        /// </summary>
        private Shortcuts.Window ShortcutsWindow
        {
            get
            {
                foreach (IBaseForm form in SubWindows)
                {
                    if (form is Shortcuts.Window)
                    {
                        return (Shortcuts.Window)form;
                    }
                }

                return null;
            }
        }

        /// <summary>
        /// The application version number
        /// </summary>
        private string versionNumber = "0.9";


        /// <summary>
        /// Listener to model changes
        /// </summary>
        public class NamableChangeListener : XmlBooster.IListener<DataDictionary.Generated.Namable>
        {
            /// <summary>
            /// The main window for which this listener listens
            /// </summary>
            private MainWindow MainWindow { get; set; }

            /// <summary>
            /// Last time refresh was done
            /// </summary>
            private DateTime LastRefresh { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="system"></param>
            public NamableChangeListener(MainWindow window)
            {
                MainWindow = window;
                LastRefresh = DateTime.MinValue;
            }

            #region Listens to namable changes
            public void HandleChangeEvent(DataDictionary.Generated.Namable sender)
            {
                RefreshMainWindow();
            }

            public void HandleChangeEvent(XmlBooster.Lock aLock, DataDictionary.Generated.Namable sender)
            {
                RefreshMainWindow();
            }

            private void RefreshMainWindow()
            {
                DateTime now = DateTime.Now;
                TimeSpan span = now - LastRefresh;

                if (span > TimeSpan.FromSeconds(1))
                {
                    MainWindow.Invoke((MethodInvoker)delegate
                    {
                        MainWindow.Refresh();
                    });
                    LastRefresh = now;
                }
            }
            #endregion
        }

        /// <summary>
        /// Create the main window
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();
            AllowRefresh = true;

            DataDictionary.Generated.ControllersManager.NamableController.ActivateNotification();
            DataDictionary.Generated.ControllersManager.NamableController.Listeners.Add(new NamableChangeListener(this));

            Refresh();
        }

        /// <summary>
        /// Updates the title according to the windows state
        /// </summary>
        public void UpdateTitle()
        {
            String windowTitle = "ERTMS Formal Spec Workbench (version " + versionNumber + ")";

            if (EFSSystem != null && EFSSystem.ShouldSave)
            {
                windowTitle += " [modified]";
            }

            Text = windowTitle;
        }

        /// <summary>
        /// Adds a child window to this parent MDI
        /// </summary>
        /// <param name="window"></param>
        /// <returns></returns>
        public void AddChildWindow(Form window)
        {
            if (window != null)
            {
                window.MdiParent = this;
                window.Show();
                window.Activate();

                if (window is IBaseForm)
                {
                    SubWindows.Add((IBaseForm)window);
                }

                ActivateMdiChild(window);
            }
        }

        /// <summary>
        /// Ensures that a window is closed
        /// </summary>
        /// <param name="window"></param>
        /// <returns></returns>
        private void EnsureIsClosed(Form window)
        {
            if (window != null)
            {
                try
                {
                    window.Close();
                    window.MdiParent = null;

                    if (window is IBaseForm)
                    {
                        SubWindows.Remove((IBaseForm)window);
                    }

                    RemoveOwnedForm(window);
                }
                catch (Exception)
                {
                }
            }
        }

        /// <summary>
        /// Closes all child windows of this MDI window
        /// </summary>
        private void CloseChildWindows()
        {
            while (SubWindows.Count > 0)
            {
                Form window = (Form)SubWindows.First();
                EnsureIsClosed(window);
            }
        }

        /// <summary>
        /// Indicates that the refresh should be performed
        /// </summary>
        public bool AllowRefresh { get; set; }

        /// <summary>
        /// Refreshes the content of the window based on the associated model
        /// (changes may have occured)
        /// </summary>
        public void RefreshModel()
        {
            if (AllowRefresh)
            {
                foreach (IBaseForm form in SubWindows)
                {
                    form.RefreshModel();
                    form.Refresh();
                }
            }
        }

        /// <summary>
        /// Refreshes the display of the windows.
        /// No structural model change occurred.
        /// </summary>
        public override void Refresh()
        {
            foreach (IBaseForm form in SubWindows)
            {
                form.Refresh();
            }
            UpdateTitle();

            base.Refresh();
        }

        /// ------------------------------------------------------
        ///    OPEN OPERATIONS
        /// ------------------------------------------------------

        /// <summary>
        /// The name of the file to open
        /// </summary>
        private string fileName;

        /// <summary>
        /// Provides the dictionary to be openend after the load operation
        /// </summary>
        private DataDictionary.Dictionary pleaseOpenDictionary;

        /// <summary>
        /// The efs system
        /// </summary>
        public DataDictionary.EFSSystem EFSSystem
        {
            get { return DataDictionary.EFSSystem.INSTANCE; }
        }

        /// <summary>
        /// Opens the file in the progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        private void OpenFileHandler(object arg)
        {
            pleaseOpenDictionary = DataDictionary.Util.load(fileName, EFSSystem);
        }

        private void OpenFile(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Title = "Open ERTMS Formal Spec file";
            openFileDialog.Filter = "EFS Files (*.efs)|*.efs|All Files (*.*)|*.*";
            if (openFileDialog.ShowDialog(this) == DialogResult.OK)
            {
                bool shouldCompile = EFSSystem.ShouldRebuild;
                bool shouldSave = EFSSystem.ShouldSave;

                fileName = openFileDialog.FileName;
                ProgressDialog dialog = new ProgressDialog("Opening file", OpenFileHandler);
                dialog.ShowDialog();

                // Open the windows
                if (pleaseOpenDictionary != null)
                {
                    // Only open the specification window if specifications are available in the opened file
                    if (pleaseOpenDictionary.Specifications != null && pleaseOpenDictionary.Specifications.AllParagraphs.Count > 0)
                    {
                        AddChildWindow(new SpecificationView.Window(pleaseOpenDictionary));
                    }

                    // Only open the model view window if model elements are available in the opened file
                    if (pleaseOpenDictionary.NameSpaces.Count > 0)
                    {
                        AddChildWindow(new DataDictionaryView.Window(pleaseOpenDictionary));
                    }

                    // Only shold the tests window if tests are defined in the opened file
                    if (pleaseOpenDictionary.Tests.Count > 0)
                    {
                        IBaseForm testWindow = TestWindow;
                        if (testWindow == null)
                        {
                            AddChildWindow(new TestRunnerView.Window(EFSSystem));
                        }
                        else
                        {
                            testWindow.RefreshModel();
                        }
                    }

                    // Only open the shortcuts window if there are some shortcuts defined
                    if (pleaseOpenDictionary.ShortcutsDictionary != null)
                    {
                        IBaseForm shortcutsWindow = ShortcutsWindow;
                        if (shortcutsWindow == null)
                        {
                            DataDictionary.Dictionary dictionary = GetActiveDictionary();
                            if (dictionary != null)
                            {
                                Shortcuts.Window newWindow = new Shortcuts.Window(dictionary.ShortcutsDictionary);
                                newWindow.Location = new System.Drawing.Point(Width - newWindow.Width - 20, 0);
                                AddChildWindow(newWindow);
                            }
                        }
                        else
                        {
                            shortcutsWindow.RefreshModel();
                        }
                    }
                }

                EFSSystem.ShouldRebuild = shouldCompile;
                EFSSystem.ShouldSave = shouldSave;
                Refresh();
            }
        }

        /// ------------------------------------------------------
        ///    SAVE OPERATIONS
        /// ------------------------------------------------------

        /// <summary>
        /// Indicates the dictionary to be saved
        /// </summary>
        private DataDictionary.Dictionary pleaseSaveDictionary;

        /// <summary>
        /// Saves the file in the progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        private void SaveFileHandler(object arg)
        {
            DataDictionary.Util.UnlockAllFiles();

            try
            {
                if (pleaseSaveDictionary != null)
                {
                    pleaseSaveDictionary.save();
                    pleaseSaveDictionary = null;
                }
                else
                {
                    // Save all dictionaries
                    foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                    {
                        dictionary.save();
                    }
                }
            }
            finally
            {
                DataDictionary.Util.LockAllFiles();
                EFSSystem.ShouldSave = false;
                Invoke((MethodInvoker)delegate
                {
                    Refresh();
                });
            }
        }

        /// <summary>
        /// Provides the dictionary on which operation should be performed
        /// </summary>
        /// <returns></returns>
        public DataDictionary.Dictionary GetActiveDictionary()
        {
            DataDictionary.Dictionary retVal = null;

            if (EFSSystem != null)
            {
                if (EFSSystem.Dictionaries.Count == 1)
                {
                    retVal = EFSSystem.Dictionaries[0];
                }
                else
                {
                    DictionarySelector.DictionarySelector dictionarySelector = new DictionarySelector.DictionarySelector(EFSSystem);
                    dictionarySelector.ShowDialog(this);

                    if (dictionarySelector.Selected != null)
                    {
                        retVal = dictionarySelector.Selected;
                    }
                }
            }

            return retVal;
        }

        private void SaveAsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary activeDictionary = GetActiveDictionary();

            if (activeDictionary != null)
            {
                SaveFileDialog saveFileDialog = new SaveFileDialog();
                saveFileDialog.Title = "Saving EFS file " + activeDictionary.Name;
                saveFileDialog.Filter = "EFS files (*.efs)|*.efs|All Files (*.*)|*.*";
                if (saveFileDialog.ShowDialog(this) == DialogResult.OK)
                {
                    activeDictionary.FilePath = saveFileDialog.FileName;
                    pleaseSaveDictionary = activeDictionary;
                    ProgressDialog dialog = new ProgressDialog("Saving file " + activeDictionary.FilePath, SaveFileHandler);
                    dialog.ShowDialog();
                }
            }
        }

        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                pleaseSaveDictionary = dictionary;
                ProgressDialog dialog = new ProgressDialog("Saving file " + dictionary.Name, SaveFileHandler);
                dialog.ShowDialog();
            }
        }

        private void saveToolStripButton_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                pleaseSaveDictionary = dictionary;
                ProgressDialog dialog = new ProgressDialog("Saving file " + dictionary.Name, SaveFileHandler);
                dialog.ShowDialog();
            }
        }

        private void ExitToolsStripMenuItem_Click(object sender, EventArgs e)
        {
            if (EFSSystem.ShouldSave)
            {
                DialogResult result = MessageBox.Show("Model has been changed, do you want to save it", "Model changed", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Information, MessageBoxDefaultButton.Button1);
                switch (result)
                {
                    case System.Windows.Forms.DialogResult.Yes:
                        ProgressDialog dialog = new ProgressDialog("Saving files", SaveFileHandler);
                        dialog.ShowDialog();
                        break;

                    case System.Windows.Forms.DialogResult.No:
                        break;

                    case System.Windows.Forms.DialogResult.Cancel:
                        return;
                }
            }

            this.Close();
        }

        /// <summary>
        /// The rich text box currently selected
        /// </summary>
        public MyRichTextBox SelectedRichTextBox { get; set; }

        private void undoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (SelectedRichTextBox != null)
            {
                SelectedRichTextBox.Undo();
            }
        }

        private void redoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (SelectedRichTextBox != null)
            {
                SelectedRichTextBox.Redo();
            }
        }

        private void CutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (SelectedRichTextBox != null)
            {
                SelectedRichTextBox.Cut();
            }
        }

        private void CopyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (SelectedRichTextBox != null)
            {
                SelectedRichTextBox.Copy();
            }
        }

        private void PasteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (SelectedRichTextBox != null)
            {
                SelectedRichTextBox.Paste();
            }
        }

        private void ToolBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStrip.Visible = toolBarToolStripMenuItem.Checked;
        }

        private void StatusBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            statusStrip.Visible = statusBarToolStripMenuItem.Checked;
        }

        private void CascadeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.Cascade);
        }

        private void TileVerticalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileVertical);
        }

        private void TileHorizontalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileHorizontal);
        }

        private void ArrangeIconsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.ArrangeIcons);
        }

        private void CloseAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (Form childForm in MdiChildren)
            {
                childForm.Close();
            }
        }

        /// <summary>
        /// Checks the model in the progress dialog worker task
        /// </summary>
        /// <param name="arg"></param>
        private void CheckModelHandler(object arg)
        {
            DataDictionary.Generated.ControllersManager.NamableController.DesactivateNotification();
            try
            {
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    dictionary.CheckRules();
                }
            }
            finally
            {
                DataDictionary.Generated.ControllersManager.NamableController.ActivateNotification();
            }
        }

        private void checkModelToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ProgressDialog dialog = new ProgressDialog("Check model", CheckModelHandler);
            dialog.ShowDialog();
            Refresh();
        }

        private void implementedToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.Specifications.CheckImplementation();
            }
            Refresh();
        }

        private void implementationRequiredToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.MarkUnimplementedItems();
            }
            Refresh();
        }

        private void verificationRequiredToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.MarkNotVerifiedRules();
            }
            Refresh();
        }

        private void verifiedToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.Specifications.CheckReview();
                Refresh();
            }
        }

        /// ------------------------------------------------------
        ///    MARKS OPERATIONS
        /// ------------------------------------------------------

        private void clearMarksToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.ClearMessages();
            }
            Refresh();
        }

        private void markRequirementsWhereMoreInfoIsRequiredToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckMoreInfo();
                }
            }
            Refresh();
        }

        private void markImplementedButNoFunctionalTestToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckImplementedWithNoFunctionalTest();
                }
            }
            Refresh();
        }

        private void markNotImplementedButImplementationExistsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckNotImplementedButImplementationExists();
                }
            }
            Refresh();
        }

        private void markApplicableParagraphsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckApplicable();
                }
            }
            Refresh();
        }

        private void markImplementationRequiredToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.MarkUnimplementedTests();
            }

            Refresh();
        }

        private void markNotTranslatedToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.MarkNotTranslatedTests();
            }

            Refresh();
        }

        private void markNotImplementedTranslationsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.MarkNotImplementedTranslations();
            }

            Refresh();
        }

        private void markNonApplicableRequirementsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckNonApplicable();
                }
            }
            Refresh();
        }

        private void markSpecIssuesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                if (dictionary.Specifications != null)
                {
                    dictionary.Specifications.CheckSpecIssues();
                }
            }
            Refresh();
        }

        /// ------------------------------------------------------
        ///    IMPORT SPEC OPERATIONS
        /// ------------------------------------------------------

        private void importToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                OpenFileDialog openFileDialog = new OpenFileDialog();
                openFileDialog.Title = "Open specification file";
                openFileDialog.Filter = "XML Files (*.xml)|*.xml|All Files (*.*)|*.*";
                if (openFileDialog.ShowDialog(this) == DialogResult.OK)
                {
                    string FileName = openFileDialog.FileName;
                    if (MessageBox.Show("This will override the specifications. Are you sure ? ", "Override action", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == System.Windows.Forms.DialogResult.Yes)
                    {
                        DataDictionary.Util.loadSpecification(FileName, dictionary);
                        RefreshModel();
                    }
                }
            }
        }

        /// ------------------------------------------------------
        ///    IMPORT TEST DATABASE OPERATIONS
        /// ------------------------------------------------------

        /// <summary>
        /// The name of the frame for the subset 76
        /// </summary>
        private static string SUBSET_076 = "Subset-076";

        /// <summary>
        /// The password requireed to access the database
        /// </summary>
        private static string DB_PASSWORD = "papagayo";

        /// <summary>
        /// The dictionary in which the database should be imported
        /// </summary>
        private DataDictionary.Dictionary pleaseImportDatabase;

        /// <summary>
        /// Imports a database in a progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        private void ImportDataBase(object arg)
        {
            Importers.TestImporter importer = new Importers.TestImporter(fileName, DB_PASSWORD);

            DataDictionary.Tests.Frame frame = pleaseImportDatabase.findFrame(SUBSET_076);
            if (frame == null)
            {
                frame = (DataDictionary.Tests.Frame)DataDictionary.Generated.acceptor.getFactory().createFrame();
                frame.Name = SUBSET_076;
                pleaseImportDatabase.appendTests(frame);
            }

            importer.Import(frame);
            pleaseImportDatabase = null;
        }

        private void importDatabaseToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                OpenFileDialog openFileDialog = new OpenFileDialog();
                openFileDialog.Title = "Open test sequence database";
                openFileDialog.Filter = "Access Files (*.mdb)|*.mdb";
                if (openFileDialog.ShowDialog(this) == DialogResult.OK)
                {
                    fileName = openFileDialog.FileName;
                    pleaseImportDatabase = dictionary;
                    ProgressDialog dialog = new ProgressDialog("Import database", ImportDataBase);
                    dialog.ShowDialog();
                    // Updates the test tree view data
                    if (TestWindow != null)
                    {
                        TestWindow.TreeView.RefreshModel();
                        Refresh();
                    }
                }
            }
        }

        /// <summary>
        /// Imports a database directory in a progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        private void ImportDataBaseDirectory(object arg)
        {
            DataDictionary.Tests.Frame frame = pleaseImportDatabase.findFrame(SUBSET_076);
            if (frame == null)
            {
                frame = (DataDictionary.Tests.Frame)DataDictionary.Generated.acceptor.getFactory().createFrame();
                frame.Name = SUBSET_076;
                pleaseImportDatabase.appendTests(frame);
            }

            foreach (string fName in System.IO.Directory.GetFiles(fileName, "*.mdb"))
            {
                Importers.TestImporter importer = new Importers.TestImporter(fName, DB_PASSWORD);

                importer.Import(frame);
            }
        }

        private void importFolderToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                FolderBrowserDialog selectFolderDialog = new FolderBrowserDialog();
                if (selectFolderDialog.ShowDialog(this) == DialogResult.OK)
                {
                    fileName = selectFolderDialog.SelectedPath;

                    pleaseImportDatabase = dictionary;
                    ProgressDialog dialog = new ProgressDialog("Import database directory", ImportDataBaseDirectory);
                    dialog.ShowDialog();
                    // Updates the test tree view data
                    if (TestWindow != null)
                    {
                        TestWindow.TreeView.RefreshModel();
                        Refresh();
                    }
                }
            }
        }

        private void showTranslationRulesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AddChildWindow(TranslationWindow);
        }


        private void showShortcutsViewToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AddChildWindow(ShortcutsWindow);
        }

        private void showTestsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (EFSSystem != null)
            {
                Form testWindow = TestWindow;
                if (testWindow == null)
                {
                    AddChildWindow(new TestRunnerView.Window(EFSSystem));
                }
                else
                {
                    testWindow.Select();
                }
            }
        }

        private void showModelViewToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                AddChildWindow(new DataDictionaryView.Window(dictionary));
            }
        }

        private void showSpecificationViewToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                AddChildWindow(new SpecificationView.Window(dictionary));
            }
        }

        /// ------------------------------------------------------
        ///    CREATE REPORT OPERATIONS
        /// ------------------------------------------------------

        private void specCoverageToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.SpecReport aReport = new Report.SpecReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void testsCoverageToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.TestReport aReport = new Report.TestReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void generateDynamicCoverageReportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.TestReport aReport = new Report.TestReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void generateCoverageReportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.SpecReport aReport = new Report.SpecReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void generateSpecIssuesReportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.SpecIssuesReport aReport = new Report.SpecIssuesReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void generateDataDictionaryReportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DataDictionary.Dictionary dictionary = GetActiveDictionary();
            if (dictionary != null)
            {
                Report.ModelReport aReport = new Report.ModelReport(dictionary);
                aReport.ShowDialog(this);
            }
        }

        private void searchToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            SearchDialog.SearchDialog dialog = new SearchDialog.SearchDialog();
            dialog.Initialise(EFSSystem);
            dialog.ShowDialog(this);
        }

        private void refreshWindowsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            RefreshModel();
        }

        private void exportFunctionalBlocksToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                DataDictionary.Specification.FunctionalBlockExporter fbExporter = new DataDictionary.Specification.FunctionalBlockExporter(dictionary.Specifications);
                fbExporter.Export("../FunctionalBlocks.csv");
            }
        }

        private void showRulePerformancesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            RulePerformances.RulesPerformances rulePerformances = new RulePerformances.RulesPerformances(EFSSystem);
            AddChildWindow(rulePerformances);
        }

        /// <summary>
        /// ReInit counters in rules
        /// </summary>
        private class ResetTimeStamps : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="efsSystem"></param>
            public ResetTimeStamps(DataDictionary.EFSSystem efsSystem)
            {
                foreach (DataDictionary.Dictionary dictionary in efsSystem.Dictionaries)
                {
                    visit(dictionary, true);
                }
            }

            public override void visit(DataDictionary.Generated.Rule obj, bool visitSubNodes)
            {
                DataDictionary.Rules.Rule rule = obj as DataDictionary.Rules.Rule;

                rule.ExecutionTimeInMilli = 0;
                rule.ExecutionCount = 0;

                base.visit(obj, visitSubNodes);
            }

            public override void visit(DataDictionary.Generated.Function obj, bool visitSubNodes)
            {
                DataDictionary.Functions.Function function = obj as DataDictionary.Functions.Function;

                function.ExecutionTimeInMilli = 0;
                function.ExecutionCount = 0;

                base.visit(obj);
            }

            public override void visit(DataDictionary.Generated.Frame obj, bool visitSubNodes)
            {
                // No rules in frames
            }
        }

        private void resetCountersToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (EFSSystem != null)
            {
                ResetTimeStamps reset = new ResetTimeStamps(EFSSystem);
            }
        }

        private void showFunctionsPerformancesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FunctionsPerformances.FunctionsPerformances functionsPerformances = new FunctionsPerformances.FunctionsPerformances(EFSSystem);
            AddChildWindow(functionsPerformances);
        }
    }
}