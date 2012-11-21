.PHONY: all release gitclone nightbuild clean

all:
	@make -C depends all
	@make -C src all

release: clean
	@make -C depends all
	@make -C src release

gitclone:
	-rm -rf ERTMSFormalSpecs
	../tools/Git/bin/git.exe clone https://github.com/stanpinte/ERTMSFormalSpecs.git
	cp -r ERTMSFormalSpecs/ErtmsFormalSpecs/* .

nightbuild: gitclone release
	bin/EFSTester.exe doc/specs/subset-026.efs
	@echo "done."

clean:
	@rm -rf bin
	@make -C depends clean
	@make -C src clean
	@rm -rf bin distrib distrib.zip
	@mkdir bin

