package org.egg.integration.dp.iterator;

import org.junit.Test;

/**
 * 迭代器模式
 */
public class Client {
    @Test
    public void show() {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.addItem(1);
        aggregate.addItem(2);
        aggregate.addItem(3);
        aggregate.addItem(4);
        aggregate.addItem(5);

        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            Object object = iterator.next();
            System.out.println(object);
        }

    }
}
