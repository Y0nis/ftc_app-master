package org.firstinspires.ftc.teamcode.opMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.controllers.DirectionalControl;

/**
 * Created by Yonis on 10/6/16.
 */

public abstract class MainOp extends OpMode {

    public DirectionalControl direction;
    public DcMotor leftMotor, rightMotor, sweeperMotor;
    public TouchSensor touchSensor;
    public Servo armServo;
    @Override
    public void init() {
        // Motors
        leftMotor = hardwareMap.dcMotor.get("left motor");
        rightMotor = hardwareMap.dcMotor.get("right motor");
        //sweeperMotor = hardwareMap.dcMotor.get("sweeper");

        //TODO
        // Touch Sensors
        //touchSensor = hardwareMap.touchSensor.get("touch sensor");

        //TODO
        // Servos
        //armServo = hardwareMap.servo.get("arm");

        // Controllers
        direction = new DirectionalControl(this);
    }
}