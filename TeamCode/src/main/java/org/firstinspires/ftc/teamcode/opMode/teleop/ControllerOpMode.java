package org.firstinspires.ftc.teamcode.opMode.teleop;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.opMode.MainOp;

/**
 * Created by Staz on 10/6/2016.
 */

public class ControllerOpMode extends MainOp {

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

    /**
     *
     * @param isGamepad
     * @param isPressContinued
     * @return 0 - no change, 1 - pressed, 2 - released
     */
    public int testButton(boolean isGamepad, boolean isPressContinued) {
        if (isGamepad) {
            if (!isPressContinued) {
                isPressContinued = true;
                return 1;
            }
        }else if (isPressContinued) {
            isPressContinued = false;
            return 2;
        }
        return 0;
    }
}
