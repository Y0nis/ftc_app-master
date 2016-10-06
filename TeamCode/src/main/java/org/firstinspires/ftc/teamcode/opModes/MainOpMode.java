package org.firstinspires.ftc.teamcode.opModes;

import android.text.method.Touch;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Yonis on 10/6/16.
 */

public abstract class MainOpMode extends OpMode {

    protected DcMotor leftMotor, rightMotor, sweeper;
    protected TouchSensor touchSensor;

    @Override
    public void init() {
        // Motors
        leftMotor = hardwareMap.dcMotor.get("left motor");
        rightMotor = hardwareMap.dcMotor.get("right motor");
        sweeper = hardwareMap.dcMotor.get("sweeper");

        // Touch Sensors
        touchSensor = hardwareMap.touchSensor.get("touch sensor");

        // Servos
        //TODO
    }
}
