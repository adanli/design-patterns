package org.egg.integration.dp.composite;

/**
 * 顶层接口
 * 包括添加、删除、显示功能
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    abstract void add(Component component);
    abstract void remove(Component component);
    abstract void display(int depth);
}
