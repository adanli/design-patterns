package org.egg.integration.dp.memento;

/**
 * 记录状态
 * 保存状态
 * 还原状态
 */
public class GameOriginator {
    /**
     * 需要被记录和还原的属性
     */
    private String state;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    public GameMemento saveMemento() {
        return new GameMemento(state, age);
    }

    public void setMemento(GameMemento memento) {
        this.state = memento.getState();
        this.age = memento.getAge();
    }

    public void show() {
        System.out.println(String.format("状态: %s, 年龄: %d", state, age));
    }

}
