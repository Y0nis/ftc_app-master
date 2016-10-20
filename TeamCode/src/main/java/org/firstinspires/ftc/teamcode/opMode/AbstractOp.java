package org.firstinspires.ftc.teamcode.opMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.controllers.DirectionalControl;

/**
 * Created by Yonis on 10/6/16.
 */

public abstract class AbstractOp extends OpMode {

    public DirectionalControl direction;
    public DcMotor leftMotor, rightMotor, sweeperMotor, armMotor;
    public TouchSensor touchSensor;
    public IrSeekerSensor irSensor;

    @Override
    public void init() {
        // Motors
        leftMotor = hardwareMap.dcMotor.get("left motor");
        rightMotor = hardwareMap.dcMotor.get("right motor");
        //sweeperMotor = hardwareMap.dcMotor.get("sweeperMotor");
        //armMotor = hardwareMap.dcMotor.get("armMotor");

        // Touch Sensors
        //touchSensor = hardwareMap.touchSensor.get("touch sensor");
        irSensor = hardwareMap.irSeekerSensor.get("ir sensor");

        // Servos
        //TODO

        // Controllers
        direction = new DirectionalControl(this);
    }

    public void setSweeperPower(double power) {
        sweeperMotor.setPower(power);
    }

    public void setArmPower(double power) {
        armMotor.setPower(power);
    }
}