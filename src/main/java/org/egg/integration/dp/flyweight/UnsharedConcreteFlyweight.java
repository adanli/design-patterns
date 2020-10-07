package org.egg.integration.dp.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int times) {
        System.out.println("操作非共享的");
    }
}
