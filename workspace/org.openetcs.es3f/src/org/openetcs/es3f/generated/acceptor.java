
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>acceptor</i></h3>
  * <br>
  * This code is generated automatically. It is not meant
  * to be maintained or even read. As it is generated, 
  * it does not follow any coding standard. Please refrain
  * from performing any change directly on this generated 
  * code, as it might be overwritten anytime.
  * <br>
  * This documentation is provided for information purposes
  * only, in order to make the generated API somehow more
  * understandable. It is meant to be a maintenance guide,
  * as this code is not meant to be maintained at all.
  */
public class acceptor
extends xmlBBaseAcceptor
{

public final static int aTITLE = 1;
public final static int aDEFINITION = 2;
public final static int aNOTE = 3;
public final static int aDELETED = 4;
public final static int aREQUIREMENT = 5;
public final static int aTABLE_HEADER = 6;
public final static int aPROBLEM = 7;

public final static int aOBU_AND_TRACK = 1;
public final static int aTRACK = 2;
public final static int aOBU = 3;

public final static int aBalise_RBC = 1;
public final static int aAny = 2;
public final static int aRBC = 3;
public final static int aBalise = 4;
public final static int aBalise_loop_RIU = 5;
public final static int aLoop = 6;
public final static int aBalise_RBC_RIU = 7;
public final static int aAny_ = 8;
public final static int aRIU = 9;
public final static int aRBC_RIU = 10;
public final static int aBalise_loop = 11;

public final static int adistance = 1;
public final static int agradient = 2;
public final static int alength = 3;
public final static int amiscellaneous = 4;
public final static int aclass_number = 5;
public final static int aidentity_number = 6;
public final static int aqualifier = 7;
public final static int atime_or_date = 8;
public final static int aspeed = 9;
public final static int atext = 10;

public final static int ainvalid = 1;
public final static int aenum = 2;
public final static int aunknown = 3;
public final static int ainfinite = 4;

public final static int a11 = 1;
public final static int a15 = 2;
public final static int a127 = 3;
public final static int a1022 = 4;
public final static int a255 = 5;
public final static int a7 = 6;
public final static int a1_55 = 7;
public final static int a126 = 8;
public final static int aE = 9;
public final static int a254 = 10;
public final static int a125 = 11;

public final static int m_s2 = 1;
public final static int q_scale = 2;
public final static int percent = 3;
public final static int abyte = 4;
public final static int abit = 5;
public final static int text_string_element = 6;
public final static int m = 7;
public final static int A = 8;
public final static int s = 9;
public final static int ms = 10;
public final static int km_h = 11;

public final static int a0_05 = 1;
public final static int a1 = 2;
public final static int a10 = 3;
public final static int a0_02 = 4;
public final static int aintegers = 5;
public final static int aNumbers = 6;
public final static int aBinary_Coded_Decimal = 7;
public final static int aNumber = 8;
public final static int aBitset = 9;
public final static int a5 = 10;

public final static int aIncoming = 1;
public final static int aOutgoing = 2;
public final static int aInternal = 3;
public final static int aInOut = 4;
public final static int aConstant = 5;

public final static int aEurobalise = 1;
public final static int aEuroloop = 2;
public final static int aValidatedTrainData = 3;
public final static int aRequestForShunting = 4;
public final static int aMARequest = 5;
public final static int aTrainPositionReport = 6;
public final static int aRequestToShortenMAIsGranted = 7;
public final static int aRequestToShortenMAIsRejected = 8;
public final static int aAcknowledgement = 9;
public final static int aAcknowledgementOfEmergencyStop = 10;
public final static int aTrackAheadFreeGranted = 11;
public final static int aEndOfMission = 12;
public final static int aRadioInFillRequest = 13;
public final static int aTrain_NoCompatibleVersionSupported = 14;
public final static int aTrain_InitiationOfACommunicationSession = 15;
public final static int aTrain_TerminationOfACommunicationSession = 16;
public final static int aSoMPositionReport = 17;
public final static int aTrain_SessionEstablished = 18;
public final static int aSRAuthorization = 19;
public final static int aMovementAuthority = 20;
public final static int aRecognitionOfExitFromTripMode = 21;
public final static int aAcknowledgementOfTrainData = 22;
public final static int aRequestToShortenMA = 23;
public final static int aConditionalEmergencyStop = 24;
public final static int aUnconditionalEmergencyStop = 25;
public final static int aRevocationOfEmergencyStop = 26;
public final static int aGeneralMessage = 27;
public final static int aSHRefused = 28;
public final static int aSHAuthorized = 29;
public final static int aRBCRIUSystemVersion = 30;
public final static int aMAWithShiftedLocationReference = 31;
public final static int aTrackAheadFreeRequest = 32;
public final static int aInFillMA = 33;
public final static int aTrack_InitiationOfACommunicationSession = 34;
public final static int aAcknowledgementOfTerminationOfACommunicationSession = 35;
public final static int aTrainRejected = 36;
public final static int aTrainAccepted = 37;
public final static int aSomPositionReportConfirmedByRBC = 38;
public final static int aAssignmentOfCoordinateSystem = 39;

public final static int aTrainToTrack = 1;
public final static int aTrackToTrain = 2;

public final static int Impl_NA = 1;
public final static int Impl_Implemented = 2;
public final static int Impl_NotImplementable = 3;
public final static int Impl_NewRevisionAvailable = 4;

public final static int StIO_NA = 1;
public final static int StIO_In = 2;
public final static int StIO_Out = 3;

public final static int StInterface_NA = 1;
public final static int StInterface_DMI = 2;
public final static int StInterface_RTM = 3;
public final static int StInterface_JRU = 4;
public final static int StInterface_TIU = 5;

public final static int StLevel_NA = 1;
public final static int StLevel_L0 = 2;
public final static int StLevel_L1 = 3;
public final static int StLevel_LSTM = 4;
public final static int StLevel_L2 = 5;
public final static int StLevel_L3 = 6;

public final static int Mode_NA = 1;
public final static int Mode_IS = 2;
public final static int Mode_NP = 3;
public final static int Mode_SF = 4;
public final static int Mode_SL = 5;
public final static int Mode_SB = 6;
public final static int Mode_SH = 7;
public final static int Mode_FS = 8;
public final static int Mode_UF = 9;
public final static int Mode_SR = 10;
public final static int Mode_OS = 11;
public final static int Mode_TR = 12;
public final static int Mode_PT = 13;
public final static int Mode_NL = 14;
public final static int Mode_SN = 15;
public final static int Mode_RE = 16;
public final static int Mode_LS = 17;
public final static int Mode_PSH = 18;

public final static int aVerification = 1;
public final static int aUpdateINTERNAL = 2;
public final static int aProcessing = 3;
public final static int aUpdateOUT = 4;
public final static int aCleanUp = 5;

public final static int aIntegerPrecision = 1;
public final static int aDoublePrecision = 2;

public final static int aEUROBALISE = 1;
public final static int aEUROLOOP = 2;
public final static int aEURORADIO = 3;


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_Paragraph_type (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'I':
{
ctxt.advance();
ctxt.accept3('T','L','E');
res = aTITLE;
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.acceptString ("BLE_HEADER");
res = aTABLE_HEADER;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1475)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
if (ctxt.lookAheadString("EQUIREMENT")){
res = aREQUIREMENT;
} else {
ctxt.moveBack(1);
res = aREQUIREMENT;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("ROBLEM")){
res = aPROBLEM;
} else {
ctxt.moveBack(1);
res = aREQUIREMENT;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAhead3('O','T','E')){
res = aNOTE;
} else {
ctxt.moveBack(1);
res = aREQUIREMENT;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAhead1('E')){
switch (ctxt.current()) {
case 'L':
{
ctxt.advance();
ctxt.acceptString ("ETED");
res = aDELETED;
break;
} // Case
case 'F':
{
ctxt.advance();
ctxt.acceptString ("INITION");
res = aDEFINITION;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1482)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aREQUIREMENT;
} // If
break;
} // Case
default:
res = aREQUIREMENT;
break;
} // Switch
return res;
}

public static  String  Enum_Paragraph_type_ToString (int v)
{
switch (v) {
 case aTITLE: return "TITLE";
 case aDEFINITION: return "DEFINITION";
 case aNOTE: return "NOTE";
 case aDELETED: return "DELETED";
 case aREQUIREMENT: return "REQUIREMENT";
 case aTABLE_HEADER: return "TABLE_HEADER";
 case aPROBLEM: return "PROBLEM";
} return "";
}

public static int StringTo_Enum_Paragraph_type( String  str)
{
if (str.equals("TITLE")){
  return aTITLE;
} // If
if (str.equals("DEFINITION")){
  return aDEFINITION;
} // If
if (str.equals("NOTE")){
  return aNOTE;
} // If
if (str.equals("DELETED")){
  return aDELETED;
} // If
if (str.equals("REQUIREMENT")){
  return aREQUIREMENT;
} // If
if (str.equals("TABLE_HEADER")){
  return aTABLE_HEADER;
} // If
if (str.equals("PROBLEM")){
  return aPROBLEM;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_Paragraph_scope (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("RACK")){
res = aTRACK;
} else {
ctxt.moveBack(1);
res = aOBU_AND_TRACK;
} // If
break;
} // Case
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead2('B','U')){
switch (ctxt.current()) {
case '_':
{
ctxt.advance();
if (ctxt.lookAheadString("AND_TRACK")){
res = aOBU_AND_TRACK;
} else {
ctxt.moveBack(1);
res = aOBU;
} // If
break;
} // Case
default:
res = aOBU;
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aOBU_AND_TRACK;
} // If
break;
} // Case
default:
res = aOBU_AND_TRACK;
break;
} // Switch
return res;
}

public static  String  Enum_Paragraph_scope_ToString (int v)
{
switch (v) {
 case aOBU_AND_TRACK: return "OBU_AND_TRACK";
 case aTRACK: return "TRACK";
 case aOBU: return "OBU";
} return "";
}

