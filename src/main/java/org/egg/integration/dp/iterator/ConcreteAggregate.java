package org.egg.integration.dp.iterator;

public class ConcreteAggregate extends Aggregate{
    @Override
    Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
