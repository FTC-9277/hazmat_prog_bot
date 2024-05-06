package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "tele")
public class tele extends LinearOpMode {
    RoboMap roboMap=null;

    @Override
    public void runOpMode() throws InterruptedException {
        roboMap=new RoboMap(this);

    }
}
