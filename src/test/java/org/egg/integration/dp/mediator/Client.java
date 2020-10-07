package org.egg.integration.dp.mediator;

import org.junit.Test;

/**
 * 中介者模式
 */
public class Client {
    @Test
    public void associate() {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague("aaa", mediator);
        Colleague colleague2 = new ConcreteColleague("bbb", mediator);

        colleague1.sendMessage("hello");
        colleague2.sendMessage("hi");

    }
}
