package org.egg.integration.dp.decorator;

/**
 * 基类，提供核心职责
 */
public class People {
    private String name;

    public People() {

    }

    public People(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    };
}
