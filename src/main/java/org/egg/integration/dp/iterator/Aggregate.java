package org.egg.integration.dp.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合对象
 */
public abstract class Aggregate {
    protected List<Object> items = new ArrayList<>();
    abstract Iterator createIterator();

    public void addItem(Object item) {
        items.add(item);
    }

}
