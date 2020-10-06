package org.egg.integration.dp.state;

public abstract class AbstractContext {
    protected int time;
    protected AbstractState state;
    public abstract void work();
}
