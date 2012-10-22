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
using ErtmsSolutions.SiUnits;

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    public class EtcsBrakingData
    {
        /************************************************************/
        public class ConstantData
        {
            /* Small shortcuts used to express values in the most comonly used units instead of the SI ones */
            public static SiSpeed KM_H = new SiSpeed(1.0, SiSpeed_SubUnits.KiloMeter_per_Hour);
            public static SiTime SEC = SiTime.One;

            public SiSpeed dV_ebi_min = 7.5 * KM_H; /*   Speed difference between Permitted speed and Emergency Brake Intervention supervision limits, minimum value                             */
            public SiSpeed dV_ebi_max = 15.0 * KM_H; /*   Speed difference between Permitted speed and Emergency Brake Intervention supervision limits, maximum value                             */
            public SiSpeed V_ebi_min = 110.0 * KM_H; /*   Value of MRSP where dV_ebi starts to increase to dV_ebi_max                                                                             */
            public SiSpeed V_ebi_max = 210.0 * KM_H; /*   Value of MRSP where dV_ebi stops to increase to dV_ebi_max                                                                              */
            public SiSpeed dV_sbi_min = 5.5 * KM_H; /*   Speed difference between Permitted speed and Service Brake Intervention supervision limits, minimum value                               */
            public SiSpeed dV_sbi_max = 10.0 * KM_H; /*   Speed difference between Permitted speed and Service Brake Intervention supervision limits, maximum value                               */
            public SiSpeed V_sbi_min = 110.0 * KM_H; /*   Value of MRSP where dV_sbi starts to increase to dV_sbi_max                                                                             */
            public SiSpeed V_sbi_max = 210.0 * KM_H; /*   Value of MRSP where dV_sbi stops to increase to dV_sbi_max                                                                              */
            public SiSpeed dV_warning_min = 4.0 * KM_H; /*   Speed difference between Permitted speed and Warning supervision limits, minimum value                                                  */
            public SiSpeed dV_warning_max = 5.0 * KM_H; /*   Speed difference between Permitted speed and Warning supervision limits, maximum value                                                  */
            public SiSpeed V_warning_min = 110.0 * KM_H; /*   Value of MRSP where dV_warning starts to increase to dV_warning_max                                                                     */
            public SiSpeed V_warning_max = 140.0 * KM_H; /*   Value of MRSP where dV_warning stops to increase                                                                                        */
            public SiTime T_warning = 2.0 * SEC;  /*   Time between Warning supervision limit and FLOI                                                                                         */
            public SiTime T_driver = 4.0 * SEC;  /*   Driver reaction time between Permitted speed supervision limit and FLOI                                                                 */
            public SiTime T_preindication = 7.0 * SEC;  /*   Time between the pre-indication location and the indication supervision limit valid for MRSP speed.                                     */
            public double M_rotating_max = 15 / 100.0;/*   Maximum possible rotating mass as a percentage of the total weight of the train                                                         */
            public double M_rotating_min = 2 / 100.0;/*    Minimum possible rotating mass as a percentage of the total weight of the train                                                        */
            public SiSpeed V_delta0rsob = 2.0 * KM_H; /*   Compensation of the speed measurement inaccuracy used for the on-board calculation of the release speed                                 */
        }

        /************************************************************/
        public class InputData
        {
            public SiDistance TRAIN_LENGTH;
            public FlatAccelerationSpeedCurve AD_EB;
            public FlatAccelerationSpeedCurve AD_SB;

            public InputData()
            {
                AD_EB = new FlatAccelerationSpeedCurve();
                AD_SB = new FlatAccelerationSpeedCurve();
            }
        }

        /************************************************************/
        public class MiddleData
        {
            public FlatSpeedDistanceCurve MRSP;
            public FlatSpeedDistanceCurve MA;
            public FlatSpeedDistanceCurve TSR;
            public AccelerationSpeedDistanceSurface A_V_D_EB;
            public AccelerationSpeedDistanceSurface A_V_D_SB;

            public MiddleData()
            {
                MRSP = new FlatSpeedDistanceCurve();
                MA = new FlatSpeedDistanceCurve();
                TSR = new FlatSpeedDistanceCurve();
            }

        }

        /************************************************************/
        public class OutputData
        {
            public QuadraticSpeedDistanceCurve A_service_break;
            public QuadraticSpeedDistanceCurve A_emergency_break;

            public OutputData()
            {
                A_service_break = new QuadraticSpeedDistanceCurve();
                A_emergency_break = new QuadraticSpeedDistanceCurve();
            }
        }

        /************************************************************/
        public static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        public InputData Input;
        public MiddleData Middle;
        public OutputData Output;
        public ConstantData Params;

        public EtcsBrakingData()
        {
            Input = new InputData();
            Middle = new MiddleData();
            Output = new OutputData();
            Params = new ConstantData();
        }

        public SiSpeed Interpolate(SiSpeed someV, SiSpeed dV_min, SiSpeed dV_max, SiSpeed V_min, SiSpeed V_max)
        {
            SiSpeed result;
            if (someV > dV_min)
            {
                double C_ebi = (dV_max - dV_min)
                             / (V_max - V_min);
                result = SiSpeed.Min(dV_min + (C_ebi * (someV - V_min)),
                                       V_max);
            }
            else
                result = dV_min;
            return result;
        }


        public SiSpeed dV_ebi(SiSpeed someV)
        {
            return Interpolate(someV, Params.dV_ebi_min, Params.dV_ebi_max, Params.V_ebi_min, Params.V_ebi_max);
        }

        public SiSpeed dV_sbi(SiSpeed someV)
        {
            return Interpolate(someV, Params.dV_sbi_min, Params.dV_sbi_max, Params.V_sbi_min, Params.V_sbi_max);
        }

        public SiSpeed dV_warning(SiSpeed someV)
        {
            return Interpolate(someV, Params.dV_warning_min, Params.dV_warning_max, Params.V_warning_min, Params.V_warning_max);
        }
    }
}




