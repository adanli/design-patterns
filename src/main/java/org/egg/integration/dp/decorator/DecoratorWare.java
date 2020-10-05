package org.egg.integration.dp.decorator;

/**
 * 装饰类
 */
public class DecoratorWare extends People{
    private People people;

    public void decorator(People people) {
        this.people = people;
    }

    @Override
    public void show() {
        if(people != null) {
            people.show();
        }
    }
}
