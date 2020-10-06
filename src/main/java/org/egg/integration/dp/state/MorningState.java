package org.egg.integration.dp.state;

public class MorningState extends AbstractState {
    /**
     * 如果是白天，运动，否则交给中午
     */
    @Override
    public void handle(AbstractContext context) {
        if(context.time < 10) {
            System.out.println("run");
        } else {
            context.state = new AfternoonState();
            context.work();
        }
    }
}
