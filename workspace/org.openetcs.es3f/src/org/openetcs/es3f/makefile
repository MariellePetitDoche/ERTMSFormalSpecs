RCSCRIPT_ROOT=/cygdrive/c/yafl/bin
ROOT_DIR=../../../../../..
RC_CALL=${RCSCRIPT_ROOT}/rc.exe 
META=$(ROOT_DIR)/ErtmsFormalSpecs/src/DataDictionary/DataDictionary

.phony: all clean 
.default: all

all: importer/Dictionary.java 
	 
importer/Dictionary.java : $(META).xmlb 
	make clean
	$(RC_CALL) generate_classes.rcs $<

clean:
	rm -rf importer/Dictionary.java



