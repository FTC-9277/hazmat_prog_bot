package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "tele")
public class tele extends LinearOpMode {
    RoboMap roboMap=null;

    @Override
    public void runOpMode() throws InterruptedException {
        roboMap=new RoboMap(this);
        waitForStart();
        while(opModeIsActive()) {
            double y1 = -gamepad1.left_stick_y;  // Note: pushing stick forward gives negative value
            double x1 =  gamepad1.left_stick_x;
            double x2     =  gamepad1.right_stick_x;

            // Combine the joystick requests for each axis-motion to determine each wheel's power.
            // Set up a variable for each drive wheel to save the power level for telemetry.
            double fleftP  = y1 + x1 + x2;
            double frightP = y1 - x1 - x2;
            double bleftP   = y1 - x1 + x2;
            double brightP  = y1 + x1 - x2;

            if(Math.abs(y1) >= .2 || Math.abs(x1) >= .2 || Math.abs(x2) > .2 ) {
                roboMap.fleft.setPower(fleftP);
                roboMap.bleft.setPower(bleftP);
                roboMap.bright.setPower(brightP);
                roboMap.fright.setPower(frightP);

            } else {
                roboMap.fleft.setPower(0);
                roboMap.bleft.setPower(0);
                roboMap.bright.setPower(0);
                roboMap.fright.setPower(0);

            }
        }
    }

}
