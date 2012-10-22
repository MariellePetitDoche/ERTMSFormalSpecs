.PHONY: all release clean

all:
	@make -C depends all
	@make -C src all

release: clean
	@make -C depends all
	@make -C src release

nightbuild: release
	bin/EFSTester.exe doc/specs/subset-026.efs
	@echo "done."

clean:
	@rm -rf bin
	@make -C depends clean
	@make -C src clean
	@rm -rf bin distrib distrib.zip
	@mkdir bin

