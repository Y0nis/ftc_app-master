package org.firstinspires.ftc.teamcode.opMode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opMode.MainOp;

/**
 * Created by Yonis on 10/6/16.
 */

@TeleOp(group = "testing - manual", name = "Test")
public class TestOpMode extends OpMode {

    @Override
    public void init() {
    }

    int x = 0;

    @Override
    public void loop() {
        if (gamepad1.a)
            telemetry.addLine("Button A was pressed!" + x++);
        telemetry.update();
    }
}
