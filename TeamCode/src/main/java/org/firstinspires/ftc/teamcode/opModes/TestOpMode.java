package org.firstinspires.ftc.teamcode.opModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Yonis on 10/6/16.
 */

@TeleOp(group = "testing", name = "Test")
public class TestOpMode extends MainOpMode {
    @Override
    public void loop() {
        leftMotor.setPower(1.0d);
        rightMotor.setPower(1.0d);
    }
}
