package org.firstinspires.ftc.teamcode.opMode.teleop;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.opMode.AbstractOp;

/**
 * Created by Staz on 10/6/2016.
 */

public class ControllerOpMode extends AbstractOp {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void loop() {
        testGamepad(gamepad1);
    }

    //TODO Test this!
    public void testGamepad(Gamepad gamepad) {
        // Right Trigger - Sweeper
        // Left Trigger - Arm
        // Left Analog - Forward / Backward
        // Right Analog - Turn L/R
        // B - Emergency Break

        setSweeperPower(gamepad.right_trigger);
        setArmPower(gamepad.left_trigger);

        direction.go(gamepad.left_stick_y);

        direction.turn(gamepad.right_stick_x);
    }

}
