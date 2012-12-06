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
using System.Text;
using System.Globalization;
using Microsoft.Office.Interop.Excel;
using DataDictionary;
using DataDictionary.Tests;
using TestAction = DataDictionary.Rules.Action;


namespace Importers
{
    public struct ExcelInporterConfig
    {
        public Dictionary TheDictionary;
        public Step       TheStep;
        public string     FrameName;
        public string     FileName;
        public double     SpeedInterval;
        public bool       FillEBD;
        public bool       FillSBD;
        public bool       FillEBI;
        public bool       FillSBI1;
        public bool       FillSBI2;
        public bool       FillFLOI;
        public bool       FillWarning;
        public bool       FillPermitted;
        public bool       FillIndication;
        public double     TargetSpeed;
    }





    public class ExcelImporter
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);


        /// <summary>
        /// Summarizes the details of the information to be imported
        /// </summary>
        public static ExcelInporterConfig TheConfig;



        // The sheets of the workbook are:                       \\
        //                                                       \\
        // Sheet number 1,  name: Train (main)                   \\
        // Sheet number 2,  name: Track                          \\
        // Sheet number 3,  name: National values                \\
        // Sheet number 4,  name: Fixed values                   \\
        // Sheet number 5,  name: Brake parameters (lambda)      \\  L
        // Sheet number 6,  name: Brake parameters (gamma)       \\  G
        // Sheet number 7,  name: Correction factor Kdry_rst     \\  G
        // Sheet number 8,  name: Integrated correction factors  \\  L
        // Sheet number 9,  name: Lambda train deceleration      \\  L
        // Sheet number 10, name: Gamma train deceleration       \\  G
        // Sheet number 11, name: Curves Gamma train             \\  G
        // Sheet number 12, name: Calc Gamma                     \\  G (hidden)
        // Sheet number 13, name: Curves Lambda train            \\  L
        // Sheet number 14, name: Calc Lambda                    \\  L (hidden)




        /// <summary>
        /// Launches import of the excel file
        /// </summary>
        /// <param name="arg"></param>
        public static void ImportExcelHandler(object arg)
        {
            if (TheConfig.TheDictionary != null)
            {
                Microsoft.Office.Interop.Excel.Application application = new Microsoft.Office.Interop.Excel.Application();
                if (application != null)
                {
                    Workbook  workbook      = application.Workbooks.Open(TheConfig.FileName);
                    Worksheet trainData     = workbook.Sheets[1] as Worksheet;
                    Range     aRange        = trainData.UsedRange;
                    string    trainTypeName = (string)(aRange.Cells[14, 4] as Range).Value2;
                    bool      trainIsGamma  = false;
                    if(trainTypeName.Equals("Gamma"))
                    {
                        trainIsGamma = true;
                    }
                    else if (!trainTypeName.Equals("Lambda"))
                    {
                        new Exception("Unknown train type");
                    }

                    Frame newFrame = new Frame();
                    newFrame.Name = TheConfig.FrameName;
                    TheConfig.TheDictionary.AddModelElement(newFrame);

                    SubSequence newSubSequence = new SubSequence();
                    newSubSequence.Name = TheConfig.FrameName;
                    newFrame.AddModelElement(newSubSequence);

                    TestCase aTestCase = new TestCase();
                    aTestCase.Name     = "Setup";
                    newSubSequence.AddModelElement(aTestCase);

                    intializeEFS(aTestCase, workbook);

                    aTestCase      = new TestCase();
                    aTestCase.Name = "Initialize input";
                    newSubSequence.AddModelElement(aTestCase);
                    if (trainIsGamma)
                    {
                        initializeInputForGamma(aTestCase, workbook);
                    }
                    else
                    {
                        initializeInputForLambda(aTestCase, workbook);
                    }

                    aTestCase      = new TestCase();
                    aTestCase.Name = "Verify input";
                    newSubSequence.AddModelElement(aTestCase);
                    if (trainIsGamma)
                    {
                        /// TODO
                        /*verifyInputForGamma(aTestCase, workbook);*/
                    }
                    else
                    {
                        verifyInputForLambda(aTestCase, workbook);
                    }

                    aTestCase      = new TestCase();
                    aTestCase.Name = "Verify output";
                    newSubSequence.AddModelElement(aTestCase);
                    verifyOutputForTrains(trainIsGamma, aTestCase, workbook);
                }
                else
                {
                    Log.ErrorFormat("Error while opening the excel file");
                }
                application.Quit();
            }
            else
            {
                if (TheConfig.TheStep != null)
                {
                    //importExpectations(workbook);
                }
                else
                {
                    Log.ErrorFormat("The import config is not properly initialized");
                }
            }
        }



        private static void intializeEFS(TestCase aTestCase, Workbook workbook)
        {
            Step aStep = new Step();
            aStep.Name = "Step1 - Setup";
            aTestCase.AddModelElement(aStep);

            SubStep aSubStep = new SubStep();
            aSubStep.Name    = "SubStep1 - Setup";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            TestAction levelInitialization = new TestAction();
            levelInitialization.Expression = "Kernel.Level <- Kernel.LevelData\n{\n    Value => Level.L1,\n    DataState => DataState.Valid\n}";
            aSubStep.AddModelElement(levelInitialization);

            TestAction odometryInitialization = new TestAction();
            odometryInitialization.Expression = "Odometry.NominalDistance <- 0.0";
            aSubStep.AddModelElement(odometryInitialization);
        }



        private static void initializeInputForGamma(TestCase aTestCase, Workbook workbook)
        {
            Step aStep = new Step();
            aStep.Name = "Step1 - Initialize input";
            aTestCase.AddModelElement(aStep);


            /*********************************** TRAIN DATA ***********************************/
            SubStep aSubStep = new SubStep();
            aSubStep.Name = "SubStep1 - Train data";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            /* This is a gamma train => we have to initialize brake models in the train data */
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.EBModels <- Kernel.TrainData.BrakingParameters.EBModelSet\n{{\n    ModelSet => Kernel.TrainData.BrakingParameters.BrakingModelSet{{}},\n    Kdry_rstValuesSet => Kernel.TrainData.BrakingParameters.Kdry_rstValuesSet{{}},\n    Kwet_rstValuesSet => Kernel.TrainData.BrakingParameters.Kwet_rstValuesSet{{}}\n}}"));
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.SBModels <- Kernel.TrainData.BrakingParameters.SBModelSet{{}}"));
            
            Worksheet aWorksheet = workbook.Sheets[1] as Worksheet;
            bool isPassengerTrain;
            importCommonTrainDataInformation(aSubStep, aWorksheet, out isPassengerTrain);



            /*********************************** TRACK DATA ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep2 - Track data";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[2] as Worksheet;
            importCommonTrackDataInformation(aSubStep, aWorksheet);



            /*********************************** NATIONAL VALUES ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep3 - National values";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[3] as Worksheet;
            importCommonNationalValuesInformation(aSubStep, aWorksheet);



            /*********************************** FIXED VALUES ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep4 - Fixed values";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[4] as Worksheet;
            importCommonFixedValuesInformation(aSubStep, aWorksheet);



            /****************************** BRAKE PARAMETERS (gamma) ******************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep5 - Brake parameters";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[6] as Worksheet;
            dumpWorksheet(aWorksheet);

            importGammaBrakeParameters(aSubStep, aWorksheet, 2, 8);   // first combination
            importGammaBrakeParameters(aSubStep, aWorksheet, 3, 20);  // second combination



            /*************************** CORRECTION FACTOR KDRY_RST ***************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep6 - Correction factor kdry_rst";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[7] as Worksheet;
        }



        private static void initializeInputForLambda(TestCase aTestCase, Workbook workbook)
        {
            Step aStep = new Step();
            aStep.Name = "Step1 - Initialize input";
            aTestCase.AddModelElement(aStep);


            /*********************************** TRAIN DATA ***********************************/
            SubStep aSubStep = new SubStep();
            aSubStep.Name = "SubStep1 - Train data";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            /* This is a lambda train => no brake models defined in the train data */
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.EBModels <- EMPTY"));
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.SBModels <- EMPTY"));
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.NormalServiceBrakeModels <- EMPTY"));
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.T_brake_emergency <- EMPTY"));
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.T_brake_service <- EMPTY"));

            /* Initializing the maximum train speed */
            /* This value must be in the range {0km/h; 200km/h}, otherwise the conversion model will not be applicable */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.MaximumSpeed <- {0:0.0}", 180.0));

            Worksheet aWorksheet = workbook.Sheets[1] as Worksheet;
            bool isPassengerTrain;
            importCommonTrainDataInformation(aSubStep, aWorksheet, out isPassengerTrain);



            /*********************************** TRACK DATA ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep2 - Track data";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            /* This is a lambda train => track condition brake inhibition profile is not applicable */
            addAction(aSubStep, String.Format("Kernel.TrackConditions.TCProfile <- EMPTY"));

            aWorksheet = workbook.Sheets[2] as Worksheet;
            importCommonTrackDataInformation(aSubStep, aWorksheet);



            /*********************************** NATIONAL VALUES ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep3 - National values";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[3] as Worksheet;
            importCommonNationalValuesInformation(aSubStep, aWorksheet);



            /*********************************** FIXED VALUES ***********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep4 - Fixed values";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[4] as Worksheet;
            importCommonFixedValuesInformation(aSubStep, aWorksheet);



            /****************************** BRAKE PARAMETERS (lambda) ******************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep5 - Brake parameters";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[5] as Worksheet;

            Range aRange = aWorksheet.UsedRange;
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.BrakePercentage <- {0:0.0#}", (double)(aRange.Cells[3, 6] as Range).Value2));



            /*************************** INTERGRATED CORRECTION FACTORS ***************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep6 - Integrated correction factors";
            aSubStep.setSkipEngine(true);
            aStep.AddModelElement(aSubStep);

            aWorksheet = workbook.Sheets[8] as Worksheet;

            aRange = aWorksheet.UsedRange;

            /* Initializing Kr_int */
            int index = 0;
            double doubleValue = -1;
            double temp;
            for (int i = 0; i < 9; i++)
            {
                temp = (double)(aRange.Cells[i + 32, 2] as Range).Value2;
                if (doubleValue != temp)
                {
                    double location = (double)(aRange.Cells[i + 32, 1] as Range).Value2;
                    doubleValue = temp;
                    addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKrInt.Val{0} <- Kernel.NationalValues.KrIntValue\n{{\n    LengthStep => {1:0.0},\n    Value => {2:0.0####}\n}}", index, location, doubleValue));
                    index++;
                }
            }
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKrInt.Val{0} <- Kernel.NationalValues.KrIntValue\n{{\n    LengthStep => Default.BaseTypes.Length.Infinity,\n    Value => {1:0.0####}\n}}", index, doubleValue));


            /* Case of a passenger train */
            if (isPassengerTrain)
            {
                /* Initializing Kv_int */
                double a = -1;
                double b = -1;
                double tempA, tempB;
                index = 0;
                for (int i = 0; i <= 9; i++)
                {
                    tempA = (double)(aRange.Cells[i + 5, 5] as Range).Value2;
                    tempB = (double)(aRange.Cells[i + 31, 5] as Range).Value2;
                    if (a != tempA || b != tempB)
                    {
                        double speed = (double)(aRange.Cells[i + 5, 4] as Range).Value2;
                        a = tempA;
                        b = tempB;
                        addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_PassengerTrain.Val{0} <- Kernel.NationalValues.KvIntValue_PassengerTrain\n{{\n    SpeedStep => {1:0.0},\n    ValueA => {2:0.0#},\n    ValueB => {3:0.0#}\n}}", index, speed, a, b));
                        index++;
                    }
                }
                addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_PassengerTrain.Val{0} <- Kernel.NationalValues.KvIntValue_PassengerTrain\n{{\n    SpeedStep => Default.BaseTypes.Speed.Infinity,\n    ValueA => {1:0.0#},\n    ValueB => {2:0.0#}\n}}", index, a, b));
            }
            else  /* Case of freight trains */
            {
                /* Initializing Kv_int */
                doubleValue = -1;
                index = 0;
                for (int i = 0; i <= 9; i++)
                {
                    temp = (double)(aRange.Cells[i + 5, 2] as Range).Value2;
                    if (doubleValue != temp)
                    {
                        double speed = (double)(aRange.Cells[i + 5, 1] as Range).Value2;
                        doubleValue  = temp;
                        addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_FreightTrain.Val{0} <- Kernel.NationalValues.KvIntValue_FreightTrain\n{{\n    SpeedStep => {1:0.0},\n    Value => {2:0.0#}\n}}", index, speed, doubleValue));
                        index++;
                    }
                }
                addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_FreightTrain.Val{0} <- Kernel.NationalValues.KvIntValue_FreightTrain\n{{\n    SpeedStep => Default.BaseTypes.Speed.Infinity,\n    Value => {1:0.0#}\n}}", index, doubleValue));
            }

            /* Initializing A_NVP12 */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_PassengerTrain.A_NVP12 <- {0:0.0}", (double)(aRange.Cells[44, 4] as Range).Value2));

            /* Initializing A_NVP23 */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorKvInt_PassengerTrain.A_NVP23 <- {0:0.0}", (double)(aRange.Cells[44, 6] as Range).Value2));

            /* Initializing Kt_int */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.IntegratedCorrectionFactorForBrakeBuildUpTime <- {0:0.0}", (double)(aRange.Cells[47, 4] as Range).Value2));
        }



        private static void importCommonTrainDataInformation(SubStep aSubStep, Worksheet aWorksheet, out bool isPassengerTrain)
        {
            Range aRange = aWorksheet.UsedRange;


            /* Initializing the train position */
            string readStringValue = (string)(aRange.Cells[15, 4] as Range).Value2;
            string decodedStringValue = "";
            isPassengerTrain = false;
            if (readStringValue.Equals("Passenger in P"))
            {
                decodedStringValue = "PassengerTrainInP";
                isPassengerTrain   = true;
            }
            else if (readStringValue.Equals("Freight in P"))
            {
                decodedStringValue = "FreightTrainInP";
            }
            else if (readStringValue.Equals("Freight in G"))
            {
                decodedStringValue = "FreightTrainInG";
            }
            else
            {
                Log.ErrorFormat("Invalid train position");
            }
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.BrakePosition <- Kernel.TrainData.BrakingParameters.BrakePositions.{0}", decodedStringValue));


            /* Initializing the traction model */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.TractionModel <- Kernel.TrainData.TractionModel\n{{\n    Coefficient => {0:0.0},\n    Constant    => {1:0.0}\n}}", 0, (double)(aRange.Cells[16, 4] as Range).Value2));


            /* Initializing the service brake interface */
            readStringValue = (string)(aRange.Cells[17, 4] as Range).Value2;
            decodedStringValue = "";
            if (readStringValue.Equals("Yes"))
            {
                decodedStringValue = "True";
            }
            else if (readStringValue.Equals("No"))
            {
                decodedStringValue = "False";
            }
            else
            {
                Log.ErrorFormat("Invalid value for service brake interface");
            }
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.SBCommandIsImplemented <- {0}", decodedStringValue));


            /* Initializing the traction cut off interface */
            readStringValue = (string)(aRange.Cells[18, 4] as Range).Value2;
            decodedStringValue = "";
            if (readStringValue.Equals("Yes"))
            {
                decodedStringValue = "True";
            }
            else if (readStringValue.Equals("No"))
            {
                decodedStringValue = "False";
            }
            else
            {
                Log.ErrorFormat("Invalid value for traction cut off interface");
            }
            addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.TractionCutOffInterfaceIsImplemented <- {0}", decodedStringValue));

            
            /* Initializing special/additional brake independent form wheel/track adhesion */
            /// TODO: where is that value?
            addAction(aSubStep, String.Format("Kernel.TrainData.BrakingParameters.ContributionOfSpecialBrakeIsAllowed <- {0}", "True"));
            

            /* Initializing the speed inaccuracy */
            /// TODO: blocked. Why?


            /* Initializing the position inaccuracy */
            /// TODO: what is that?


            /* Initializing the train length */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.TrainLength <- {0:0.0}", (double)(aRange.Cells[22, 4] as Range).Value2));


            /* Initializing the nominal rotating mass */
            readStringValue = (aRange.Cells[23, 4] as Range).Value2.ToString();
            if (readStringValue.Equals("Not known"))
            {
                addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.M_rotating_nom <- Default.Percentage.NA"));
            }
            else
            {
                addAction(aSubStep, String.Format("Kernel.TrainData.TrainData.Value.M_rotating_nom <- {0:0.0}", (double)(aRange.Cells[23, 4] as Range).Value2));
            }


            /* Initializing the distance antenna - train front */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "BTM.ActiveAntennaPosition <- {0:0.0}", (double)(aRange.Cells[13, 4] as Range).Value2));
        }



        private static void importCommonTrackDataInformation(SubStep aSubStep, Worksheet aWorksheet)
        {
            Range aRange = aWorksheet.UsedRange;


            /* Initializing the target type */
            /// TODO


            /* Initializing the MA: target speed, release speed, distance origin/target */
            TheConfig.TargetSpeed = (double)(aRange.Cells[2, 2] as Range).Value2;
            double releaseSpeed   = (double)(aRange.Cells[2, 5] as Range).Value2;
            double distance       = (double)(aRange.Cells[3, 2] as Range).Value2;
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.MA.MA <- Kernel.MA.MA\n{{\n    TargetSpeed => {0:0.0},\n    Sections => [],\n    EndSection => Kernel.MA.EndSection\n    {{\n        EndSectionTimeOut => EMPTY,\n        SectionTimeOut => EMPTY,\n        Length => {1:0.0},\n        DangerPoint => Kernel.MA.DangerPoint\n        {{\n            Distance => 0.0,\n            ReleaseSpeed => {2:0.0}\n        }},\n        Overlap => EMPTY\n    }},\n    TargetSpeedTimeOut => 0.0,\n    Available => Boolean.True,\n    LRBG => 2020,\n    LRBGLocation => 0.0\n}}", TheConfig.TargetSpeed, distance, releaseSpeed));


            /* Initializing the initial speed */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.MA.SignallingRelatedSpeedRestriction <- {0:0.0}", (double)(aRange.Cells[4, 2] as Range).Value2));


            /* Initializing the reduced adhesion interval */
            /// TODO: need to find how these values are activated and deactivated
            double startLocation = (double)(aRange.Cells[9, 2] as Range).Value2;
            double endLocation   = (double)(aRange.Cells[10, 2] as Range).Value2;
            //addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "INSERT\n    Kernel.TrackConditions.AdhesionFactor\n    {{\n        Distance => {0:0.0},\n        Length => {1:0.0},\n        Value => Messages.M_ADHESION.Slippery_rail\n    }}\nIN\n    Kernel.TrackConditions.AdhFactors", startLocation, endLocation - startLocation));


            /* Initializing the gradient profile */
            double gradientValue    = (double)(aRange.Cells[14, 3] as Range).Value2;
            double gradientDistance = (double)(aRange.Cells[14, 1] as Range).Value2; ;
            for (int i = 15; i <= 33; i++)
            {
                double temp = (double)(aRange.Cells[i, 3] as Range).Value2;
                if (temp != gradientValue || i == 33)
                {
                    addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "INSERT\n    Kernel.Gradient.GradientInfo\n    {{\n        Location => {0:0.0},\n        Gradient => {1:0.0}\n    }}\nIN\n    Kernel.Gradient.Gradients", gradientDistance, gradientValue));
                    gradientDistance = (double)(aRange.Cells[i, 1] as Range).Value2;
                    gradientValue = temp;
                }
            }
            


            /* Initializing the distance EOA/SvL */
            /// TODO: => should be a part of an MA?
            //doubleValue = (double)(aRange.Cells[1, 5] as Range).Value2;
            

            /* Initializing the type of the release speed (fixed or calculated on-board) */
            /// TODO: verify requirements


            /* Initializing the relocation balises */
            string readStringValue = (string)(aRange.Cells[15, 4] as Range).Value2;
        }



        private static void importCommonNationalValuesInformation(SubStep aSubStep, Worksheet aWorksheet)
        {
            /* The national values must be valid */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.DataState <- Default.DataState.Valid"));
            
            Range aRange = aWorksheet.UsedRange;
            
            /* Initializing the usage of service brake in target speed monitoring */
            /// TODO: how to extract this value?!
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.UseServiceBrakeInTargetSpeedMonitoring <- Messages.Q_NVSBTSMPERM.Yes"));
            
            /* Initializing the permission to inhibit the compensation of the speed measurement inaccuracy */
            /// TODO: how to extract this value?!
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.PermToInhibitTheCompOfTheSpeedMeasurementInaccuracy <- Messages.Q_NVINHSMICPERM.Yes"));
            
            /* Initializing the maximum deceleration value under reduced adhesion conditions(1) */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.MaxDecelValueUnderReducedAdhesionCond1 <- {0:0.0#}", (double)(aRange.Cells[3, 2] as Range).Value2));
            
            /* Initializing the maximum deceleration value under reduced adhesion conditions(2) */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.MaxDecelValueUnderReducedAdhesionCond2 <- {0:0.0#}", (double)(aRange.Cells[4, 2] as Range).Value2));
            
            /* Initializing the maximum deceleration value under reduced adhesion conditions(3) */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.MaxDecelValueUnderReducedAdhesionCond3 <- {0:0.0#}", (double)(aRange.Cells[5, 2] as Range).Value2));
            
            /* Initializing the weighting factor for available wheel/rail adhesion */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.WeightingFactorForAvailableWheelRailAdhesion <- {0:0.0#}", (double)(aRange.Cells[6, 2] as Range).Value2));
            
            /* Initializing the confidence level for emergency brake safe deceleration on dry rails */
            double doubleValue = (double)(aRange.Cells[7, 2] as Range).Value2;
            String stringValue = doubleValue.ToString(CultureInfo.InvariantCulture);
            string result = "Messages.M_NVEBCL.Confidence_level___99_";
            for (int i = 0; i < stringValue.Length - 3; i++)
            {
                result += "9";
            }
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.NationalValues.ApplicableNationalValues.Value.ConfLevelForEmergBrakeSafeDecelerationOnDryRails <- {0}", result));
        }



        private static void importCommonFixedValuesInformation(SubStep aSubStep, Worksheet aWorksheet)
        {
            Range aRange = aWorksheet.UsedRange;


            /* Initializing dV_ebi_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_ebi_min <- {0:0.0#}", (double)(aRange.Cells[1, 2] as Range).Value2));
            
            /* Initializing dV_ebi_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_ebi_max <- {0:0.0#}", (double)(aRange.Cells[2, 2] as Range).Value2));
            
            /* Initializing V_ebi_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_ebi_min <- {0:0.0#}", (double)(aRange.Cells[3, 2] as Range).Value2));
            
            /* Initializing V_ebi_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_ebi_max <- {0:0.0#}", (double)(aRange.Cells[4, 2] as Range).Value2));
            
            /* Initializing dV_sbi_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_sbi_min <- {0:0.0#}", (double)(aRange.Cells[5, 2] as Range).Value2));
            
            /* Initializing dV_sbi_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_sbi_max <- {0:0.0#}", (double)(aRange.Cells[6, 2] as Range).Value2));
            
            /* Initializing V_sbi_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_sbi_min <- {0:0.0#}", (double)(aRange.Cells[7, 2] as Range).Value2));
            
            /* Initializing V_sbi_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_sbi_max <- {0:0.0#}", (double)(aRange.Cells[8, 2] as Range).Value2));
            
            /* Initializing dV_warning_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_warning_min <- {0:0.0#}", (double)(aRange.Cells[9, 2] as Range).Value2));
            
            /* Initializing dV_warning_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.dV_warning_max <- {0:0.0#}", (double)(aRange.Cells[10, 2] as Range).Value2));
            
            /* Initializing V_warning_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_warning_min <- {0:0.0#}", (double)(aRange.Cells[11, 2] as Range).Value2));
            
            /* Initializing V_warning_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.CeilingSupervision.V_warning_max <- {0:0.0#}", (double)(aRange.Cells[12, 2] as Range).Value2));
            
            /* Initializing T_warning */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.TargetSupervision.T_warning <- {0:0.0#}", (double)(aRange.Cells[13, 2] as Range).Value2));
            
            /* Initializing T_driver */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.TargetSupervision.T_driver <- {0:0.0#}", (double)(aRange.Cells[14, 2] as Range).Value2));
            
            /* Initializing T_preindication */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.SpeedAndDistanceMonitoring.PreIndicationLocation.T_preindication <- {0:0.0#}", (double)(aRange.Cells[15, 2] as Range).Value2));
            
            /* Initializing M_rotating_max */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.Gradient.M_rotating_max <- {0:0.0#}", (double)(aRange.Cells[16, 2] as Range).Value2));
            
            /* Initializing M_rotating_min */
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.Gradient.M_rotating_min <- {0:0.0#}", (double)(aRange.Cells[17, 2] as Range).Value2));
        }



        private static void importGammaBrakeParameters(SubStep aSubStep, Worksheet aWorksheet, int brakesCombinationColumnNumber, int dataColumnNumber)
        {
            Range aRange = aWorksheet.UsedRange;

            string brakesCombination = "";
            object obj = (aRange.Cells[7, brakesCombinationColumnNumber] as Range).Value2;
            brakesCombination += obj == null ? "" : "EddyCurrent";
            obj = (aRange.Cells[8, brakesCombinationColumnNumber] as Range).Value2;
            if (brakesCombination == "")
            {
                brakesCombination += obj == null ? "" : "Magnetic";
            }
            else
            {
                brakesCombination += obj == null ? "" : "_Magnetic";
            }
            obj = (aRange.Cells[6, brakesCombinationColumnNumber] as Range).Value2;
            if (brakesCombination == "")
            {
                brakesCombination += obj == null ? "" : "Regenerative";
            }
            else
            {
                brakesCombination += obj == null ? "" : "_Regenerative";
            }


            /* Initializing EB deceleration */
            double doubleValue = -1;
            double temp;
            int    index       = 0;
            for (int i = 0; i < 14; i+=2)
            {
                temp = (double)(aRange.Cells[i + 7, dataColumnNumber + 2] as Range).Value2;
                if (doubleValue != temp)
                {
                    double speed = (double)(aRange.Cells[i + 7, dataColumnNumber] as Range).Value2;
                    doubleValue = temp;
                    addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.EBModels.ModelSet.{0}.Val{1} <- Kernel.TrainData.BrakingParameters.BrakingModelValue\n{{\n    SpeedStep => {2:0.0###},\n    Acceleration => {3:0.0###}\n}}", brakesCombination, index, speed, doubleValue));
                    index++;
                }
            }
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.EBModels.ModelSet.{0}.Val{1} <- Kernel.TrainData.BrakingParameters.BrakingModelValue\n{{\n    SpeedStep => Default.BaseTypes.Speed.Infinity,\n    Acceleration => {2:0.0###}\n}}", brakesCombination, index, doubleValue));


            /* Initializing EB confidence level */
            /// TODO: how can I recover the value of the confidence level? (should be at the line 21....)


            /* Initializing Kdry_rst */
            addAction(aSubStep,
                      String.Format(CultureInfo.InvariantCulture,
                                    "Kernel.TrainData.TrainData.Value.EBModels.Kdry_rstValuesSet.{0}.{1} <- Kernel.TrainData.BrakingParameters.CorrectFactorValue\n{{\n    CF0 => {2:0.0###},\n    CF1 => {3:0.0###},\n    CF2 => {4:0.0###},\n    CF3 => {5:0.0###},\n    CF4 => {6:0.0###},\n    CF5 => {7:0.0###},\n    CF6 => {8:0.0###}\n}}",
                                    brakesCombination,
                                    "Cl__99_9999999",   // this value should be provided by the previous step
                                    (double)(aRange.Cells[23, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[25, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[27, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[29, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[31, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[33, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[35, dataColumnNumber + 2] as Range).Value2));


            /* Initializing Kwet_rst */
            addAction(aSubStep,
                      String.Format(CultureInfo.InvariantCulture,
                                    "Kernel.TrainData.TrainData.Value.EBModels.Kwet_rstValuesSet.{0} <- Kernel.TrainData.BrakingParameters.CorrectFactorValue\n{{\n    CF0 => {1:0.0###},\n    CF1 => {2:0.0###},\n    CF2 => {3:0.0###},\n    CF3 => {4:0.0###},\n    CF4 => {5:0.0###},\n    CF5 => {6:0.0###},\n    CF6 => {7:0.0###}\n}}",
                                    brakesCombination,
                                    (double)(aRange.Cells[38, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[40, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[42, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[44, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[46, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[48, dataColumnNumber + 2] as Range).Value2,
                                    (double)(aRange.Cells[50, dataColumnNumber + 2] as Range).Value2));



            /* Initializing T_brake_emergency */
            addAction(aSubStep,
                      String.Format(CultureInfo.InvariantCulture,
                                    "Kernel.TrainData.TrainData.Value.T_brake_emergency.{0} <- {1:0.0###}",
                                    brakesCombination,
                                    (double)(aRange.Cells[52, dataColumnNumber + 3] as Range).Value2));


            /* Initializing SB deceleration */
            doubleValue = -1;
            index = 0;
            for (int i = 0; i < 14; i += 2)
            {
                temp = (double)(aRange.Cells[i + 54, dataColumnNumber + 2] as Range).Value2;
                if (doubleValue != temp)
                {
                    double speed = (double)(aRange.Cells[i + 7, dataColumnNumber] as Range).Value2;
                    doubleValue = temp;
                    addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.SBModels.ModelSet.{0}.Val{1} <- Kernel.TrainData.BrakingParameters.BrakingModelValue\n{{\n    SpeedStep => {2:0.0###},\n    Acceleration => {3:0.0###}\n}}", brakesCombination, index, speed, doubleValue));
                    index++;
                }
            }
            addAction(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.TrainData.Value.SBModels.ModelSet.{0}.Val{1} <- Kernel.TrainData.BrakingParameters.BrakingModelValue\n{{\n    SpeedStep => Default.BaseTypes.Speed.Infinity,\n    Acceleration => {2:0.0###}\n}}", brakesCombination, index, doubleValue));


            /* Initializing T_brake_service */
            addAction(aSubStep,
                      String.Format(CultureInfo.InvariantCulture,
                                    "Kernel.TrainData.TrainData.Value.T_brake_service.{0} <- {1:0.0###}",
                                    brakesCombination,
                                    (double)(aRange.Cells[68, dataColumnNumber + 3] as Range).Value2));
        }



        private static void verifyInputForGamma(TestCase aTestCase, Workbook workbook)
        {
            throw new NotImplementedException();
        }



        private static void verifyInputForLambda(TestCase aTestCase, Workbook workbook)
        {
            Step aStep = new Step();
            aStep.Name = "Step1 - Verify input";
            aTestCase.AddModelElement(aStep);



            /*********************************** TRAIN DATA ***********************************/
            SubStep aSubStep = new SubStep();
            aSubStep.Name = "SubStep1 - Train data";
            aStep.AddModelElement(aSubStep);

            addAction(aSubStep, "Kernel.TrainData.BrakingParameters.ConversionModel.Initialize()");
            addExpectation(aSubStep, "Kernel.TrainData.BrakingParameters.ConversionModel.ConversionModelIsUsed() == True");



            /********************************* BRAKE PARAMETERS *********************************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep2 - Brake parameters";
            aStep.AddModelElement(aSubStep);

            Worksheet aWorksheet = workbook.Sheets[5] as Worksheet;

            Range aRange = aWorksheet.UsedRange;
            /* Verifying kto */
            addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.ConversionModel.kto() == {0:0.0#}", (double)(aRange.Cells[7, 6] as Range).Value2));

            if (TheConfig.TargetSpeed == 0)  /* In this case, the values of T_brake_emergency_cmt and T_brake_service_cmt do not make sense (3.13.3.4.4.1) */
            {
                /* Verifying T_brake_emergency_cm0 */
                addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.ConversionModel.T_brake_emergency_cm0 == {0:0.0#}", (double)(aRange.Cells[8, 6] as Range).Value2));

                /* Verifying T_brake_service_cm0 */
                addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.ConversionModel.T_brake_service_cm0 == {0:0.0#}", (double)(aRange.Cells[10, 6] as Range).Value2));
            }
            else   /* In this case, the values of T_brake_emergency_cm0 and T_brake_service_cm0 do not make sense (3.13.3.4.4.1) */
            {
                /* Verifying T_brake_emergency_cmt */
                addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.ConversionModel.T_brake_emergency_cmt == {0:0.0#}", (double)(aRange.Cells[9, 6] as Range).Value2));


                /* Verifying T_brake_service_cmt */
                addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.ConversionModel.T_brake_service_cmt == {0:0.0#}", (double)(aRange.Cells[11, 6] as Range).Value2));
            }

            /* Verifying T_be */
            addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.T_be() == {0:0.0#}", (double)(aRange.Cells[12, 6] as Range).Value2));

            /* Verifying T_bs */
            addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "Kernel.TrainData.BrakingParameters.T_bs() == {0:0.0#}", (double)(aRange.Cells[13, 6] as Range).Value2));



            /********************* BRAKE PARAMETERS (A_brake_emergency) *********************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep3 - Brake parameters (A_brake_emergency)";
            aStep.AddModelElement(aSubStep);

            /* Verifying A_brake_emergency */
            double doubleValue = -1;
            double temp;
            for (int i = 16; i <= 27; i++)
            {
                temp = (double)(aRange.Cells[i, 10] as Range).Value2;
                if (doubleValue != temp)
                {
                    if (doubleValue != -1)
                    {
                        addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_emergency(V => {0:0.0########}),\n    Val2 => {1:0.0########}\n)", (double)(aRange.Cells[i, 9] as Range).Value2 - 0.000000001, doubleValue));
                    }
                    doubleValue = temp;
                    double speedValue = (double)(aRange.Cells[i, 9] as Range).Value2;
                    if (Math.Abs(speedValue - Math.Round(speedValue, 8)) > 0)
                    {
                        speedValue += 0.000000001;
                    }
                    addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_emergency(V => {0:0.0########}),\n    Val2 => {1:0.0########}\n)", speedValue, doubleValue));
                }
            }

            /* Verifying V_lim EBI */
            addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_emergency.Val1.SpeedStep,\n    Val2 => {0:0.0########}\n)", (double)(aRange.Cells[17, 9] as Range).Value2));



            /*********************** BRAKE PARAMETERS (A_brake_service) ***********************/
            aSubStep = new SubStep();
            aSubStep.Name = "SubStep4 - Brake parameters (A_brake_service)";
            aStep.AddModelElement(aSubStep);

            /* Verifying A_brake_service */
            doubleValue = -1;
            for (int i = 16; i <= 27; i++)
            {
                temp = (double)(aRange.Cells[i, 14] as Range).Value2;
                if (doubleValue != temp)
                {
                    if (doubleValue != -1)
                    {
                        addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_service(V => {0:0.0########}),\n    Val2 => {1:0.0########}\n)", (double)(aRange.Cells[i, 13] as Range).Value2 - 0.000000001, doubleValue));
                    }
                    doubleValue = temp;
                    double speedValue = (double)(aRange.Cells[i, 13] as Range).Value2;
                    if (Math.Abs(speedValue - Math.Round(speedValue, 8)) > 0)
                    {
                        speedValue += 0.000000001;
                    }
                    addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_service(V => {0:0.0########}),\n    Val2 => {1:0.0########}\n)", speedValue, doubleValue));
                }
            }

            /* Verifying V_lim BS */
            addExpectation(aSubStep, String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.TrainData.BrakingParameters.ConversionModel.A_brake_service.Val1.SpeedStep,\n    Val2 => {0:0.0########}\n)", (double)(aRange.Cells[17, 13] as Range).Value2));
        }



        private static void verifyOutputForTrains(bool trainIsGamma, TestCase aTestCase, Workbook aWorkbook)
        {
            int sheet_number;
            if (trainIsGamma)
            {
                sheet_number = 11;
            }
            else
            {
                sheet_number = 13;
            }
            if (aWorkbook.Sheets.Count >= sheet_number && sheet_number != -1)
            {
                Worksheet    worksheet        = aWorkbook.Sheets[sheet_number] as Worksheet;
                List<double> speedValues      = new List<double>();
                List<double> aSafeValues      = new List<double>();
                List<double> aExpectedValues  = new List<double>();
                List<double> ebdValues        = new List<double>();
                List<double> sbdValues        = new List<double>();
                List<double> ebiValues        = new List<double>();
                List<double> sbi1Values       = new List<double>();
                List<double> sbi2Values       = new List<double>();
                List<double> floiValues       = new List<double>();
                List<double> warningValues    = new List<double>();
                List<double> permittedValues  = new List<double>();
                List<double> indicationValues = new List<double>();

                Range testRange = worksheet.UsedRange;
                double val;
                object obj;
                double lastAddedSpeedValue = double.MinValue;
                for (int i = 2; i <= testRange.Rows.Count; i++)
                {
                    val = (double)(testRange.Cells[i, 14] as Range).Value2;
                    /*if (val >= 125.0)
                    {
                        /// TODO: investigate the difference between testing the curve values and its limit values
                        break;
                    }*/
                    if (val - lastAddedSpeedValue >= TheConfig.SpeedInterval)
                    {
                        lastAddedSpeedValue = val;
                        speedValues.Add(val);

                        if (trainIsGamma)  // then we import the values of A_Safe and A_Expected
                        {
                            obj = (testRange.Cells[i, 16] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            aSafeValues.Add(val);

                            obj = (testRange.Cells[i, 17] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            aExpectedValues.Add(val);
                        }

                        if (TheConfig.FillEBD)
                        {
                            obj = (testRange.Cells[i, 18] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            ebdValues.Add(val);
                        }
                        if (TheConfig.FillSBD)
                        {
                            obj = (testRange.Cells[i, 19] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            sbdValues.Add(val);
                        }
                        if (TheConfig.FillEBI)
                        {
                            obj = (testRange.Cells[i, 20] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            ebiValues.Add(val);
                        }
                        if (TheConfig.FillSBI1)
                        {
                            obj = (testRange.Cells[i, 21] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            sbi1Values.Add(val);
                        }
                        if (TheConfig.FillSBI2)
                        {
                            obj = (testRange.Cells[i, 22] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            sbi2Values.Add(val);
                        }
                        if (TheConfig.FillFLOI)
                        {
                            obj = (testRange.Cells[i, 23] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            floiValues.Add(val);
                        }
                        if (TheConfig.FillWarning)
                        {
                            obj = (testRange.Cells[i, 24] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            warningValues.Add(val);
                        }
                        if (TheConfig.FillPermitted)
                        {
                            obj = (testRange.Cells[i, 25] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            permittedValues.Add(val);
                        }
                        if (TheConfig.FillIndication)
                        {
                            obj = (testRange.Cells[i, 26] as Range).Value2;
                            val = obj == null ? -1 : (double)obj;
                            indicationValues.Add(val);
                        }
                    }
                }

                if (trainIsGamma)  // then we create steps for A_Safe and A_Expected
                {
                    /// TODO: review the expressions for A_Safe and A_Expected
                    fillBrakingCurvesExpectations(aTestCase,
                                     "A_Safe",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n    ),\n    Val2 => {0:0.0#}\n)",
                                     speedValues,
                                     aSafeValues);
                    fillBrakingCurvesExpectations(aTestCase,
                                     "A_Expected",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n    ),\n    Val2 => {0:0.0#}\n)",
                                     speedValues,
                                     aExpectedValues);
                }

                if (TheConfig.FillEBD)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "EBD",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => DistanceForSpeed (\n    Function =>\n        FUNCTION d : Default.BaseTypes.Distance => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD_Target ( Distance => d, aTarget => Kernel.MA.EndOfMovementAuthority() ),\n        Speed => {0:0.0} ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     ebdValues);


                    /*fillBrakingCurvesExpectations(aTestCase, => first
                                     "EBD",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n    ),\n    Val2 => {0:0.0#}\n)",
                                     speedValues,
                                     ebdValues);


                    fillBrakingCurvesExpectations(aTestCase, => second
                                     "EBD",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD_Target\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} ),\n        aTarget => Kernel.MA.EndOfMovementAuthority()\n    ),\n    Val2 => {0:0.0#}\n)",
                                     speedValues,
                                     ebdValues);*/
                }
                if (TheConfig.FillSBD)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "SBD",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.SBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n    ),\n    Val2 => {0:0.0#}\n)",
                                     speedValues,
                                     sbdValues);
                }
                if (TheConfig.FillEBI)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "EBI",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_EBI\n    (\n        Vest  => {0:0.0#},\n        aTarget => Kernel.MA.EndOfMovementAuthority()\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     ebiValues);
                }
                if (TheConfig.FillSBI1)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "SBI1",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_SBI1\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     sbi1Values);
                }
                if (TheConfig.FillSBI2)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "SBI2",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_SBI2\n    (\n        Vest  => {0:0.0#},\n        aTarget => Kernel.MA.EndOfMovementAuthority()\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     sbi2Values);
                }
                if (TheConfig.FillFLOI)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "FLOI",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_FLOI\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     floiValues);
                }
                if (TheConfig.FillWarning)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "Warning",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_W\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     warningValues);
                }
                if (TheConfig.FillPermitted)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "Permitted",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_P\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     permittedValues);
                }
                if (TheConfig.FillIndication)
                {
                    fillBrakingCurvesExpectations(aTestCase,
                                     "Indication",
                                     "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_I\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)",
                                     speedValues,
                                     indicationValues);
                }
            }
            else
            {
                if (sheet_number == -1)
                {
                    Log.ErrorFormat("Incorrect train type selected!!");
                }
                else
                {
                    Log.ErrorFormat("Incorrect number of sheets in the excel document!!");
                }
            }
        }



        private static void addAction(SubStep aSubStep, string expression)
        {
            TestAction anAction = new TestAction();
            anAction.Expression = expression;
            aSubStep.AddModelElement(anAction);
        }



        private static void addExpectation(SubStep aSubStep, string expression)
        {
            Expectation anExpectation = new Expectation();
            anExpectation.Expression  = expression;
            aSubStep.AddModelElement(anExpectation);
        }



        private static void fillBrakingCurvesExpectations(TestCase aTestCase, string name, string expression, List<double> speedValues, List<double> values)
        {
            Step aStep = new Step();
            aStep.Name = String.Format("Step1 - {0}", name);
            aTestCase.AddModelElement(aStep);

            SubStep aSubStep = new SubStep();
            aSubStep.Name    = String.Format("SubStep1 - Verify {0} values", name);
            aStep.AddModelElement(aSubStep);

            for (int i = 0; i < values.Count; i++)
            {
                if (values[i] != -1)
                {
                    Expectation expectation = new Expectation();
                    expectation.Expression  = String.Format(CultureInfo.InvariantCulture, expression, Math.Round(speedValues[i], 2), Math.Round(values[i], 2));
                    aSubStep.AddModelElement(expectation);
                }
            }
        }



        private static void dumpWorksheet(Worksheet aWorksheet)
        {
            Log.InfoFormat("Dumping the worksheet {0}", aWorksheet.Name);
            Range aRange = aWorksheet.UsedRange;
            for (int i = 1; i < 40; i++)
            {
                for (int j = 1; j <= aRange.Rows.Count; j++)
                {
                    Log.InfoFormat("Worksheet {0}, line {1}, column {2}, value: {3}", aWorksheet.Index, j, i, (aRange.Cells[j, i] as Range).Value2);
                }
            }
        }
    }
}
