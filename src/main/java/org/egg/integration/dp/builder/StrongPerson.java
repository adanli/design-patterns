package org.egg.integration.dp.builder;

public class StrongPerson extends PersonBuilder{
    @Override
    public void constructEye() {
        super.person.setEye("小眼睛");
    }

    @Override
    public void constructNose() {
        super.person.setNose("大鼻子");
    }

    @Override
    public void constructMouth() {
        super.person.setMouth("厚嘴巴");
    }
}
