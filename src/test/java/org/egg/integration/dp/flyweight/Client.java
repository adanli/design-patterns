package org.egg.integration.dp.flyweight;

import org.junit.Test;

/**
 * 享元模式
 */
public class Client {
    @Test
    public void provider() {
        Flyweight flyweightX = FlyweightFactory.get("X");
        System.out.println(flyweightX);
        Flyweight flyweightY = FlyweightFactory.get("Y");
        System.out.println(flyweightY);
        Flyweight flyweightX2 = FlyweightFactory.get("X");
        System.out.println(flyweightX2);
        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight();
        System.out.println(unsharedFlyweight);
    }
}
