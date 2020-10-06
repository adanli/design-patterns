package org.egg.integration.dp.memento;

/**
 * 保存状态
 * 保存相关的属性
 */
public class GameMemento {
    private String state;
    private int age;

    public GameMemento(String state, int age) {
        this.state = state;
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
