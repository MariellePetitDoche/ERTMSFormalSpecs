.phony:all clean env
.default:all

all: 
	@make -C XmlBooster all 
	@make -C Utils all 
	@make -C DataDictionary all 
	@make -C Reports all 
	@make -C Importers all 
	@make -C GUI all 
	@make -C EFSTester all

clean:
	@make -C XmlBooster clean 
	@make -C Utils clean
	@make -C DataDictionary clean 
	@make -C Reports clean 
	@make -C Importers clean 
	@make -C GUI clean 
	@make -C EFSTester clean 

release: all Installer/EFSW_Installer_Script.iss	
	@echo === Building Installer package	
	@../depends/InnoInstaller5/ISCC.exe Installer/EFSW_Installer_Script.iss /q

