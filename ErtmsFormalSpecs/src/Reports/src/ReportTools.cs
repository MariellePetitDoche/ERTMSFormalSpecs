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
using MigraDoc.DocumentObjectModel;
using MigraDoc.DocumentObjectModel.Tables;

namespace Report
{
    /// <summary>
    /// Proposes the tools needed for a report creation
    /// </summary>
    public class ReportTools
    {
        /// <summary>
        /// The current document
        /// </summary>
        protected Document document { get; set; }

        /// <summary>
        /// The current section
        /// </summary>
        protected Section section { get; set; }

        /// <summary>
        /// The table currently being built
        /// </summary>
        protected Table table { get; set; }

        /// <summary>
        /// The last row built in the table
        /// </summary>
        protected Row lastRow { get; set; }

        /// <summary>
        /// The current paragraph level
        /// </summary>
        private int level = 1;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="doc"></param>
        public ReportTools(Document doc)
        {
            document = doc;
            DefineStyles(document);

            section = document.AddSection();
        }

        /// <summary>
        /// Defines the styles used in the document.
        /// </summary>
        public static void DefineStyles(Document document)
        {
            // Get the predefined style Normal.
            Style style = document.Styles["Normal"];
            // Because all styles are derived from Normal, the next line changes the
            // font of the whole document. Or, more exactly, it changes the font of
            // all styles and paragraphs that do not redefine the font.
            style.Font.Name = "Times New Roman";
            // Heading1 to Heading9 are predefined styles with an outline level. An outline level
            // other than OutlineLevel.BodyText automatically creates the outline (or bookmarks)
            // in PDF.
            style = document.Styles["Heading1"];
            style.Font.Name = "Tahoma";
            style.Font.Size = 14;
            style.Font.Bold = true;
            style.Font.Color = Colors.DarkBlue;
            style.ParagraphFormat.PageBreakBefore = true;
            style.ParagraphFormat.SpaceAfter = 6;
            style = document.Styles["Heading2"];
            style.Font.Size = 12;
            style.Font.Bold = true;
            style.ParagraphFormat.PageBreakBefore = false;
            style.ParagraphFormat.SpaceBefore = 6;
            style.ParagraphFormat.SpaceAfter = 6;
            style = document.Styles["Heading3"];
            style.Font.Size = 10;
            style.Font.Bold = true;
            style.Font.Italic = true;
            style.ParagraphFormat.SpaceBefore = 6;
            style.ParagraphFormat.SpaceAfter = 3;
            style = document.Styles[StyleNames.Header];
            style.ParagraphFormat.AddTabStop("16cm", TabAlignment.Right);
            style = document.Styles[StyleNames.Footer];
            style.ParagraphFormat.AddTabStop("8cm", TabAlignment.Center);
            // Create a new style called TextBox based on style Normal
            style = document.Styles.AddStyle("TextBox", "Normal");
            style.ParagraphFormat.Alignment = ParagraphAlignment.Justify;
            style.ParagraphFormat.Borders.Width = 2.5;
            style.ParagraphFormat.Borders.Distance = "3pt";
            style.ParagraphFormat.Shading.Color = Colors.SkyBlue;
            // Create a new style called TextBox based on style Normal
            style = document.Styles.AddStyle("Code", "Normal");
            style.Font.Name = "Courier";
            style.ParagraphFormat.Borders.Width = 2.5;
            style.ParagraphFormat.Borders.Distance = "3pt";
            style.ParagraphFormat.Shading.Color = Colors.LightSeaGreen;
            // Create a new style called TOC based on style Normal
            style = document.Styles.AddStyle("TOC", "Normal");
            style.ParagraphFormat.AddTabStop("16cm", TabAlignment.Right, TabLeader.Dots);
            style.ParagraphFormat.Font.Color = Colors.Blue;
        }
        /// <summary>
        /// Adds a new subsection in the document
        /// </summary>
        /// <param name="name"></param>
        public void AddSubParagraph(string name)
        {
            section.AddParagraph(name, "Heading" + level);
            level += 1;

        }

