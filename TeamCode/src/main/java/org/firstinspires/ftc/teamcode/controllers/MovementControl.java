package org.firstinspires.ftc.teamcode.controllers;

import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.opMode.AbstractOp;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

/**
 * Created by Staz on 10/6/2016.
 */

public class MovementControl {

    private AbstractOp opmode;

    public MovementControl(AbstractOp opmode) {
        this.opmode = opmode;
    }

    /**
     *
     * @param power [-1, 0) -> left. (0, 1] -> right
     */
    public void turn(double power) {
        if (power < 0)
            turnLeft(-power);
        else
            turnRight(power);
    }

    public void turnRight(double power) {
        setLeftMotorDirection(FORWARD);
        setRightMotorDirection(REVERSE);
        setMotorPowers(power);
    }

    public void turnLeft(double power) {
        setLeftMotorDirection(REVERSE);
        setRightMotorDirection(FORWARD);
        setMotorPowers(power);
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

    public void go(double power) {
        if (power < 0)
            goBackward(-power);
        else
            goForward(power);
    }
}
