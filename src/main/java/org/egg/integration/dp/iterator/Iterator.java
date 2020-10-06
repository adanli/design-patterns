package org.egg.integration.dp.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器
 */
public abstract class Iterator {
    protected List<Object> objects;
    protected int current = 0;

    public Iterator(Aggregate aggregate) {
        objects = aggregate.items;
    }

    public Object first() {
        return objects.get(0);
    }

    public Object next() {
        return objects.get(current++);
    }

    public boolean isDone() {
        return current == objects.size();
    }

    public Object currentItem() {
        return objects.get(current);
    }


}
