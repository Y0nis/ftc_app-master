package org.firstinspires.ftc.teamcode.opMode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.opMode.AbstractOp;

/**
 * Created by Yonis on 10/11/16.
 */

@Autonomous(group = "test", name = "Test Op")
public class TestAutonomous extends AbstractOp {
    @Override
    public void loop() {
        telemetry.addData("Current IR Levels: ", irSensor);
        telemetry.update();
    }
}