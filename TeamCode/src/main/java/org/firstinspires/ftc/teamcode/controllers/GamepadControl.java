package org.firstinspires.ftc.teamcode.controllers;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.opMode.MainOp;

/**
 * Created by Staz on 10/6/2016.
 */

public class GamepadControl {

    OpMode opmode;

    boolean a,x,y,b;

    public GamepadControl(OpMode op) {
        opmode = op;
    }

    public void loop() {
        testGamepad(opmode.gamepad1);
        testGamepad(opmode.gamepad2);
    }

    public void testGamepad(Gamepad pad) {
        testButton(pad.a, a);

        //TODO a,x,y,b and analog
    }

    public boolean testButton(boolean isGamepad, boolean isLast) {
        if (isGamepad) {
            if (!isLast) {
                a = true;
                return true;
            }
        }else
            a = false;
        return false;
    }
}