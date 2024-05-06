package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class RoboMap {
    DcMotor bleft = null;
    DcMotor fleft = null;
    DcMotor fright = null;
    DcMotor bright = null;
    public RoboMap(OpMode op){
       bleft= op.hardwareMap.get(DcMotor.class,"bleft");
        fleft= op.hardwareMap.get(DcMotor.class,"fleft");
        bright= op.hardwareMap.get(DcMotor.class,"bright");
        fright= op.hardwareMap.get(DcMotor.class,"fright");
        fright.setDirection(DcMotorSimple.Direction.FORWARD);
        bright.setDirection(DcMotorSimple.Direction.FORWARD);
        fleft.setDirection(DcMotorSimple.Direction.REVERSE);
        bleft.setDirection(DcMotorSimple.Direction.REVERSE);


    }

}
