package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Odementry_Test extends LinearOpMode {

    DcMotor FL;
    DcMotor FR;
    DcMotor RL;
    DcMotor RR;



    @Override
    public void runOpMode() throws InterruptedException {

        FL= hardwareMap.get(DcMotor.class, "Front Left");
        FR= hardwareMap.get(DcMotor.class, "Front Right");
        RL= hardwareMap.get(DcMotor.class, "Rear Left");
        RR= hardwareMap.get(DcMotor.class, "Rear Right");





        waitForStart();

    }
}


