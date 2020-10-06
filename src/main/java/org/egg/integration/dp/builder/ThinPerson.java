package org.egg.integration.dp.builder;

public class ThinPerson extends PersonBuilder {

    @Override
    public void constructEye() {
        super.person.setEye("大眼睛");
    }

    @Override
    public void constructNose() {
        super.person.setNose("高鼻子");
    }

    @Override
    public void constructMouth() {
        super.person.setMouth("小嘴巴");
    }
}
