#
# Makefile used to create data object thanks to XMLBooster
# Depends on the following variables
#  META : the name of the meta definition file, without .xmlb extension
#
XMLBOOSTER_ROOT=/cygdrive/c/yafl/bin
ROOT_DIR=../../../../../../..
XMLB_CALL=${XMLBOOSTER_ROOT}/xmlb2.exe -CFG=$(ROOT_DIR)/tools/xmlb/xmlbcfg.xml
META=$(ROOT_DIR)/ErtmsFormalSpecs/src/DataDictionary/DataDictionary

.phony: all clean 
.default: all

all: acceptor.java 
	 
acceptor.java : $(META).xmlb 
	make clean
	$(XMLB_CALL) -TARGETDIR=. -JAVA  $<

clean:
	rm -rf *.java


