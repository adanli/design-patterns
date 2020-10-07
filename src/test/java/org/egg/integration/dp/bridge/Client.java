package org.egg.integration.dp.bridge;

import org.junit.Test;

/**
 * 桥接模式
 */
public class Client {
    @Test
    public void bridge() {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
        abstraction = new RefinedAbstraction(new ConcreteImplementorB());
        abstraction.operation();
    }
}
