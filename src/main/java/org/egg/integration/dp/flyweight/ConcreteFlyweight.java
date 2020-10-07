package org.egg.integration.dp.flyweight;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int times) {
        System.out.println("操作共享的");
    }
}
