; ###########################################################################
; #  INNO Setup Builder config file              (c) Ertms Solutions
; #
; ###########################################################################
;
; This script creates a self-installing archive for ERTMSFormalSpecs.
;
; It Uses INNO Setup
[Setup]
AppName=ERTMSFormalSpecs
AppVerName=ERTMSFormalSpecs
DefaultGroupName=ERTMSFormalSpecs
DefaultDirName={pf}\ERTMSSolutions\ERTMSFormalSpecs
OutputDir=release
OutputBaseFileName=ERTMSFormalSpecs_Setup
ChangesAssociations=yes

[Dirs]
Name: "{app}\"; Permissions: everyone-modify
;needed for windows 7, so that windows 7 allows sniffer and shell to create logfile.

[Files]
Source: ..\..\bin\GUI.exe; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\GUI.exe.config; DestDir: {app}\bin; 
Source: ..\..\bin\DataDictionary.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\ErtmsSolutions.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Importer.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\MigraDoc.DocumentObjectModel.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\MigraDoc.Rendering.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\PdfSharp.Charting.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\PdfSharp.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Reports.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Utils.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\XmlBooster.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\log4net.dll; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\etc\logconfig.xml; DestDir: {app}\bin; Flags: ignoreversion

; also provide the pdb files
Source: ..\..\bin\GUI.pdb; DestDir: {app}\bin; 
Source: ..\..\bin\DataDictionary.pdb; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\ErtmsSolutions.pdb; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Importer.pdb; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Reports.pdb; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\Utils.pdb; DestDir: {app}\bin; Flags: ignoreversion
Source: ..\..\bin\XmlBooster.pdb; DestDir: {app}\bin; Flags: ignoreversion

Source: ..\..\bin\gnuplot\*; DestDir: {app}\bin\gnuplot; Flags: recursesubdirs

Source: ..\..\doc\EFSW_Technical_Design.pdf; DestDir: {app}\doc;
Source: ..\..\doc\EFSW_User_Guide.pdf; DestDir: {app}\doc;
Source: ..\..\doc\EFSW_Release_Notes.pdf; DestDir: {app};
Source: ..\..\doc\specs\DataDictionary.xsd; DestDir: {app}\doc\specs;
Source: ..\..\doc\specs\subset-026.efs; DestDir: {app}\doc\specs;
Source: ..\..\doc\specs\disable shunting.efs; DestDir: {app}\doc\specs;
Source: ..\..\doc\specs\subset-076.efs; DestDir: {app}\doc\specs;
Source: ..\..\doc\SpecificationCoverageReport.pdf; DestDir: {app}\doc;
Source: ..\..\doc\ModelReport.pdf; DestDir: {app}\doc;
Source: ..\..\doc\TestCoverageReport.pdf; DestDir: {app}\doc;

Source: ..\ertmsFormalSpec.sln; DestDir: {app}\src;
Source: ..\DataDictionary\*; DestDir: {app}\src\DataDictionary; Excludes: "CVS,obj,.cvsignore"; Flags: recursesubdirs
Source: ..\ErtmsSolutions\*; DestDir: {app}\src\DataDictionary; Excludes: "CVS,obj,.cvsignore"; Flags: recursesubdirs
Source: ..\GUI\*; DestDir: {app}\src\GUI; Excludes: "CVS,obj.cvsignore"; Flags: recursesubdirs
Source: ..\Importers\*; DestDir: {app}\src\Importers; Excludes: "CVS,obj.cvsignore"; Flags: recursesubdirs
Source: ..\Reports\*; DestDir: {app}\src\Reports; Excludes: "CVS,obj.cvsignore"; Flags: recursesubdirs
Source: ..\Utils\*; DestDir: {app}\src\Utils; Excludes: "CVS,obj.cvsignore"; Flags: recursesubdirs
Source: ..\XmlBooster\*; DestDir: {app}\src\XmlBooster; Excludes: "CVS,obj.cvsignore"; Flags: recursesubdirs

[Icons]
Name: "{group}\docs\Release Notes"; Filename: "{app}\EFSW_Release_Notes.pdf";
Name: "{group}\docs\User's Manual"; Filename: "{app}\doc\EFSW_User_Guide.pdf";
Name: "{group}\docs\Technical Design"; Filename: "{app}\doc\EFSW_Technical_Design.pdf";
Name: "{group}\docs\reports\Specification Report"; Filename: "{app}\doc\SpecificationCoverageReport.pdf";
Name: "{group}\docs\reports\Model Report"; Filename: "{app}\doc\ModelReport.pdf";
Name: "{group}\docs\reports\Tests Report"; Filename: "{app}\doc\TestCoverageReport.pdf";
Name: "{group}\EFS Workbench"; Filename: "{app}\bin\GUI.exe";
Name: "{group}\Uninstall EFS"; Filename: "{app}\unins000.exe";

; checking for .Net 3.5 installation
; courtesy of http://www.idev.ch/content/view/291/1/
[CustomMessages]
dotnetmissing=This application needs Microsoft .Net 4.0 which is not yet installed. Would you like to download it now?

[Code]
function InitializeSetup(): Boolean;
var
    ErrorCode: Integer;
    netFrameWorkInstalled : Boolean;
    isInstalled: Cardinal;
begin
  result := true;
 
  // Check for the .Net 3.5 framework
  isInstalled := 0;
  netFrameworkInstalled := RegQueryDWordValue(HKLM, 'SOFTWARE\Microsoft\NET Framework Setup\NDP\v4\Client', 'Install', isInstalled);
  if ((netFrameworkInstalled)  and (isInstalled <> 1)) then netFrameworkInstalled := false;
 
  if netFrameworkInstalled = false then
  begin
    if (MsgBox(ExpandConstant('{cm:dotnetmissing}'),
        mbConfirmation, MB_YESNO) = idYes) then
    begin
      ShellExec('open',
      'http://www.microsoft.com/en-us/download/details.aspx?id=17851',
      '','',SW_SHOWNORMAL,ewNoWait,ErrorCode);
    end;
    result := false;
  end;
end;

