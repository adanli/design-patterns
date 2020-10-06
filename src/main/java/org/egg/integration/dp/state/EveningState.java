package org.egg.integration.dp.state;

public class EveningState extends AbstractState {
    /**
     * 如果是晚上，交给游戏
     */
    @Override
    public void handle(AbstractContext context) {
        System.out.println("game");
    }
}
