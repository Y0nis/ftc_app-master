package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorImpl;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;


/**
 * Created by Yonis on 10/4/16.
 */


@TeleOp(name="Test Drive Teleop", group="Test")  // @Autonomous(...) is the other common choic'e

public class TestdriveTeleop extends OpMode{

    private ElapsedTime time = new ElapsedTime();

    DcMotor leftMotor, rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left motor");
        rightMotor = hardwareMap.dcMotor.get("right motor");
    }

    @Override
    public void loop() {
        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        leftMotor.setPower(1);
        rightMotor.setPower(1);
    }
}