        /// <summary>
        /// Closes the subsection in the document
        /// </summary>
        public void CloseSubParagraph()
        {
            level -= 1;
        }

        /// <summary>
        /// Adds a paragraph in a section
        /// </summary>
        /// <param name="text"></param>
        public void AddParagraph(string text)
        {
            section.AddParagraph(text, "Normal");
        }

        /// <summary>
        /// Adds a list item in a section
        /// </summary>
        /// <param name="text"></param>
        public void AddListItem(string text)
        {
            Paragraph p = section.AddParagraph(text, "Normal");
            p.Format.ListInfo.ListType = MigraDoc.DocumentObjectModel.ListType.BulletList1;
        }

        /// <summary>
        /// Adds code in a section
        /// </summary>
        /// <param name="text"></param>
        public void AddCode(string text)
        {
            section.AddParagraph(text, "code");
        }

        /// <summary>
        /// The maximum size of a table
        /// </summary>
        private static Unit TABLE_WIDTH = new Unit(170, UnitType.Millimeter);

        /// <summary>
        /// Creates a new table with the given number of column + column width
        /// </summary>
        /// <param name="columnNames"></param>
        /// <param name="columnWidth"></param>
        public void AddTable(string[] columnNames, int[] columnWidth)
        {
            table = section.AddTable();
            table.Style = "Table";
            table.Borders.Color = Colors.Black;
            table.Borders.Width = 0.25;
            table.Borders.Left.Width = 0.5;
            table.Borders.Right.Width = 0.5;
            table.Rows.LeftIndent = 0;

            Unit totalWidth = 0;
            for (int i = 0; i <= columnWidth.Length - 2; i++)
            {
                Unit colWidth = new Unit(columnWidth[i], UnitType.Millimeter);
                table.AddColumn(colWidth);
                totalWidth += colWidth;
            }
            table.AddColumn(TABLE_WIDTH - totalWidth);

            AddTableHeader(columnNames);
        }

        public void AddTableHeader(params string[] columnNames)
        {
            AddRow(columnNames);
            lastRow.HeadingFormat = true;
            lastRow.Shading.Color = Colors.LightBlue;
            lastRow.Format.Font.Bold = true;
            lastRow.Format.Alignment = ParagraphAlignment.Center;
            lastRow.VerticalAlignment = VerticalAlignment.Bottom;

            if (columnNames.Length == 1)
            {
                lastRow.Format.Alignment = ParagraphAlignment.Left;
            }
        }

        /// <summary>
        /// Adds a row to the table currently being built
        /// </summary>
        /// <param name="rowData"></param>
        public Row AddRow(params string[] rowData)
        {
            Row retVal = null;

            int elementCount = 0;
            foreach (string data in rowData)
            {
                if (data != null && !data.Equals(""))
                {
                    elementCount += 1;
                }

            }

            if (elementCount > 0)
            {
                lastRow = table.AddRow();

                int lastInsert = 0;
                for (int i = 0; i < table.Columns.Count; i++)
                {
                    if (i < rowData.Length)
                    {
                        if (rowData[i] != null && !rowData[i].Equals(""))
                        {
                            lastRow.Cells[i].AddParagraph(rowData[i]);
                            lastInsert = i;
                        }
                    }
                    else
                    {
                        lastRow.Cells[i].AddParagraph("");
                        lastRow.Cells[lastInsert].MergeRight += 1;
                    }
                }
                retVal = lastRow;
            }

            return retVal;
        }

        /// <summary>
        /// Adds a row to the table currently being built
        /// </summary>
        /// <param name="rowData"></param>
        public Row AppendToRow(params string[] rowData)
        {
            for (int i = 0; i < rowData.Length; i++)
            {
                if (rowData[i] != null && !rowData[i].Equals(""))
                {
                    lastRow.Cells[i].AddParagraph(rowData[i]);
                }
            }

            return lastRow;
        }

        /// <summary>
        /// Provides the name for table columns
        /// </summary>
        /// <param name="columnNumber"></param>
        /// <returns></returns>
        public static string GetColumnName(int columnNumber)
        {
            return "C_" + columnNumber;
        }
    }
}
