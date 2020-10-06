package org.egg.integration.dp.state;

public class AfternoonState extends AbstractState {
    /**
     * 如果是中午，睡觉，否则交给晚上
     */
    @Override
    public void handle(AbstractContext context) {
        if(context.time>=10 && context.time<14) {
            System.out.println("sleep");
        } else {
            context.state = new EveningState();
            context.work();
        }
    }
}