public static int StringTo_Enum_Paragraph_scope( String  str)
{
if (str.equals("OBU_AND_TRACK")){
  return aOBU_AND_TRACK;
} // If
if (str.equals("TRACK")){
  return aTRACK;
} // If
if (str.equals("OBU")){
  return aOBU;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_Message_media (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'I':
{
ctxt.advance();
ctxt.accept('U');
res = aRIU;
break;
} // Case
case 'B':
{
ctxt.advance();
ctxt.accept('C');
switch (ctxt.current()) {
case ',':
{
ctxt.advance();
if (ctxt.lookAheadString(" RIU")){
res = aRBC_RIU;
} else {
ctxt.moveBack(1);
res = aRBC;
} // If
break;
} // Case
default:
res = aRBC;
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1490)");
break;
} // Switch
break;
} // Case
case 'L':
{
ctxt.advance();
if (ctxt.lookAhead3('o','o','p')){
res = aLoop;
} else {
ctxt.moveBack(1);
res = aAny_;
} // If
break;
} // Case
case 'B':
{
ctxt.advance();
if (ctxt.lookAheadString("alise")){
switch (ctxt.current()) {
case ',':
{
ctxt.advance();
if (ctxt.lookAhead1(' ')){
switch (ctxt.current()) {
case 'l':
{
ctxt.advance();
ctxt.acceptString ("oop, RIU");
res = aBalise_loop_RIU;
break;
} // Case
case 'R':
{
ctxt.advance();
ctxt.accept2('B','C');
switch (ctxt.current()) {
case ',':
{
ctxt.advance();
if (ctxt.lookAheadString(" RIU")){
res = aBalise_RBC_RIU;
} else {
ctxt.moveBack(1);
res = aBalise_RBC;
} // If
break;
} // Case
default:
res = aBalise_RBC;
break;
} // Switch
break;
} // Case
case 'L':
{
ctxt.advance();
ctxt.accept3('o','o','p');
res = aBalise_loop;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1498)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aBalise;
} // If
break;
} // Case
default:
res = aBalise;
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aAny_;
} // If
break;
} // Case
case 'A':
{
ctxt.advance();
if (ctxt.lookAhead2('n','y')){
switch (ctxt.current()) {
case ' ':
{
ctxt.advance();
res = aAny_;
break;
} // Case
default:
res = aAny;
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aAny_;
} // If
break;
} // Case
default:
res = aAny_;
break;
} // Switch
return res;
}

public static  String  Enum_Message_media_ToString (int v)
{
switch (v) {
 case aBalise_RBC: return "Balise, RBC";
 case aAny: return "Any";
 case aRBC: return "RBC";
 case aBalise: return "Balise";
 case aBalise_loop_RIU: return "Balise, loop, RIU";
 case aLoop: return "Loop";
 case aBalise_RBC_RIU: return "Balise, RBC, RIU";
 case aAny_: return "Any ";
 case aRIU: return "RIU";
 case aRBC_RIU: return "RBC, RIU";
 case aBalise_loop: return "Balise, Loop";
} return "";
}

public static int StringTo_Enum_Message_media( String  str)
{
if (str.equals("Balise, RBC")){
  return aBalise_RBC;
} // If
if (str.equals("Any")){
  return aAny;
} // If
if (str.equals("RBC")){
  return aRBC;
} // If
if (str.equals("Balise")){
  return aBalise;
} // If
if (str.equals("Balise, loop, RIU")){
  return aBalise_loop_RIU;
} // If
if (str.equals("Loop")){
  return aLoop;
} // If
if (str.equals("Balise, RBC, RIU")){
  return aBalise_RBC_RIU;
} // If
if (str.equals("Any ")){
  return aAny_;
} // If
if (str.equals("RIU")){
  return aRIU;
} // If
if (str.equals("RBC, RIU")){
  return aRBC_RIU;
} // If
if (str.equals("Balise, Loop")){
  return aBalise_loop;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_TypeSpec_ertms_type (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
ctxt.acceptString ("me-or-date");
res = atime_or_date;
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.accept2('x','t');
res = atext;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1504)");
break;
} // Switch
break;
} // Case
case 's':
{
ctxt.advance();
if (ctxt.lookAheadString("peed")){
res = aspeed;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'q':
{
ctxt.advance();
if (ctxt.lookAheadString("ualifier")){
res = aqualifier;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'm':
{
ctxt.advance();
if (ctxt.lookAheadString("iscellaneous")){
res = amiscellaneous;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'l':
{
ctxt.advance();
if (ctxt.lookAheadString("ength")){
res = alength;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'i':
{
ctxt.advance();
if (ctxt.lookAheadString("dentity-number")){
res = aidentity_number;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'g':
{
ctxt.advance();
if (ctxt.lookAheadString("radient")){
res = agradient;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'd':
{
ctxt.advance();
if (ctxt.lookAheadString("istance")){
res = adistance;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'c':
{
ctxt.advance();
if (ctxt.lookAheadString("lass-number")){
res = aclass_number;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_TypeSpec_ertms_type_ToString (int v)
{
switch (v) {
 case adistance: return "distance";
 case agradient: return "gradient";
 case alength: return "length";
 case amiscellaneous: return "miscellaneous";
 case aclass_number: return "class-number";
 case aidentity_number: return "identity-number";
 case aqualifier: return "qualifier";
 case atime_or_date: return "time-or-date";
 case aspeed: return "speed";
 case atext: return "text";
} return "";
}

public static int StringTo_Enum_TypeSpec_ertms_type( String  str)
{
if (str.equals("distance")){
  return adistance;
} // If
if (str.equals("gradient")){
  return agradient;
} // If
if (str.equals("length")){
  return alength;
} // If
if (str.equals("miscellaneous")){
  return amiscellaneous;
} // If
if (str.equals("class-number")){
  return aclass_number;
} // If
if (str.equals("identity-number")){
  return aidentity_number;
} // If
if (str.equals("qualifier")){
  return aqualifier;
} // If
if (str.equals("time-or-date")){
  return atime_or_date;
} // If
if (str.equals("speed")){
  return aspeed;
} // If
if (str.equals("text")){
  return atext;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_meaning_type (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAheadString("nknown")){
res = aunknown;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'i':
{
ctxt.advance();
if (ctxt.lookAhead1('n')){
switch (ctxt.current()) {
case 'v':
{
ctxt.advance();
ctxt.acceptString ("alid");
res = ainvalid;
break;
} // Case
case 'f':
{
ctxt.advance();
ctxt.acceptString ("inite");
res = ainfinite;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1517)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAhead3('n','u','m')){
res = aenum;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_meaning_type_ToString (int v)
{
switch (v) {
 case ainvalid: return "invalid";
 case aenum: return "enum";
 case aunknown: return "unknown";
 case ainfinite: return "infinite";
} return "";
}

public static int StringTo_Enum_meaning_type( String  str)
{
if (str.equals("invalid")){
  return ainvalid;
} // If
if (str.equals("enum")){
  return aenum;
} // If
if (str.equals("unknown")){
  return aunknown;
} // If
if (str.equals("infinite")){
  return ainfinite;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_maximum_Value (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'E':
{
ctxt.advance();
res = aE;
break;
} // Case
case '7':
{
ctxt.advance();
res = a7;
break;
} // Case
case '2':
{
ctxt.advance();
if (ctxt.lookAhead1('5')){
switch (ctxt.current()) {
case '5':
{
ctxt.advance();
res = a255;
break;
} // Case
case '4':
{
ctxt.advance();
res = a254;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1524)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case '1':
{
ctxt.advance();
switch (ctxt.current()) {
case '5':
{
ctxt.advance();
res = a15;
break;
} // Case
case '2':
{
ctxt.advance();
switch (ctxt.current()) {
case '7':
{
ctxt.advance();
res = a127;
break;
} // Case
case '6':
{
ctxt.advance();
res = a126;
break;
} // Case
case '5':
{
ctxt.advance();
res = a125;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1531)");
break;
} // Switch
break;
} // Case
case '1':
{
ctxt.advance();
res = a11;
break;
} // Case
case '0':
{
ctxt.advance();
ctxt.accept2('2','2');
res = a1022;
break;
} // Case
case '.':
{
ctxt.advance();
ctxt.accept2('5','5');
res = a1_55;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1535)");
break;
} // Switch
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_maximum_Value_ToString (int v)
{
switch (v) {
 case a11: return "11";
 case a15: return "15";
 case a127: return "127";
 case a1022: return "1022";
 case a255: return "255";
 case a7: return "7";
 case a1_55: return "1.55";
 case a126: return "126";
 case aE: return "E";
 case a254: return "254";
 case a125: return "125";
} return "";
}

public static int StringTo_Enum_maximum_Value( String  str)
{
if (str.equals("11")){
  return a11;
} // If
if (str.equals("15")){
  return a15;
} // If
if (str.equals("127")){
  return a127;
} // If
if (str.equals("1022")){
  return a1022;
} // If
if (str.equals("255")){
  return a255;
} // If
if (str.equals("7")){
  return a7;
} // If
if (str.equals("1.55")){
  return a1_55;
} // If
if (str.equals("126")){
  return a126;
} // If
if (str.equals("E")){
  return aE;
} // If
if (str.equals("254")){
  return a254;
} // If
if (str.equals("125")){
  return a125;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_resolution_formula_units (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
if (ctxt.lookAheadString("ext-string-element")){
res = text_string_element;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 's':
{
ctxt.advance();
res = s;
break;
} // Case
case 'q':
{
ctxt.advance();
if (ctxt.lookAheadString("_scale")){
res = q_scale;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'm':
{
ctxt.advance();
switch (ctxt.current()) {
case 's':
{
ctxt.advance();
res = ms;
break;
} // Case
case '/':
{
ctxt.advance();
if (ctxt.lookAhead2('s','2')){
res = m_s2;
} else {
ctxt.moveBack(1);
res = m;
} // If
break;
} // Case
default:
res = m;
break;
} // Switch
break;
} // Case
case 'k':
{
ctxt.advance();
if (ctxt.lookAhead3('m','/','h')){
res = km_h;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'b':
{
ctxt.advance();
switch (ctxt.current()) {
case 'y':
{
ctxt.advance();
ctxt.accept2('t','e');
res = abyte;
break;
} // Case
case 'i':
{
ctxt.advance();
ctxt.accept('t');
res = abit;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1546)");
break;
} // Switch
break;
} // Case
case 'A':
{
ctxt.advance();
res = A;
break;
} // Case
case '%':
{
ctxt.advance();
res = percent;
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_resolution_formula_units_ToString (int v)
{
switch (v) {
 case m_s2: return "m/s2";
 case q_scale: return "q_scale";
 case percent: return "%";
 case abyte: return "byte";
 case abit: return "bit";
 case text_string_element: return "text-string-element";
 case m: return "m";
 case A: return "A";
 case s: return "s";
 case ms: return "ms";
 case km_h: return "km/h";
} return "";
}

public static int StringTo_Enum_resolution_formula_units( String  str)
{
if (str.equals("m/s2")){
  return m_s2;
} // If
if (str.equals("q_scale")){
  return q_scale;
} // If
if (str.equals("%")){
  return percent;
} // If
if (str.equals("byte")){
  return abyte;
} // If
if (str.equals("bit")){
  return abit;
} // If
if (str.equals("text-string-element")){
  return text_string_element;
} // If
if (str.equals("m")){
  return m;
} // If
if (str.equals("A")){
  return A;
} // If
if (str.equals("s")){
  return s;
} // If
if (str.equals("ms")){
  return ms;
} // If
if (str.equals("km/h")){
  return km_h;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_resolution_formula_Value (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
if (ctxt.lookAheadString("ntegers")){
res = aintegers;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("umber")){
switch (ctxt.current()) {
case 's':
{
ctxt.advance();
res = aNumbers;
break;
} // Case
default:
res = aNumber;
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'B':
{
ctxt.advance();
if (ctxt.lookAhead1('i')){
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
ctxt.accept3('s','e','t');
res = aBitset;
break;
} // Case
case 'n':
{
ctxt.advance();
ctxt.acceptString ("ary Coded Decimal");
res = aBinary_Coded_Decimal;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1555)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case '5':
{
ctxt.advance();
res = a5;
break;
} // Case
case '1':
{
ctxt.advance();
switch (ctxt.current()) {
case '0':
{
ctxt.advance();
res = a10;
break;
} // Case
default:
res = a1;
break;
} // Switch
break;
} // Case
case '0':
{
ctxt.advance();
if (ctxt.lookAhead2('.','0')){
switch (ctxt.current()) {
case '5':
{
ctxt.advance();
res = a0_05;
break;
} // Case
case '2':
{
ctxt.advance();
res = a0_02;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1562)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_resolution_formula_Value_ToString (int v)
{
switch (v) {
 case a0_05: return "0.05";
 case a1: return "1";
 case a10: return "10";
 case a0_02: return "0.02";
 case aintegers: return "integers";
 case aNumbers: return "Numbers";
 case aBinary_Coded_Decimal: return "Binary Coded Decimal";
 case aNumber: return "Number";
 case aBitset: return "Bitset";
 case a5: return "5";
} return "";
}

public static int StringTo_Enum_resolution_formula_Value( String  str)
{
if (str.equals("0.05")){
  return a0_05;
} // If
if (str.equals("1")){
  return a1;
} // If
if (str.equals("10")){
  return a10;
} // If
if (str.equals("0.02")){
  return a0_02;
} // If
if (str.equals("integers")){
  return aintegers;
} // If
if (str.equals("Numbers")){
  return aNumbers;
} // If
if (str.equals("Binary Coded Decimal")){
  return aBinary_Coded_Decimal;
} // If
if (str.equals("Number")){
  return aNumber;
} // If
if (str.equals("Bitset")){
  return aBitset;
} // If
if (str.equals("5")){
  return a5;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_VariableModeEnumType (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
if (ctxt.lookAheadString("utgoing")){
res = aOutgoing;
} else {
ctxt.moveBack(1);
res = aInternal;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead1('n')){
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
ctxt.acceptString ("ernal");
res = aInternal;
break;
} // Case
case 'c':
{
ctxt.advance();
ctxt.acceptString ("oming");
res = aIncoming;
break;
} // Case
case 'O':
{
ctxt.advance();
ctxt.accept2('u','t');
res = aInOut;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1568)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aInternal;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("onstant")){
res = aConstant;
} else {
ctxt.moveBack(1);
res = aInternal;
} // If
break;
} // Case
default:
res = aInternal;
break;
} // Switch
return res;
}

public static  String  Enum_VariableModeEnumType_ToString (int v)
{
switch (v) {
 case aIncoming: return "Incoming";
 case aOutgoing: return "Outgoing";
 case aInternal: return "Internal";
 case aInOut: return "InOut";
 case aConstant: return "Constant";
} return "";
}

public static int StringTo_Enum_VariableModeEnumType( String  str)
{
if (str.equals("Incoming")){
  return aIncoming;
} // If
if (str.equals("Outgoing")){
  return aOutgoing;
} // If
if (str.equals("Internal")){
  return aInternal;
} // If
if (str.equals("InOut")){
  return aInOut;
} // If
if (str.equals("Constant")){
  return aConstant;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_MessageEnumType (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("alidatedTrainData")){
res = aValidatedTrainData;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'U':
{
ctxt.advance();
if (ctxt.lookAheadString("nconditionalEmergencyStop")){
res = aUnconditionalEmergencyStop;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAhead2('r','a')){
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
ctxt.accept('n');
switch (ctxt.current()) {
case '_':
{
ctxt.advance();
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
ctxt.acceptString ("erminationOfACommunicationSession");
res = aTrain_TerminationOfACommunicationSession;
break;
} // Case
case 'S':
{
ctxt.advance();
ctxt.acceptString ("essionEstablished");
res = aTrain_SessionEstablished;
break;
} // Case
case 'N':
{
ctxt.advance();
ctxt.acceptString ("oCompatibleVersionSupported");
res = aTrain_NoCompatibleVersionSupported;
break;
} // Case
case 'I':
{
ctxt.advance();
ctxt.acceptString ("nitiationOfACommunicationSession");
res = aTrain_InitiationOfACommunicationSession;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1579)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
ctxt.acceptString ("ejected");
res = aTrainRejected;
break;
} // Case
case 'P':
{
ctxt.advance();
ctxt.acceptString ("ositionReport");
res = aTrainPositionReport;
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.acceptString ("ccepted");
res = aTrainAccepted;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1583)");
break;
} // Switch
break;
} // Case
case 'c':
{
ctxt.advance();
ctxt.accept('k');
switch (ctxt.current()) {
case '_':
{
ctxt.advance();
ctxt.acceptString ("InitiationOfACommunicationSession");
res = aTrack_InitiationOfACommunicationSession;
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.acceptString ("headFree");
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
ctxt.acceptString ("equest");
res = aTrackAheadFreeRequest;
break;
} // Case
case 'G':
{
ctxt.advance();
ctxt.acceptString ("ranted");
res = aTrackAheadFreeGranted;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1589)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1590)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1591)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'S':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
switch (ctxt.current()) {
case 'm':
{
ctxt.advance();
ctxt.acceptString ("PositionReportConfirmedByRBC");
res = aSomPositionReportConfirmedByRBC;
break;
} // Case
case 'M':
{
ctxt.advance();
ctxt.acceptString ("PositionReport");
res = aSoMPositionReport;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1596)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
ctxt.acceptString ("Authorization");
res = aSRAuthorization;
break;
} // Case
case 'H':
{
ctxt.advance();
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
ctxt.acceptString ("efused");
res = aSHRefused;
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.acceptString ("uthorized");
res = aSHAuthorized;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1601)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1602)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'e':
{
ctxt.advance();
switch (ctxt.current()) {
case 'v':
{
ctxt.advance();
ctxt.acceptString ("ocationOfEmergencyStop");
res = aRevocationOfEmergencyStop;
break;
} // Case
case 'q':
{
ctxt.advance();
ctxt.acceptString ("uest");
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
ctxt.acceptString ("oShortenMA");
switch (ctxt.current()) {
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead1('s')){
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
ctxt.acceptString ("ejected");
res = aRequestToShortenMAIsRejected;
break;
} // Case
case 'G':
{
ctxt.advance();
ctxt.acceptString ("ranted");
res = aRequestToShortenMAIsGranted;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1611)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aRequestToShortenMA;
} // If
break;
} // Case
default:
res = aRequestToShortenMA;
break;
} // Switch
break;
} // Case
case 'F':
{
ctxt.advance();
ctxt.acceptString ("orShunting");
res = aRequestForShunting;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1613)");
break;
} // Switch
break;
} // Case
case 'c':
{
ctxt.advance();
ctxt.acceptString ("ognitionOfExitFromTripMode");
res = aRecognitionOfExitFromTripMode;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1615)");
break;
} // Switch
break;
} // Case
case 'a':
{
ctxt.advance();
ctxt.acceptString ("dioInFillRequest");
res = aRadioInFillRequest;
break;
} // Case
case 'B':
{
ctxt.advance();
ctxt.acceptString ("CRIUSystemVersion");
res = aRBCRIUSystemVersion;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1618)");
break;
} // Switch
break;
} // Case
case 'M':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
ctxt.acceptString ("vementAuthority");
res = aMovementAuthority;
break;
} // Case
case 'A':
{
ctxt.advance();
switch (ctxt.current()) {
case 'W':
{
ctxt.advance();
ctxt.acceptString ("ithShiftedLocationReference");
res = aMAWithShiftedLocationReference;
break;
} // Case
case 'R':
{
ctxt.advance();
ctxt.acceptString ("equest");
res = aMARequest;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1624)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1625)");
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("nFillMA")){
res = aInFillMA;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'G':
{
ctxt.advance();
if (ctxt.lookAheadString("eneralMessage")){
res = aGeneralMessage;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
ctxt.accept2('r','o');
switch (ctxt.current()) {
case 'l':
{
ctxt.advance();
ctxt.accept3('o','o','p');
res = aEuroloop;
break;
} // Case
case 'b':
{
ctxt.advance();
ctxt.acceptString ("alise");
res = aEurobalise;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1632)");
break;
} // Switch
break;
} // Case
case 'n':
{
ctxt.advance();
ctxt.acceptString ("dOfMission");
res = aEndOfMission;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1634)");
break;
} // Switch
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("onditionalEmergencyStop")){
res = aConditionalEmergencyStop;
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
case 'A':
{
ctxt.advance();
switch (ctxt.current()) {
case 's':
{
ctxt.advance();
ctxt.acceptString ("signmentOfCoordinateSystem");
res = aAssignmentOfCoordinateSystem;
break;
} // Case
case 'c':
{
ctxt.advance();
ctxt.acceptString ("knowledgement");
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead1('f')){
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
ctxt.acceptString ("ainData");
res = aAcknowledgementOfTrainData;
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("rminationOfACommunicationSession");
res = aAcknowledgementOfTerminationOfACommunicationSession;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1643)");
break;
} // Switch
break;
} // Case
case 'E':
{
ctxt.advance();
ctxt.acceptString ("mergencyStop");
res = aAcknowledgementOfEmergencyStop;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1645)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aAcknowledgement;
} // If
break;
} // Case
default:
res = aAcknowledgement;
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1646)");
break;
} // Switch
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_MessageEnumType_ToString (int v)
{
switch (v) {
 case aEurobalise: return "Eurobalise";
 case aEuroloop: return "Euroloop";
 case aValidatedTrainData: return "ValidatedTrainData";
 case aRequestForShunting: return "RequestForShunting";
 case aMARequest: return "MARequest";
 case aTrainPositionReport: return "TrainPositionReport";
 case aRequestToShortenMAIsGranted: return "RequestToShortenMAIsGranted";
 case aRequestToShortenMAIsRejected: return "RequestToShortenMAIsRejected";
 case aAcknowledgement: return "Acknowledgement";
 case aAcknowledgementOfEmergencyStop: return "AcknowledgementOfEmergencyStop";
 case aTrackAheadFreeGranted: return "TrackAheadFreeGranted";
 case aEndOfMission: return "EndOfMission";
 case aRadioInFillRequest: return "RadioInFillRequest";
 case aTrain_NoCompatibleVersionSupported: return "Train_NoCompatibleVersionSupported";
 case aTrain_InitiationOfACommunicationSession: return "Train_InitiationOfACommunicationSession";
 case aTrain_TerminationOfACommunicationSession: return "Train_TerminationOfACommunicationSession";
 case aSoMPositionReport: return "SoMPositionReport";
 case aTrain_SessionEstablished: return "Train_SessionEstablished";
 case aSRAuthorization: return "SRAuthorization";
 case aMovementAuthority: return "MovementAuthority";
 case aRecognitionOfExitFromTripMode: return "RecognitionOfExitFromTripMode";
 case aAcknowledgementOfTrainData: return "AcknowledgementOfTrainData";
 case aRequestToShortenMA: return "RequestToShortenMA";
 case aConditionalEmergencyStop: return "ConditionalEmergencyStop";
 case aUnconditionalEmergencyStop: return "UnconditionalEmergencyStop";
 case aRevocationOfEmergencyStop: return "RevocationOfEmergencyStop";
 case aGeneralMessage: return "GeneralMessage";
 case aSHRefused: return "SHRefused";
 case aSHAuthorized: return "SHAuthorized";
 case aRBCRIUSystemVersion: return "RBCRIUSystemVersion";
 case aMAWithShiftedLocationReference: return "MAWithShiftedLocationReference";
 case aTrackAheadFreeRequest: return "TrackAheadFreeRequest";
 case aInFillMA: return "InFillMA";
 case aTrack_InitiationOfACommunicationSession: return "Track_InitiationOfACommunicationSession";
 case aAcknowledgementOfTerminationOfACommunicationSession: return "AcknowledgementOfTerminationOfACommunicationSession";
 case aTrainRejected: return "TrainRejected";
 case aTrainAccepted: return "TrainAccepted";
 case aSomPositionReportConfirmedByRBC: return "SomPositionReportConfirmedByRBC";
 case aAssignmentOfCoordinateSystem: return "AssignmentOfCoordinateSystem";
} return "";
}

public static int StringTo_Enum_MessageEnumType( String  str)
{
if (str.equals("Eurobalise")){
  return aEurobalise;
} // If
if (str.equals("Euroloop")){
  return aEuroloop;
} // If
if (str.equals("ValidatedTrainData")){
  return aValidatedTrainData;
} // If
if (str.equals("RequestForShunting")){
  return aRequestForShunting;
} // If
if (str.equals("MARequest")){
  return aMARequest;
} // If
if (str.equals("TrainPositionReport")){
  return aTrainPositionReport;
} // If
if (str.equals("RequestToShortenMAIsGranted")){
  return aRequestToShortenMAIsGranted;
} // If
if (str.equals("RequestToShortenMAIsRejected")){
  return aRequestToShortenMAIsRejected;
} // If
if (str.equals("Acknowledgement")){
  return aAcknowledgement;
} // If
if (str.equals("AcknowledgementOfEmergencyStop")){
  return aAcknowledgementOfEmergencyStop;
} // If
if (str.equals("TrackAheadFreeGranted")){
  return aTrackAheadFreeGranted;
} // If
if (str.equals("EndOfMission")){
  return aEndOfMission;
} // If
if (str.equals("RadioInFillRequest")){
  return aRadioInFillRequest;
} // If
if (str.equals("Train_NoCompatibleVersionSupported")){
  return aTrain_NoCompatibleVersionSupported;
} // If
if (str.equals("Train_InitiationOfACommunicationSession")){
  return aTrain_InitiationOfACommunicationSession;
} // If
if (str.equals("Train_TerminationOfACommunicationSession")){
  return aTrain_TerminationOfACommunicationSession;
} // If
if (str.equals("SoMPositionReport")){
  return aSoMPositionReport;
} // If
if (str.equals("Train_SessionEstablished")){
  return aTrain_SessionEstablished;
} // If
if (str.equals("SRAuthorization")){
  return aSRAuthorization;
} // If
if (str.equals("MovementAuthority")){
  return aMovementAuthority;
} // If
if (str.equals("RecognitionOfExitFromTripMode")){
  return aRecognitionOfExitFromTripMode;
} // If
if (str.equals("AcknowledgementOfTrainData")){
  return aAcknowledgementOfTrainData;
} // If
if (str.equals("RequestToShortenMA")){
  return aRequestToShortenMA;
} // If
if (str.equals("ConditionalEmergencyStop")){
  return aConditionalEmergencyStop;
} // If
if (str.equals("UnconditionalEmergencyStop")){
  return aUnconditionalEmergencyStop;
} // If
if (str.equals("RevocationOfEmergencyStop")){
  return aRevocationOfEmergencyStop;
} // If
if (str.equals("GeneralMessage")){
  return aGeneralMessage;
} // If
if (str.equals("SHRefused")){
  return aSHRefused;
} // If
if (str.equals("SHAuthorized")){
  return aSHAuthorized;
} // If
if (str.equals("RBCRIUSystemVersion")){
  return aRBCRIUSystemVersion;
} // If
if (str.equals("MAWithShiftedLocationReference")){
  return aMAWithShiftedLocationReference;
} // If
if (str.equals("TrackAheadFreeRequest")){
  return aTrackAheadFreeRequest;
} // If
if (str.equals("InFillMA")){
  return aInFillMA;
} // If
if (str.equals("Track_InitiationOfACommunicationSession")){
  return aTrack_InitiationOfACommunicationSession;
} // If
if (str.equals("AcknowledgementOfTerminationOfACommunicationSession")){
  return aAcknowledgementOfTerminationOfACommunicationSession;
} // If
if (str.equals("TrainRejected")){
  return aTrainRejected;
} // If
if (str.equals("TrainAccepted")){
  return aTrainAccepted;
} // If
if (str.equals("SomPositionReportConfirmedByRBC")){
  return aSomPositionReportConfirmedByRBC;
} // If
if (str.equals("AssignmentOfCoordinateSystem")){
  return aAssignmentOfCoordinateSystem;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_MessageDirectionEnumType (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAhead2('r','a')){
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
ctxt.acceptString ("nToTrack");
res = aTrainToTrack;
break;
} // Case
case 'c':
{
ctxt.advance();
ctxt.acceptString ("kToTrain");
res = aTrackToTrain;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1650)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_MessageDirectionEnumType_ToString (int v)
{
switch (v) {
 case aTrainToTrack: return "TrainToTrack";
 case aTrackToTrain: return "TrackToTrain";
} return "";
}

public static int StringTo_Enum_MessageDirectionEnumType( String  str)
{
if (str.equals("TrainToTrack")){
  return aTrainToTrack;
} // If
if (str.equals("TrackToTrain")){
  return aTrackToTrain;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_SPEC_IMPLEMENTED_ENUM (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'N':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
ctxt.acceptString ("tImplementable");
res = Impl_NotImplementable;
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("wRevisionAvailable");
res = Impl_NewRevisionAvailable;
break;
} // Case
case 'A':
{
ctxt.advance();
res = Impl_NA;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1655)");
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented")){
res = Impl_Implemented;
} else {
ctxt.moveBack(1);
res = Impl_NA;
} // If
break;
} // Case
default:
res = Impl_NA;
break;
} // Switch
return res;
}

public static  String  Enum_SPEC_IMPLEMENTED_ENUM_ToString (int v)
{
switch (v) {
 case Impl_NA: return "NA";
 case Impl_Implemented: return "Implemented";
 case Impl_NotImplementable: return "NotImplementable";
 case Impl_NewRevisionAvailable: return "NewRevisionAvailable";
} return "";
}

public static int StringTo_Enum_SPEC_IMPLEMENTED_ENUM( String  str)
{
if (str.equals("NA")){
  return Impl_NA;
} // If
if (str.equals("Implemented")){
  return Impl_Implemented;
} // If
if (str.equals("NotImplementable")){
  return Impl_NotImplementable;
} // If
if (str.equals("NewRevisionAvailable")){
  return Impl_NewRevisionAvailable;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_ST_IO (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead2('u','t')){
res = StIO_Out;
} else {
ctxt.moveBack(1);
res = StIO_NA;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAhead1('A')){
res = StIO_NA;
} else {
ctxt.moveBack(1);
res = StIO_NA;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead1('n')){
res = StIO_In;
} else {
ctxt.moveBack(1);
res = StIO_NA;
} // If
break;
} // Case
default:
res = StIO_NA;
break;
} // Switch
return res;
}

public static  String  Enum_ST_IO_ToString (int v)
{
switch (v) {
 case StIO_NA: return "NA";
 case StIO_In: return "In";
 case StIO_Out: return "Out";
} return "";
}

public static int StringTo_Enum_ST_IO( String  str)
{
if (str.equals("NA")){
  return StIO_NA;
} // If
if (str.equals("In")){
  return StIO_In;
} // If
if (str.equals("Out")){
  return StIO_Out;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_ST_INTERFACE (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAhead2('I','U')){
res = StInterface_TIU;
} else {
ctxt.moveBack(1);
res = StInterface_NA;
} // If
break;
} // Case
case 'R':
{
ctxt.advance();
if (ctxt.lookAhead2('T','M')){
res = StInterface_RTM;
} else {
ctxt.moveBack(1);
res = StInterface_NA;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAhead1('A')){
res = StInterface_NA;
} else {
ctxt.moveBack(1);
res = StInterface_NA;
} // If
break;
} // Case
case 'J':
{
ctxt.advance();
if (ctxt.lookAhead2('R','U')){
res = StInterface_JRU;
} else {
ctxt.moveBack(1);
res = StInterface_NA;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAhead2('M','I')){
res = StInterface_DMI;
} else {
ctxt.moveBack(1);
res = StInterface_NA;
} // If
break;
} // Case
default:
res = StInterface_NA;
break;
} // Switch
return res;
}

public static  String  Enum_ST_INTERFACE_ToString (int v)
{
switch (v) {
 case StInterface_NA: return "NA";
 case StInterface_DMI: return "DMI";
 case StInterface_RTM: return "RTM";
 case StInterface_JRU: return "JRU";
 case StInterface_TIU: return "TIU";
} return "";
}

public static int StringTo_Enum_ST_INTERFACE( String  str)
{
if (str.equals("NA")){
  return StInterface_NA;
} // If
if (str.equals("DMI")){
  return StInterface_DMI;
} // If
if (str.equals("RTM")){
  return StInterface_RTM;
} // If
if (str.equals("JRU")){
  return StInterface_JRU;
} // If
if (str.equals("TIU")){
  return StInterface_TIU;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_ST_LEVEL (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'N':
{
ctxt.advance();
if (ctxt.lookAhead1('A')){
res = StLevel_NA;
} else {
ctxt.moveBack(1);
res = StLevel_NA;
} // If
break;
} // Case
case 'L':
{
ctxt.advance();
switch (ctxt.current()) {
case 'S':
{
ctxt.advance();
ctxt.accept2('T','M');
res = StLevel_LSTM;
break;
} // Case
case '3':
{
ctxt.advance();
res = StLevel_L3;
break;
} // Case
case '2':
{
ctxt.advance();
res = StLevel_L2;
break;
} // Case
case '1':
{
ctxt.advance();
res = StLevel_L1;
break;
} // Case
case '0':
{
ctxt.advance();
res = StLevel_L0;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1672)");
break;
} // Switch
break;
} // Case
default:
res = StLevel_NA;
break;
} // Switch
return res;
}

public static  String  Enum_ST_LEVEL_ToString (int v)
{
switch (v) {
 case StLevel_NA: return "NA";
 case StLevel_L0: return "L0";
 case StLevel_L1: return "L1";
 case StLevel_LSTM: return "LSTM";
 case StLevel_L2: return "L2";
 case StLevel_L3: return "L3";
} return "";
}

public static int StringTo_Enum_ST_LEVEL( String  str)
{
if (str.equals("NA")){
  return StLevel_NA;
} // If
if (str.equals("L0")){
  return StLevel_L0;
} // If
if (str.equals("L1")){
  return StLevel_L1;
} // If
if (str.equals("LSTM")){
  return StLevel_LSTM;
} // If
if (str.equals("L2")){
  return StLevel_L2;
} // If
if (str.equals("L3")){
  return StLevel_L3;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_ST_MODE (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'U':
{
ctxt.advance();
if (ctxt.lookAhead1('F')){
res = Mode_UF;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAhead1('R')){
res = Mode_TR;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'S':
{
ctxt.advance();
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
res = Mode_SR;
break;
} // Case
case 'N':
{
ctxt.advance();
res = Mode_SN;
break;
} // Case
case 'L':
{
ctxt.advance();
res = Mode_SL;
break;
} // Case
case 'H':
{
ctxt.advance();
res = Mode_SH;
break;
} // Case
case 'F':
{
ctxt.advance();
res = Mode_SF;
break;
} // Case
case 'B':
{
ctxt.advance();
res = Mode_SB;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1682)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
if (ctxt.lookAhead1('E')){
res = Mode_RE;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
res = Mode_PT;
break;
} // Case
case 'S':
{
ctxt.advance();
ctxt.accept('H');
res = Mode_PSH;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1687)");
break;
} // Switch
break;
} // Case
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead1('S')){
res = Mode_OS;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
res = Mode_NP;
break;
} // Case
case 'L':
{
ctxt.advance();
res = Mode_NL;
break;
} // Case
case 'A':
{
ctxt.advance();
res = Mode_NA;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1693)");
break;
} // Switch
break;
} // Case
case 'L':
{
ctxt.advance();
if (ctxt.lookAhead1('S')){
res = Mode_LS;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead1('S')){
res = Mode_IS;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAhead1('S')){
res = Mode_FS;
} else {
ctxt.moveBack(1);
res = Mode_NA;
} // If
break;
} // Case
default:
res = Mode_NA;
break;
} // Switch
return res;
}

public static  String  Enum_ST_MODE_ToString (int v)
{
switch (v) {
 case Mode_NA: return "NA";
 case Mode_IS: return "IS";
 case Mode_NP: return "NP";
 case Mode_SF: return "SF";
 case Mode_SL: return "SL";
 case Mode_SB: return "SB";
 case Mode_SH: return "SH";
 case Mode_FS: return "FS";
 case Mode_UF: return "UF";
 case Mode_SR: return "SR";
 case Mode_OS: return "OS";
 case Mode_TR: return "TR";
 case Mode_PT: return "PT";
 case Mode_NL: return "NL";
 case Mode_SN: return "SN";
 case Mode_RE: return "RE";
 case Mode_LS: return "LS";
 case Mode_PSH: return "PSH";
} return "";
}

public static int StringTo_Enum_ST_MODE( String  str)
{
if (str.equals("NA")){
  return Mode_NA;
} // If
if (str.equals("IS")){
  return Mode_IS;
} // If
if (str.equals("NP")){
  return Mode_NP;
} // If
if (str.equals("SF")){
  return Mode_SF;
} // If
if (str.equals("SL")){
  return Mode_SL;
} // If
if (str.equals("SB")){
  return Mode_SB;
} // If
if (str.equals("SH")){
  return Mode_SH;
} // If
if (str.equals("FS")){
  return Mode_FS;
} // If
if (str.equals("UF")){
  return Mode_UF;
} // If
if (str.equals("SR")){
  return Mode_SR;
} // If
if (str.equals("OS")){
  return Mode_OS;
} // If
if (str.equals("TR")){
  return Mode_TR;
} // If
if (str.equals("PT")){
  return Mode_PT;
} // If
if (str.equals("NL")){
  return Mode_NL;
} // If
if (str.equals("SN")){
  return Mode_SN;
} // If
if (str.equals("RE")){
  return Mode_RE;
} // If
if (str.equals("LS")){
  return Mode_LS;
} // If
if (str.equals("PSH")){
  return Mode_PSH;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_RulePriority (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erification")){
res = aVerification;
} else {
ctxt.moveBack(1);
res = aProcessing;
} // If
break;
} // Case
case 'U':
{
ctxt.advance();
if (ctxt.lookAheadString("pdate")){
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
ctxt.accept2('U','T');
res = aUpdateOUT;
break;
} // Case
case 'I':
{
ctxt.advance();
ctxt.acceptString ("NTERNAL");
res = aUpdateINTERNAL;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1701)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = aProcessing;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocessing")){
res = aProcessing;
} else {
ctxt.moveBack(1);
res = aProcessing;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("leanUp")){
res = aCleanUp;
} else {
ctxt.moveBack(1);
res = aProcessing;
} // If
break;
} // Case
default:
res = aProcessing;
break;
} // Switch
return res;
}

public static  String  Enum_RulePriority_ToString (int v)
{
switch (v) {
 case aVerification: return "Verification";
 case aUpdateINTERNAL: return "UpdateINTERNAL";
 case aProcessing: return "Processing";
 case aUpdateOUT: return "UpdateOUT";
 case aCleanUp: return "CleanUp";
} return "";
}

public static int StringTo_Enum_RulePriority( String  str)
{
if (str.equals("Verification")){
  return aVerification;
} // If
if (str.equals("UpdateINTERNAL")){
  return aUpdateINTERNAL;
} // If
if (str.equals("Processing")){
  return aProcessing;
} // If
if (str.equals("UpdateOUT")){
  return aUpdateOUT;
} // If
if (str.equals("CleanUp")){
  return aCleanUp;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_PrecisionEnum (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("ntegerPrecision")){
res = aIntegerPrecision;
} else {
ctxt.moveBack(1);
res = aIntegerPrecision;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("oublePrecision")){
res = aDoublePrecision;
} else {
ctxt.moveBack(1);
res = aIntegerPrecision;
} // If
break;
} // Case
default:
res = aIntegerPrecision;
break;
} // Switch
return res;
}

public static  String  Enum_PrecisionEnum_ToString (int v)
{
switch (v) {
 case aIntegerPrecision: return "IntegerPrecision";
 case aDoublePrecision: return "DoublePrecision";
} return "";
}

public static int StringTo_Enum_PrecisionEnum( String  str)
{
if (str.equals("IntegerPrecision")){
  return aIntegerPrecision;
} // If
if (str.equals("DoublePrecision")){
  return aDoublePrecision;
} // If
return -1;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int lAcceptEnum_DBMessageType (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator=0;
  int res = -1;
switch (ctxt.current()) {
case 'E':
{
ctxt.advance();
if (ctxt.lookAhead3('U','R','O')){
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
ctxt.acceptString ("ADIO");
res = aEURORADIO;
break;
} // Case
case 'L':
{
ctxt.advance();
ctxt.accept3('O','O','P');
res = aEUROLOOP;
break;
} // Case
case 'B':
{
ctxt.advance();
ctxt.acceptString ("ALISE");
res = aEUROBALISE;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1710)");
break;
} // Switch
} else {
ctxt.moveBack(1);
res = 0;
} // If
break;
} // Case
default:
res = 0;
break;
} // Switch
return res;
}

public static  String  Enum_DBMessageType_ToString (int v)
{
switch (v) {
 case aEUROBALISE: return "EUROBALISE";
 case aEUROLOOP: return "EUROLOOP";
 case aEURORADIO: return "EURORADIO";
} return "";
}

public static int StringTo_Enum_DBMessageType( String  str)
{
if (str.equals("EUROBALISE")){
  return aEUROBALISE;
} // If
if (str.equals("EUROLOOP")){
  return aEUROLOOP;
} // If
if (str.equals("EURORADIO")){
  return aEURORADIO;
} // If
return -1;
}

public String getEncoding()
{
  return new  String ("ISO-8859-1");
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static boolean lAcceptBoolean (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  int indicator = 0;
  boolean res = false;
switch (ctxt.current()) {
case 'y':
{
ctxt.advance();
switch (ctxt.current()) {
case 'e':
{
ctxt.advance();
if (ctxt.lookAhead1('s')){
res = true;
} else {
res = true;
} // If
break;
} // Case
default:
res = true;
break;
} // Switch
break;
} // Case
case 't':
{
ctxt.advance();
ctxt.accept3('r','u','e');
res = true;
break;
} // Case
case 'o':
{
ctxt.advance();
switch (ctxt.current()) {
case 'n':
{
ctxt.advance();
res = true;
break;
} // Case
case 'f':
{
ctxt.advance();
ctxt.accept('f');
res = false;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1717)");
break;
} // Switch
break;
} // Case
case 'n':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
res = false;
break;
} // Case
default:
res = false;
break;
} // Switch
break;
} // Case
case 'f':
{
ctxt.advance();
ctxt.acceptString ("alse");
res = false;
break;
} // Case
case 'Y':
{
ctxt.advance();
switch (ctxt.current()) {
case 'E':
{
ctxt.advance();
if (ctxt.lookAhead1('S')){
res = true;
} else {
res = true;
} // If
break;
} // Case
default:
res = true;
break;
} // Switch
break;
} // Case
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
ctxt.accept2('u','e');
res = true;
break;
} // Case
case 'R':
{
ctxt.advance();
ctxt.accept2('U','E');
res = true;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1726)");
break;
} // Switch
break;
} // Case
case 'O':
{
ctxt.advance();
switch (ctxt.current()) {
case 'n':
{
ctxt.advance();
res = true;
break;
} // Case
case 'f':
{
ctxt.advance();
ctxt.accept('f');
res = false;
break;
} // Case
case 'N':
{
ctxt.advance();
res = true;
break;
} // Case
case 'F':
{
ctxt.advance();
ctxt.accept('F');
res = false;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1732)");
break;
} // Switch
break;
} // Case
case 'N':
{
ctxt.advance();
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
res = false;
break;
} // Case
default:
res = false;
break;
} // Switch
break;
} // Case
case 'F':
{
ctxt.advance();
switch (ctxt.current()) {
case 'a':
{
ctxt.advance();
ctxt.accept3('l','s','e');
res = false;
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.accept3('L','S','E');
res = false;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1738)");
break;
} // Switch
break;
} // Case
case '1':
{
ctxt.advance();
res = true;
break;
} // Case
case '0':
{
ctxt.advance();
res = false;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1741)");
break;
} // Switch
return res;
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Namable lAccept_Poly_Namable (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
    char quoteChar;
    Namable res = null;
ctxt.skipWhiteSpace();
ctxt.acceptString ("xsi:type=");
quoteChar = ctxt.acceptQuote();
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("ariable")){
ctxt.accept(quoteChar);
res = lAccept_Variable(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("anslation")){
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("ictionary")){
ctxt.accept(quoteChar);
res = lAccept_TranslationDictionary(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Translation(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Translation(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAheadString("stCase")){
ctxt.accept(quoteChar);
res = lAccept_TestCase(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'S':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAhead2('b','S')){
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
if (ctxt.lookAhead2('e','p')){
ctxt.accept(quoteChar);
res = lAccept_SubStep(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAheadString("quence")){
ctxt.accept(quoteChar);
res = lAccept_SubSequence(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 't':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ucture")){
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocedure")){
ctxt.accept(quoteChar);
res = lAccept_StructureProcedure(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAheadString("lement")){
ctxt.accept(quoteChar);
res = lAccept_StructureElement(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAhead1('p')){
ctxt.accept(quoteChar);
res = lAccept_Step(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead2('t','e')){
switch (ctxt.current()) {
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("achine")){
ctxt.accept(quoteChar);
res = lAccept_StateMachine(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'p':
{
ctxt.advance();
if (ctxt.lookAheadString("ecification")){
ctxt.accept(quoteChar);
res = lAccept_Specification(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'o':
{
ctxt.advance();
if (ctxt.lookAheadString("urceText")){
ctxt.accept(quoteChar);
res = lAccept_SourceText(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'h':
{
ctxt.advance();
if (ctxt.lookAheadString("ortcut")){
switch (ctxt.current()) {
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("older")){
ctxt.accept(quoteChar);
res = lAccept_ShortcutFolder(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Shortcut(ctxt, endingTag);
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("ictionary")){
ctxt.accept(quoteChar);
res = lAccept_ShortcutDictionary(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Shortcut(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Shortcut(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAhead2('l','e')){
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("isabling")){
ctxt.accept(quoteChar);
res = lAccept_RuleDisabling(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ondition")){
ctxt.accept(quoteChar);
res = lAccept_RuleCondition(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('n','g','e')){
ctxt.accept(quoteChar);
res = lAccept_Range(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'P':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ocedure")){
ctxt.accept(quoteChar);
res = lAccept_Procedure(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead2('r','a')){
switch (ctxt.current()) {
case 'm':
{
ctxt.advance();
if (ctxt.lookAheadString("eter")){
ctxt.accept(quoteChar);
res = lAccept_Parameter(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'g':
{
ctxt.advance();
if (ctxt.lookAheadString("raph")){
ctxt.accept(quoteChar);
res = lAccept_Paragraph(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ameSpace")){
ctxt.accept(quoteChar);
res = lAccept_NameSpace(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAheadString("nction")){
ctxt.accept(quoteChar);
res = lAccept_Function(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'r':
{
ctxt.advance();
if (ctxt.lookAhead3('a','m','e')){
ctxt.accept(quoteChar);
res = lAccept_Frame(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'o':
{
ctxt.advance();
if (ctxt.lookAheadString("lder")){
ctxt.accept(quoteChar);
res = lAccept_Folder(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'E':
{
ctxt.advance();
switch (ctxt.current()) {
case 'x':
{
ctxt.advance();
if (ctxt.lookAheadString("pectation")){
ctxt.accept(quoteChar);
res = lAccept_Expectation(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'n':
{
ctxt.advance();
if (ctxt.lookAhead2('u','m')){
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("alue")){
ctxt.accept(quoteChar);
res = lAccept_EnumValue(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Enum(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Enum(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAhead1('B')){
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("acket")){
ctxt.accept(quoteChar);
res = lAccept_DBPacket(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("essage")){
ctxt.accept(quoteChar);
res = lAccept_DBMessage(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("ield")){
ctxt.accept(quoteChar);
res = lAccept_DBField(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
if (ctxt.lookAheadString("llection")){
ctxt.accept(quoteChar);
res = lAccept_Collection(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'h':
{
ctxt.advance();
if (ctxt.lookAheadString("apter")){
ctxt.accept(quoteChar);
res = lAccept_Chapter(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead2('s','e')){
ctxt.accept(quoteChar);
res = lAccept_Case(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
default:
res = null;
break;
} // Switch
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ReferencesParagraph lAccept_Poly_ReferencesParagraph (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
    char quoteChar;
    ReferencesParagraph res = null;
ctxt.skipWhiteSpace();
ctxt.acceptString ("xsi:type=");
quoteChar = ctxt.acceptQuote();
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("ariable")){
ctxt.accept(quoteChar);
res = lAccept_Variable(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("estCase")){
ctxt.accept(quoteChar);
res = lAccept_TestCase(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'S':
{
ctxt.advance();
if (ctxt.lookAhead1('t')){
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ucture")){
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocedure")){
ctxt.accept(quoteChar);
res = lAccept_StructureProcedure(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAheadString("lement")){
ctxt.accept(quoteChar);
res = lAccept_StructureElement(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead2('t','e')){
switch (ctxt.current()) {
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("achine")){
ctxt.accept(quoteChar);
res = lAccept_StateMachine(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAhead2('l','e')){
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("isabling")){
ctxt.accept(quoteChar);
res = lAccept_RuleDisabling(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ondition")){
ctxt.accept(quoteChar);
res = lAccept_RuleCondition(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('n','g','e')){
ctxt.accept(quoteChar);
res = lAccept_Range(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'P':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ocedure")){
ctxt.accept(quoteChar);
res = lAccept_Procedure(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAheadString("ragraph")){
ctxt.accept(quoteChar);
res = lAccept_Paragraph(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("unction")){
ctxt.accept(quoteChar);
res = lAccept_Function(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAhead3('n','u','m')){
ctxt.accept(quoteChar);
res = lAccept_Enum(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ollection")){
ctxt.accept(quoteChar);
res = lAccept_Collection(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ReqRelated lAccept_Poly_ReqRelated (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
    char quoteChar;
    ReqRelated res = null;
ctxt.skipWhiteSpace();
ctxt.acceptString ("xsi:type=");
quoteChar = ctxt.acceptQuote();
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("ariable")){
ctxt.accept(quoteChar);
res = lAccept_Variable(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("estCase")){
ctxt.accept(quoteChar);
res = lAccept_TestCase(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'S':
{
ctxt.advance();
if (ctxt.lookAhead1('t')){
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ucture")){
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocedure")){
ctxt.accept(quoteChar);
res = lAccept_StructureProcedure(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAheadString("lement")){
ctxt.accept(quoteChar);
res = lAccept_StructureElement(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead2('t','e')){
switch (ctxt.current()) {
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("achine")){
ctxt.accept(quoteChar);
res = lAccept_StateMachine(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_State(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
if (ctxt.lookAhead2('l','e')){
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("isabling")){
ctxt.accept(quoteChar);
res = lAccept_RuleDisabling(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ondition")){
ctxt.accept(quoteChar);
res = lAccept_RuleCondition(ctxt, endingTag);
} else {
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
} // If
break;
} // Case
default:
ctxt.accept(quoteChar);
res = lAccept_Rule(ctxt, endingTag);
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('n','g','e')){
ctxt.accept(quoteChar);
res = lAccept_Range(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocedure")){
ctxt.accept(quoteChar);
res = lAccept_Procedure(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("unction")){
ctxt.accept(quoteChar);
res = lAccept_Function(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAhead3('n','u','m')){
ctxt.accept(quoteChar);
res = lAccept_Enum(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ollection")){
ctxt.accept(quoteChar);
res = lAccept_Collection(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Dictionary lAccept_Dictionary (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  Dictionary res = aFactory.createDictionary();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static RuleDisabling lAccept_RuleDisabling (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</RuleDisabling>";
  RuleDisabling res = aFactory.createRuleDisabling();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static NameSpace lAccept_NameSpace (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</NameSpace>";
  NameSpace res = aFactory.createNameSpace();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ReqRef lAccept_ReqRef (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  ReqRef res = aFactory.createReqRef();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Type lAccept_Poly_Type (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
    char quoteChar;
    Type res = null;
ctxt.skipWhiteSpace();
ctxt.acceptString ("xsi:type=");
quoteChar = ctxt.acceptQuote();
switch (ctxt.current()) {
case 'S':
{
ctxt.advance();
if (ctxt.lookAhead1('t')){
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("ucture")){
ctxt.accept(quoteChar);
res = lAccept_Structure(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAheadString("teMachine")){
ctxt.accept(quoteChar);
res = lAccept_StateMachine(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
} else {
res = null;
} // If
break;
} // Case
case 'R':
{
ctxt.advance();
if (ctxt.lookAheadString("ange")){
ctxt.accept(quoteChar);
res = lAccept_Range(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("unction")){
ctxt.accept(quoteChar);
res = lAccept_Function(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAhead3('n','u','m')){
ctxt.accept(quoteChar);
res = lAccept_Enum(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ollection")){
ctxt.accept(quoteChar);
res = lAccept_Collection(ctxt, endingTag);
} else {
res = null;
} // If
break;
} // Case
default:
res = null;
break;
} // Switch
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Enum lAccept_Enum (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Enum>";
  Enum res = aFactory.createEnum();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static EnumValue lAccept_EnumValue (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</EnumValue>";
  EnumValue res = aFactory.createEnumValue();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Range lAccept_Range (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Range>";
  Range res = aFactory.createRange();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Structure lAccept_Structure (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Structure>";
  Structure res = aFactory.createStructure();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static StructureElement lAccept_StructureElement (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</StructureElement>";
  StructureElement res = aFactory.createStructureElement();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static StructureProcedure lAccept_StructureProcedure (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</StructureProcedure>";
  StructureProcedure res = aFactory.createStructureProcedure();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Collection lAccept_Collection (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Collection>";
  Collection res = aFactory.createCollection();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Function lAccept_Function (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Function>";
  Function res = aFactory.createFunction();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Parameter lAccept_Parameter (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Parameter>";
  Parameter res = aFactory.createParameter();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Case lAccept_Case (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Case>";
  Case res = aFactory.createCase();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Procedure lAccept_Procedure (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Procedure>";
  Procedure res = aFactory.createProcedure();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static StateMachine lAccept_StateMachine (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</StateMachine>";
  StateMachine res = aFactory.createStateMachine();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static State lAccept_State (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</State>";
  State res = aFactory.createState();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Variable lAccept_Variable (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Variable>";
  Variable res = aFactory.createVariable();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Rule lAccept_Rule (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Rule>";
  Rule res = aFactory.createRule();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static RuleCondition lAccept_RuleCondition (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</RuleCondition>";
  RuleCondition res = aFactory.createRuleCondition();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static PreCondition lAccept_PreCondition (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  PreCondition res = aFactory.createPreCondition();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Action lAccept_Action (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  Action res = aFactory.createAction();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Frame lAccept_Frame (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Frame>";
  Frame res = aFactory.createFrame();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static SubSequence lAccept_SubSequence (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</SubSequence>";
  SubSequence res = aFactory.createSubSequence();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static TestCase lAccept_TestCase (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</TestCase>";
  TestCase res = aFactory.createTestCase();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Step lAccept_Step (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Step>";
  Step res = aFactory.createStep();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static SubStep lAccept_SubStep (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</SubStep>";
  SubStep res = aFactory.createSubStep();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Expectation lAccept_Expectation (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Expectation>";
  Expectation res = aFactory.createExpectation();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static DBMessage lAccept_DBMessage (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</DBMessage>";
  DBMessage res = aFactory.createDBMessage();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static DBPacket lAccept_DBPacket (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</DBPacket>";
  DBPacket res = aFactory.createDBPacket();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static DBField lAccept_DBField (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</DBField>";
  DBField res = aFactory.createDBField();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static TranslationDictionary lAccept_TranslationDictionary (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</TranslationDictionary>";
  TranslationDictionary res = aFactory.createTranslationDictionary();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Folder lAccept_Folder (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Folder>";
  Folder res = aFactory.createFolder();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Translation lAccept_Translation (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Translation>";
  Translation res = aFactory.createTranslation();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static SourceText lAccept_SourceText (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</SourceText>";
  SourceText res = aFactory.createSourceText();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ShortcutDictionary lAccept_ShortcutDictionary (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</ShortcutDictionary>";
  ShortcutDictionary res = aFactory.createShortcutDictionary();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ShortcutFolder lAccept_ShortcutFolder (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</ShortcutFolder>";
  ShortcutFolder res = aFactory.createShortcutFolder();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Shortcut lAccept_Shortcut (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Shortcut>";
  Shortcut res = aFactory.createShortcut();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Specification lAccept_Specification (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Specification>";
  Specification res = aFactory.createSpecification();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Chapter lAccept_Chapter (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Chapter>";
  Chapter res = aFactory.createChapter();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Paragraph lAccept_Paragraph (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
if (endingTag == null) endingTag = "</Paragraph>";
  Paragraph res = aFactory.createParagraph();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Message lAccept_Message (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  Message res = aFactory.createMessage();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static MsgVariable lAccept_MsgVariable (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  MsgVariable res = aFactory.createMsgVariable();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static TypeSpec lAccept_TypeSpec (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  TypeSpec res = aFactory.createTypeSpec();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static Values lAccept_Values (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  Values res = aFactory.createValues();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static special_or_reserved_values lAccept_special_or_reserved_values (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  special_or_reserved_values res = aFactory.createspecial_or_reserved_values();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static special_or_reserved_value lAccept_special_or_reserved_value (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  special_or_reserved_value res = aFactory.createspecial_or_reserved_value();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static mask lAccept_mask (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  mask res = aFactory.createmask();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static match lAccept_match (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  match res = aFactory.creatematch();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static meaning lAccept_meaning (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  meaning res = aFactory.createmeaning();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static match_range lAccept_match_range (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  match_range res = aFactory.creatematch_range();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static resolution_formula lAccept_resolution_formula (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  resolution_formula res = aFactory.createresolution_formula();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static value lAccept_value (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  value res = aFactory.createvalue();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static char_value lAccept_char_value (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  char_value res = aFactory.createchar_value();
  res.parse(ctxt, endingTag);
  return res;
  }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static ParagraphRevision lAccept_ParagraphRevision (xmlBContext ctxt, 
                          String  endingTag)
throws xmlBException, xmlBRecoveryException
  {
  ParagraphRevision res = aFactory.createParagraphRevision();
  res.parse(ctxt, endingTag);
  return res;
  }

/** Utility function which parse an entity character 
  * as defined in the XMLBooster configuration.
  * @param ctxt the context from which the data must be 
  *        parsed
  */
static char lAcceptPcDataChr(xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
    char c = (char)0;
    int indicator=0;
switch (ctxt.current()) {
case 'q':
{
ctxt.advance();
ctxt.acceptString ("uot;");
indicator = 1837;
break;
} // Case
case 'n':
{
ctxt.advance();
ctxt.acceptString ("bsp;");
indicator = 1836;
break;
} // Case
case 'l':
{
ctxt.advance();
ctxt.accept2('t',';');
indicator = 1834;
break;
} // Case
case 'g':
{
ctxt.advance();
ctxt.accept2('t',';');
indicator = 1835;
break;
} // Case
case 'a':
{
ctxt.advance();
switch (ctxt.current()) {
case 'p':
{
ctxt.advance();
ctxt.accept3('o','s',';');
indicator = 1838;
break;
} // Case
case 'm':
{
ctxt.advance();
ctxt.accept2('p',';');
indicator = 1833;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1846)");
break;
} // Switch
break;
} // Case
case '#':
{
ctxt.advance();
ctxt.accept('x');
indicator = 1839;
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1848)");
break;
} // Switch
switch (indicator) {
case 1833: {
c = XMLB_AMPERSAND;
break;
} // End of dispatch label
case 1834: {
c = XMLB_LESS;
break;
} // End of dispatch label
case 1835: {
c = XMLB_GREATER;
break;
} // End of dispatch label
case 1836: {
c = XMLB_NBSP;
break;
} // End of dispatch label
case 1837: {
c = XMLB_QUOT;
break;
} // End of dispatch label
case 1838: {
c = XMLB_APOS;
break;
} // End of dispatch label
case 1839: {
c = (char) ctxt.acceptHexa();
ctxt.accept(';');
break;
} // End of dispatch label
} // Dispatch
return c;
}
/** Utility function which parse a PCDATA component 
  * from a context. It takes the entities defined in the
  * in the configuration into account.
  * @param ctxt the context from which the data must be 
  *        parsed
  * @param maxLen the maximal number of characters that 
  *        can be read.
  * @param closingCh a character on which parsing must stop
  *        in addition to the standard &lt; character.
  * @param wsMode indicates PRESERVE (default), REPLACE or COLLAPSE.
  */
public static  String  lAcceptPcData(xmlBContext ctxt, 
                                   int maxLen,
                                   char closingCh,
                                   int wsMode)
throws xmlBException, xmlBRecoveryException
 {
    char ch;
    char lastch = '.';
    StringBuffer buff;
     String  res;

  buff = new StringBuffer();
  boolean go_on = true;
  while (go_on) 
{
  go_on = false;
  while ((ctxt.current() != '<') && (ctxt.current() != closingCh)) // while 1 
{
    ch = ctxt.current();
ctxt.advance();
if (ch == '&'){
ch = lAcceptPcDataChr(ctxt);
} else {
if (wsMode >= WS_REPLACE){
if (ch == '\t' || ch == '\n' || ch == '\r'){
ch = ' ';
} // If
if (wsMode == WS_COLLAPSE){
if ((ch == ' ') && ((lastch == ' ') || (buff.length() == 0))){
ch = (char)0;
} else {
lastch = ch;
} // If
} else {
lastch = ch;
} // If
} // If
} // If
if (ch != '\0'){
buff.append (ch);
} // If
}
// end while
if (ctxt.current() == '<'){
if (ctxt.lookAheadString("<![CDATA[")){
     String  cdata = ctxt.acceptUntil("]]>", true);
    buff.append (cdata);
    go_on = true;
} else {
if (ctxt.lookAhead2('<','?')){
ctxt.skipTill ('?');
ctxt.accept2('?','>');
go_on = true;
} else {
} // If
} // If
} // If
}
if (wsMode == WS_COLLAPSE && lastch == ' ' && buff. length() > 0){
res = buff.substring (0, buff.length() -1);
} else {
res = buff.toString();
} // If
if ((maxLen > 0) && (res.length() > maxLen)){
ctxt.recoverableFail ("Maximum length exceeded");
} // If
return res;
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  private static boolean requiresEscape (char a)
  {
    switch (a)
    {
      case XMLB_AMPERSAND:
      case XMLB_LESS:
      case XMLB_GREATER:
      case XMLB_QUOT:
      case XMLB_APOS:
        return true;
      default: break;
    }
    return false;
  }
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  private static boolean requiresEscape ( String  a)
  {
    for (int i=0; i < a.length(); i++)
    {
      if (requiresEscape(a.charAt(i)))
        return true;
    }
    return false	;
  }
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw,  String  a)
    {
      boolean escaped = false;
      
      if (a == null)
      {
          return;
      }
      escaped = requiresEscape (a);
      if (! escaped)
        pw.print (a);
      else
      {
        char c;
        for (int i = 0; i < a.length(); i++)
        {
          c = a.charAt(i);
          switch (c)
            {
              case XMLB_AMPERSAND:
                  pw.print("&amp;"); 
                  break;
              case XMLB_LESS:
                  pw.print("&lt;"); 
                  break;
              case XMLB_GREATER:
                  pw.print("&gt;"); 
                  break;
              case XMLB_QUOT:
                  pw.print("&quot;"); 
                  break;
              case XMLB_APOS:
                  pw.print("&apos;"); 
                  break;
               default: 
                   pw.print(c);
                   break;
            }
        }
      }
    }
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw, boolean flag)
    {
      if (flag)
        pw.print ("TRUE");
       else
        pw.print("FALSE");
    }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw, Object obj)
    {
      if (obj != null)
        unParsePcData (pw, obj.toString());
    }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw, int val)
    {
      pw.print (val);
    }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw, long val)
    {
      pw.print (val);
    }

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
  public static void unParsePcData (PrintWriter pw, double val)
    {
      xmlBConverter conv;
      conv = getConverter();
      if(conv != null)
        pw.print(conv.doubleToString(val));
       else
        pw.print (val);
    }



private static Factory aFactory = new Factory();
/** Sets the factory to introduce an indirection level
  * so that the user can externally define derived classes
  * to be used in place of the XMLBooster-generated 
  * classes.
  */
public static void setFactory (Factory f) { aFactory = f; }

/** Returns the currently active factory.
  */
public static Factory getFactory () { return aFactory; }
static private acceptor theOne = null;
static public acceptor getUnique()
{
  if (theOne == null) { theOne = new acceptor(); setUntypedAcceptor(theOne); }
  return theOne;
}

static public void setUnique(acceptor acc)
{
  theOne = acc;
}


/** Top level function to parse an Dictionary from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Dictionary acceptDictionary(xmlBContext ctxt)
throws xmlBException
  {
Dictionary res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Dictionary");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Dictionary(ctxt, "</Dictionary>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an RuleDisabling from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static RuleDisabling acceptRuleDisabling(xmlBContext ctxt)
throws xmlBException
  {
RuleDisabling res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<RuleDisabling");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_RuleDisabling(ctxt, "</RuleDisabling>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an NameSpace from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static NameSpace acceptNameSpace(xmlBContext ctxt)
throws xmlBException
  {
NameSpace res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<NameSpace");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_NameSpace(ctxt, "</NameSpace>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an ReqRef from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static ReqRef acceptReqRef(xmlBContext ctxt)
throws xmlBException
  {
ReqRef res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<ReqRef");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_ReqRef(ctxt, "</ReqRef>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Enum from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Enum acceptEnum(xmlBContext ctxt)
throws xmlBException
  {
Enum res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Enum");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Enum(ctxt, "</Enum>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an EnumValue from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static EnumValue acceptEnumValue(xmlBContext ctxt)
throws xmlBException
  {
EnumValue res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<EnumValue");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_EnumValue(ctxt, "</EnumValue>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Range from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Range acceptRange(xmlBContext ctxt)
throws xmlBException
  {
Range res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Range");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Range(ctxt, "</Range>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Structure from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Structure acceptStructure(xmlBContext ctxt)
throws xmlBException
  {
Structure res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Structure");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Structure(ctxt, "</Structure>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an StructureElement from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static StructureElement acceptStructureElement(xmlBContext ctxt)
throws xmlBException
  {
StructureElement res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<StructureElement");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_StructureElement(ctxt, "</StructureElement>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an StructureProcedure from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static StructureProcedure acceptStructureProcedure(xmlBContext ctxt)
throws xmlBException
  {
StructureProcedure res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<StructureProcedure");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_StructureProcedure(ctxt, "</StructureProcedure>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Collection from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Collection acceptCollection(xmlBContext ctxt)
throws xmlBException
  {
Collection res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Collection");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Collection(ctxt, "</Collection>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Function from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Function acceptFunction(xmlBContext ctxt)
throws xmlBException
  {
Function res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Function");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Function(ctxt, "</Function>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Parameter from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Parameter acceptParameter(xmlBContext ctxt)
throws xmlBException
  {
Parameter res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Parameter");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Parameter(ctxt, "</Parameter>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Case from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Case acceptCase(xmlBContext ctxt)
throws xmlBException
  {
Case res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Case");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Case(ctxt, "</Case>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Procedure from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Procedure acceptProcedure(xmlBContext ctxt)
throws xmlBException
  {
Procedure res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Procedure");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Procedure(ctxt, "</Procedure>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an StateMachine from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static StateMachine acceptStateMachine(xmlBContext ctxt)
throws xmlBException
  {
StateMachine res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<StateMachine");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_StateMachine(ctxt, "</StateMachine>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an State from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static State acceptState(xmlBContext ctxt)
throws xmlBException
  {
State res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<State");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_State(ctxt, "</State>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Variable from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Variable acceptVariable(xmlBContext ctxt)
throws xmlBException
  {
Variable res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Variable");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Variable(ctxt, "</Variable>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Rule from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Rule acceptRule(xmlBContext ctxt)
throws xmlBException
  {
Rule res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Rule");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Rule(ctxt, "</Rule>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an RuleCondition from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static RuleCondition acceptRuleCondition(xmlBContext ctxt)
throws xmlBException
  {
RuleCondition res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<RuleCondition");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_RuleCondition(ctxt, "</RuleCondition>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an PreCondition from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static PreCondition acceptPreCondition(xmlBContext ctxt)
throws xmlBException
  {
PreCondition res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<PreCondition");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_PreCondition(ctxt, "</PreCondition>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Action from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Action acceptAction(xmlBContext ctxt)
throws xmlBException
  {
Action res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Action");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Action(ctxt, "</Action>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Frame from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Frame acceptFrame(xmlBContext ctxt)
throws xmlBException
  {
Frame res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Frame");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Frame(ctxt, "</Frame>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an SubSequence from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static SubSequence acceptSubSequence(xmlBContext ctxt)
throws xmlBException
  {
SubSequence res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<SubSequence");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_SubSequence(ctxt, "</SubSequence>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an TestCase from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static TestCase acceptTestCase(xmlBContext ctxt)
throws xmlBException
  {
TestCase res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<TestCase");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_TestCase(ctxt, "</TestCase>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Step from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Step acceptStep(xmlBContext ctxt)
throws xmlBException
  {
Step res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Step");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Step(ctxt, "</Step>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an SubStep from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static SubStep acceptSubStep(xmlBContext ctxt)
throws xmlBException
  {
SubStep res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<SubStep");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_SubStep(ctxt, "</SubStep>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Expectation from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Expectation acceptExpectation(xmlBContext ctxt)
throws xmlBException
  {
Expectation res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Expectation");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Expectation(ctxt, "</Expectation>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an DBMessage from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static DBMessage acceptDBMessage(xmlBContext ctxt)
throws xmlBException
  {
DBMessage res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<DBMessage");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_DBMessage(ctxt, "</DBMessage>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an DBPacket from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static DBPacket acceptDBPacket(xmlBContext ctxt)
throws xmlBException
  {
DBPacket res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<DBPacket");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_DBPacket(ctxt, "</DBPacket>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an DBField from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static DBField acceptDBField(xmlBContext ctxt)
throws xmlBException
  {
DBField res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<DBField");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_DBField(ctxt, "</DBField>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an TranslationDictionary from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static TranslationDictionary acceptTranslationDictionary(xmlBContext ctxt)
throws xmlBException
  {
TranslationDictionary res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<TranslationDictionary");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_TranslationDictionary(ctxt, "</TranslationDictionary>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Folder from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Folder acceptFolder(xmlBContext ctxt)
throws xmlBException
  {
Folder res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Folder");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Folder(ctxt, "</Folder>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Translation from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Translation acceptTranslation(xmlBContext ctxt)
throws xmlBException
  {
Translation res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Translation");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Translation(ctxt, "</Translation>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an SourceText from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static SourceText acceptSourceText(xmlBContext ctxt)
throws xmlBException
  {
SourceText res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<SourceText");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_SourceText(ctxt, "</SourceText>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an ShortcutDictionary from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static ShortcutDictionary acceptShortcutDictionary(xmlBContext ctxt)
throws xmlBException
  {
ShortcutDictionary res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<ShortcutDictionary");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_ShortcutDictionary(ctxt, "</ShortcutDictionary>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an ShortcutFolder from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static ShortcutFolder acceptShortcutFolder(xmlBContext ctxt)
throws xmlBException
  {
ShortcutFolder res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<ShortcutFolder");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_ShortcutFolder(ctxt, "</ShortcutFolder>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Shortcut from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Shortcut acceptShortcut(xmlBContext ctxt)
throws xmlBException
  {
Shortcut res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Shortcut");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Shortcut(ctxt, "</Shortcut>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Specification from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Specification acceptSpecification(xmlBContext ctxt)
throws xmlBException
  {
Specification res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Specification");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Specification(ctxt, "</Specification>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Chapter from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Chapter acceptChapter(xmlBContext ctxt)
throws xmlBException
  {
Chapter res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Chapter");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Chapter(ctxt, "</Chapter>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an Paragraph from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static Paragraph acceptParagraph(xmlBContext ctxt)
throws xmlBException
  {
Paragraph res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<Paragraph");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_Paragraph(ctxt, "</Paragraph>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

/** Top level function to parse an ParagraphRevision from 
  * a context. This kind of function is only made
  * available for elements marked as MAIN in the 
  * metadefinition
  * @seealso #accept
  */
public static ParagraphRevision acceptParagraphRevision(xmlBContext ctxt)
throws xmlBException
  {
ParagraphRevision res;
ctxt.skipWhiteSpace();
try {
ctxt.acceptString ("<ParagraphRevision");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
  res = lAccept_ParagraphRevision(ctxt, "</ParagraphRevision>");
 } catch (xmlBRecoveryException e) {
  throw new xmlBException("Unexpected recovery exception: " +
     e.toString());
}
  ctxt.close();
if (ctxt.errCount() > 0){
res = null;
throw new xmlBException (ctxt.errorMessage());
} // If
  return res;
  }

public static xmlBBaseInter accept(xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
  xmlBBaseInter res = null;
ctxt.skipWhiteSpace();
switch (ctxt.current()) {
case '<':
{
ctxt.advance();
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
ctxt.acceptString ("ariable");
  res =  lAccept_Variable(ctxt, "</Variable>");
break;
} // Case
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
ctxt.acceptString ("anslation");
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("ictionary")){
  res =  lAccept_TranslationDictionary(ctxt, "</TranslationDictionary>");
} else {
  res =  lAccept_Translation(ctxt, "</Translation>");
} // If
break;
} // Case
default:
  res =  lAccept_Translation(ctxt, "</Translation>");
break;
} // Switch
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("stCase");
  res =  lAccept_TestCase(ctxt, "</TestCase>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1856)");
break;
} // Switch
break;
} // Case
case 'S':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
ctxt.accept2('b','S');
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
ctxt.accept2('e','p');
  res =  lAccept_SubStep(ctxt, "</SubStep>");
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("quence");
  res =  lAccept_SubSequence(ctxt, "</SubSequence>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1861)");
break;
} // Switch
break;
} // Case
case 't':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
ctxt.acceptString ("ucture");
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("rocedure")){
  res =  lAccept_StructureProcedure(ctxt, "</StructureProcedure>");
} else {
  res =  lAccept_Structure(ctxt, "</Structure>");
} // If
break;
} // Case
case 'E':
{
ctxt.advance();
if (ctxt.lookAheadString("lement")){
  res =  lAccept_StructureElement(ctxt, "</StructureElement>");
} else {
  res =  lAccept_Structure(ctxt, "</Structure>");
} // If
break;
} // Case
default:
  res =  lAccept_Structure(ctxt, "</Structure>");
break;
} // Switch
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.accept('p');
  res =  lAccept_Step(ctxt, "</Step>");
break;
} // Case
case 'a':
{
ctxt.advance();
ctxt.accept2('t','e');
switch (ctxt.current()) {
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("achine")){
  res =  lAccept_StateMachine(ctxt, "</StateMachine>");
} else {
  res =  lAccept_State(ctxt, "</State>");
} // If
break;
} // Case
default:
  res =  lAccept_State(ctxt, "</State>");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1869)");
break;
} // Switch
break;
} // Case
case 'p':
{
ctxt.advance();
ctxt.acceptString ("ecification");
  res =  lAccept_Specification(ctxt, "</Specification>");
break;
} // Case
case 'o':
{
ctxt.advance();
ctxt.acceptString ("urceText");
  res =  lAccept_SourceText(ctxt, "</SourceText>");
break;
} // Case
case 'h':
{
ctxt.advance();
ctxt.acceptString ("ortcut");
switch (ctxt.current()) {
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("older")){
  res =  lAccept_ShortcutFolder(ctxt, "</ShortcutFolder>");
} else {
  res =  lAccept_Shortcut(ctxt, "</Shortcut>");
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("ictionary")){
  res =  lAccept_ShortcutDictionary(ctxt, "</ShortcutDictionary>");
} else {
  res =  lAccept_Shortcut(ctxt, "</Shortcut>");
} // If
break;
} // Case
default:
  res =  lAccept_Shortcut(ctxt, "</Shortcut>");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1875)");
break;
} // Switch
break;
} // Case
case 'R':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
ctxt.accept2('l','e');
switch (ctxt.current()) {
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("isabling")){
  res =  lAccept_RuleDisabling(ctxt, "</RuleDisabling>");
} else {
  res =  lAccept_Rule(ctxt, "</Rule>");
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ondition")){
  res =  lAccept_RuleCondition(ctxt, "</RuleCondition>");
} else {
  res =  lAccept_Rule(ctxt, "</Rule>");
} // If
break;
} // Case
default:
  res =  lAccept_Rule(ctxt, "</Rule>");
break;
} // Switch
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("qRef");
  res =  lAccept_ReqRef(ctxt, null);
break;
} // Case
case 'a':
{
ctxt.advance();
ctxt.accept3('n','g','e');
  res =  lAccept_Range(ctxt, "</Range>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1882)");
break;
} // Switch
break;
} // Case
case 'P':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
ctxt.acceptString ("cedure");
  res =  lAccept_Procedure(ctxt, "</Procedure>");
break;
} // Case
case 'e':
{
ctxt.advance();
ctxt.acceptString ("Condition");
  res =  lAccept_PreCondition(ctxt, null);
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1887)");
break;
} // Switch
break;
} // Case
case 'a':
{
ctxt.advance();
ctxt.accept2('r','a');
switch (ctxt.current()) {
case 'm':
{
ctxt.advance();
ctxt.acceptString ("eter");
  res =  lAccept_Parameter(ctxt, "</Parameter>");
break;
} // Case
case 'g':
{
ctxt.advance();
ctxt.acceptString ("raph");
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
if (ctxt.lookAheadString("evision")){
  res =  lAccept_ParagraphRevision(ctxt, null);
} else {
  res =  lAccept_Paragraph(ctxt, "</Paragraph>");
} // If
break;
} // Case
default:
  res =  lAccept_Paragraph(ctxt, "</Paragraph>");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1892)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1893)");
break;
} // Switch
break;
} // Case
case 'N':
{
ctxt.advance();
ctxt.acceptString ("ameSpace");
  res =  lAccept_NameSpace(ctxt, "</NameSpace>");
break;
} // Case
case 'F':
{
ctxt.advance();
switch (ctxt.current()) {
case 'u':
{
ctxt.advance();
ctxt.acceptString ("nction");
  res =  lAccept_Function(ctxt, "</Function>");
break;
} // Case
case 'r':
{
ctxt.advance();
ctxt.accept3('a','m','e');
  res =  lAccept_Frame(ctxt, "</Frame>");
break;
} // Case
case 'o':
{
ctxt.advance();
ctxt.acceptString ("lder");
  res =  lAccept_Folder(ctxt, "</Folder>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1899)");
break;
} // Switch
break;
} // Case
case 'E':
{
ctxt.advance();
switch (ctxt.current()) {
case 'x':
{
ctxt.advance();
ctxt.acceptString ("pectation");
  res =  lAccept_Expectation(ctxt, "</Expectation>");
break;
} // Case
case 'n':
{
ctxt.advance();
ctxt.accept2('u','m');
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("alue")){
  res =  lAccept_EnumValue(ctxt, "</EnumValue>");
} else {
  res =  lAccept_Enum(ctxt, "</Enum>");
} // If
break;
} // Case
default:
  res =  lAccept_Enum(ctxt, "</Enum>");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1904)");
break;
} // Switch
break;
} // Case
case 'D':
{
ctxt.advance();
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
ctxt.acceptString ("ctionary");
  res =  lAccept_Dictionary(ctxt, null);
break;
} // Case
case 'B':
{
ctxt.advance();
switch (ctxt.current()) {
case 'P':
{
ctxt.advance();
ctxt.acceptString ("acket");
  res =  lAccept_DBPacket(ctxt, "</DBPacket>");
break;
} // Case
case 'M':
{
ctxt.advance();
ctxt.acceptString ("essage");
  res =  lAccept_DBMessage(ctxt, "</DBMessage>");
break;
} // Case
case 'F':
{
ctxt.advance();
ctxt.acceptString ("ield");
  res =  lAccept_DBField(ctxt, "</DBField>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1911)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1912)");
break;
} // Switch
break;
} // Case
case 'C':
{
ctxt.advance();
switch (ctxt.current()) {
case 'o':
{
ctxt.advance();
ctxt.acceptString ("llection");
  res =  lAccept_Collection(ctxt, "</Collection>");
break;
} // Case
case 'h':
{
ctxt.advance();
ctxt.acceptString ("apter");
  res =  lAccept_Chapter(ctxt, "</Chapter>");
break;
} // Case
case 'a':
{
ctxt.advance();
ctxt.accept2('s','e');
  res =  lAccept_Case(ctxt, "</Case>");
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1917)");
break;
} // Switch
break;
} // Case
case 'A':
{
ctxt.advance();
ctxt.acceptString ("ction");
  res =  lAccept_Action(ctxt, null);
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1919)");
break;
} // Switch
break;
} // Case
default:
ctxt.recoverableFail ("Other character expected (1920)");
break;
} // Switch
return res;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public boolean genericUnParse(PrintWriter pw, xmlBBaseInter obj)
{
  ((xmlBBase ) obj).unParse(pw, false);
  return true;
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static xmlBBaseInter[] subElements(xmlBBaseInter obj)
{
  return ((xmlBBase ) obj).subElements();
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public  xmlBBaseInter[] genericSubElements(xmlBBaseInter obj)
{
  return ((xmlBBase ) obj).subElements();
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public int genericNodeErrorLevel (xmlBBaseInter node)
{
  return nodeErrorLevel(node);
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int nodeErrorLevel (xmlBBaseInter node)
{
  int res = intrinsicNodeErrorLevel(node);
if (res > xmlBError.OK){
  return res;
} // If
xmlBBaseInter[] subs = subElements (node);
if (subs != null){
for(int i=0; i < subs.length; i++)
  {
  int k = nodeErrorLevel (subs[i]);
  if (k>res) res = k;
  }
} // If
  return xmlBError.Brutus(res);
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public static int nodeErrorLevel (java.util.ArrayList  coll)
{
  int res = xmlBError.UNKNOWN;
  for (int i=0; i < coll.size(); i++)
  {
    int k = nodeErrorLevel ((xmlBBaseInter) coll.get(i));
if (k > res){
res = k;
} // If
  }
  return res;
}
public xmlBBaseInter genericAccept (xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
  {
    return accept(ctxt);
  }
}
