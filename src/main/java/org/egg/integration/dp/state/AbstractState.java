package org.egg.integration.dp.state;

public abstract class AbstractState {
    public abstract void handle(AbstractContext context);
}
