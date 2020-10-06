package org.egg.integration.dp.builder;

public class Person {
    private String eye;
    private String nose;
    private String mouth;

    public void setEye(String eye) {
        this.eye = eye;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public void display() {
        System.out.println(String.format("眼睛: %s, 鼻子: %s, 嘴巴: %s", eye, nose, mouth));
    }

}
