package org.firstinspires.ftc.teamcode.opMode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opMode.TimeDelayOp;

/**
 * Created by Yonis on 10/6/16.
 */

@TeleOp(group = "testing - manual", name = "Test")
public class TestOpMode extends TimeDelayOp {
    @Override
    public void loop(int CURRENT_STAGE) {
        switch (CURRENT_STAGE) {
            case 0:
                direction.goForward(1.0d);
                break;

            case 1:
                direction.goBackward(1.0d);
                break;

            case 2:
                direction.turnRight();
                break;

            case 3:
                direction.turnLeft();
                break;
        }
    }
}
