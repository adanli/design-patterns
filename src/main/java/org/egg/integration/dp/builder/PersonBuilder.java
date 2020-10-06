package org.egg.integration.dp.builder;

public abstract class PersonBuilder {
    protected Person person;

    public void setPerson(Person p) {
        this.person = p;
    }

    /**
     * 构建眼睛
     */
    public abstract void constructEye();

    /**
     * 构建鼻子
     */
    public abstract void constructNose();

    /**
     * 构建嘴巴
     */
    public abstract void constructMouth();

}
