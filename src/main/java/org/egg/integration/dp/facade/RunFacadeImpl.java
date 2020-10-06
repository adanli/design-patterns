package org.egg.integration.dp.facade;

public class RunFacadeImpl implements RunFacade{
    private DoHomework doHomework;
    private PlayGame playGame;

    public RunFacadeImpl() {
        doHomework = new DoHomework();
        playGame = new PlayGame();
    }

    @Override
    public void method1() {
        doHomework.doHomework();
        playGame.playGame();
    }

    @Override
    public void method2() {
        playGame.playGame();
        doHomework.doHomework();
    }
}
