package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name="small pp")


public class Big_PP extends LinearOpMode {
//This are motors OMG
    DcMotor FL;
    DcMotor FR;
    DcMotor RL;
    DcMotor RR;

    public static final double METERSTOTICKS=6369.42675159;



    Servo Servo1;






    @Override
    public void runOpMode() throws InterruptedException {


        FL= hardwareMap.get(DcMotor.class, "Chef Boyardee");
        FR= hardwareMap.get(DcMotor.class, "Beans");
        RL= hardwareMap.get(DcMotor.class, "Spaghettios");
        RR= hardwareMap.get(DcMotor.class, "Cap'n Crunch");

        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        RL.setDirection(DcMotorSimple.Direction.REVERSE);

        FL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        RL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        RR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);









        Servo1= hardwareMap.get(Servo.class, "Claw Servo");

        waitForStart();



    }

    public void Alek_is_hot_but_no_homo(double Jacob, double Alek){

         double ticks = Jacob*METERSTOTICKS;

         double distance = Math.abs(FL.getCurrentPosition()-ticks);

         FL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
         FR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
         RL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
         RR.setMode(DcMotor.RunMode.RUN_TO_POSITION);

         FL.setTargetPosition((int) distance);
        RL.setTargetPosition((int) distance);
        FR.setTargetPosition((int) distance);
        RR.setTargetPosition((int) distance);








        while(opModeIsActive()&&FL.isBusy()){
            FL.setPower(Alek);
            RL.setPower(Alek);
            FR.setPower(Alek);
            RR.setPower(Alek);

        }

        FL.setPower(0);
        RL.setPower(0);
        FR.setPower(0);
        RR.setPower(0);











    }
}
