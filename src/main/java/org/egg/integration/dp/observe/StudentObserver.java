package org.egg.integration.dp.observe;

public class StudentObserver extends Observer{


    public StudentObserver(String name) {
        super(name);
    }

    @Override
    public void change() {
        super.setName(super.getName()+2);
    }

    public void show() {
        System.out.println(super.getName());
    }
}
