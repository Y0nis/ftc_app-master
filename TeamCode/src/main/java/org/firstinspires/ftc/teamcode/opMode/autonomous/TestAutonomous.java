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
        telemetry.addData("Distance Sensor", distanceSensor.getLightDetected());
        telemetry.addData("Distance Sensor", distanceSensor.getRawLightDetected());
//
//        if (irSensor.signalDetected()) {
//            telemetry.addData("Current IR Levels: ", irSensor);
//            telemetry.addData("Current IR Levels: ", irSensor.getAngle());
//            telemetry.addData("Current IR Levels: ", irSensor.getStrength());
//        }else
//            telemetry.addData("ir sensor", "lost");
//
        telemetry.update();
    }
}