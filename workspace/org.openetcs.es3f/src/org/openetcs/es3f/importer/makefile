RCSCRIPT_ROOT=/cygdrive/c/yafl/bin
ROOT_DIR=../../../../../../..
RC_CALL=${RCSCRIPT_ROOT}/rc.exe 
META=$(ROOT_DIR)/ErtmsFormalSpecs/src/DataDictionary/DataDictionary

.phony: all clean 
.default: all

all: Dictionary.java 
	 
Dictionary.java : $(META).xmlb 
	make clean
	$(RC_CALL) generate_classes.rcs $<

clean:
	rm -rf Dictionary.java



