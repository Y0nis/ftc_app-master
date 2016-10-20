package org.firstinspires.ftc.teamcode.opMode;

/**
 * Created by Staz on 10/6/2016.
 */

public abstract class AbstractTimeBasedOp extends AbstractOp {

    public int currentStage = 0;
    public int lastStage = 0;
    public long delay = 1500;
    public long nextDelayTime = System.currentTimeMillis() + delay;

    @Override
    public void loop() {
        if (nextDelayTime <= System.currentTimeMillis()) {
            currentStage++;

            if (currentStage > lastStage)
                currentStage = 0;
            nextDelayTime = System.currentTimeMillis() + delay;
        }

        loop(currentStage);
    }

    public abstract void loop(int CURRENT_STAGE);
}
