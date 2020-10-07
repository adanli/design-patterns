package org.egg.integration.dp.claimofresponsibility;

import org.junit.Test;

/**
 * 职责链模式
 */
public class Client {
    @Test
    public void handle() {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.execute(5);
        handler1.execute(15);
        handler1.execute(25);

    }
}
