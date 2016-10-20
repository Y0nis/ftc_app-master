package org.firstinspires.ftc.teamcode.opMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.controllers.DirectionalControl;

/**
 * Created by Yonis on 10/6/16.
 */

public abstract class AbstractOp extends OpMode {

    public DirectionalControl direction;
    public DcMotor leftMotor, rightMotor, sweeper;
    public TouchSensor touchSensor;

    @Override
    public void init() {
        // Motors
        leftMotor = hardwareMap.dcMotor.get("left motor");
        rightMotor = hardwareMap.dcMotor.get("right motor");
        //sweeper = hardwareMap.dcMotor.get("sweeper");

        // Touch Sensors
        //touchSensor = hardwareMap.touchSensor.get("touch sensor");

        // Servos
        //TODO

        // Controllers
        direction = new DirectionalControl(this);
    }

    public void setSweeperPower(double power) {
        sweeper.setPower(power);
    }

    public void setArmPower(double power) {
        arm.setPower(power);
    }
}