package org.egg.integration.dp.claimofresponsibility;

public abstract class Handler {
    /**
     * 定义下一个执行对象
     */
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void execute(int request);

}
