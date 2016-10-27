package org.firstinspires.ftc.teamcode.opMode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opMode.AbstractOp;

/**
 * Created by Yonis on 10/6/16.
 */

@TeleOp(group = "testing - manual", name = "Test")
public class TestOpMode extends AbstractOp {

    @Override
    public void loop() {
        try {

            movement.go(1.0);
            Thread.sleep(100);
            movement.go(-1.0);

            Thread.sleep(100);
            movement.turn(1.0);

            Thread.sleep(100);
            movement.turn(-1.0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
