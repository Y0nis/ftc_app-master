package org.firstinspires.ftc.teamcode.controllers;

import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.opMode.MainOp;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

/**
 * Created by Staz on 10/6/2016.
 */

public class DirectionalControl {

    private MainOp opmode;

    public DirectionalControl(MainOp opmode) {
        this.opmode = opmode;
    }

    public void turnRight() {
        setLeftMotorDirection(FORWARD);
        setRightMotorDirection(REVERSE);
        setMotorPowers(1.0d);
    }

    public void turnLeft() {
        setLeftMotorDirection(REVERSE);
        setRightMotorDirection(FORWARD);
        setMotorPowers(1.0d);
    }

    public void setMotorPowers(double power) {
        setLeftMotorPower(power);
        setRightMotorPower(power);
    }

    public void setLeftMotorPower(double power) {
        opmode.leftMotor.setPower(power);
    }

    public void setRightMotorPower(double power) {
        opmode.rightMotor.setPower(power);
    }

    public void setMotorDirections(DcMotorSimple.Direction direction) {
        setRightMotorDirection(direction);
        setLeftMotorDirection(direction);
    }

    public void setRightMotorDirection(DcMotorSimple.Direction direction) {
        opmode.rightMotor.setDirection(direction);
    }

    public void setLeftMotorDirection(DcMotorSimple.Direction direction) {
        opmode.leftMotor.setDirection(direction);
    }

    public void goForward(double power) {
        setMotorDirections(FORWARD);
        setMotorPowers(power);
    }

    public void goBackward(double power) {
        setMotorDirections(REVERSE);
        setMotorPowers(power);
    }
}
