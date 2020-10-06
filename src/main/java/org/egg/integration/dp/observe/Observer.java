package org.egg.integration.dp.observe;

import java.util.Objects;

/**
 * 观察者抽象类，提供某个关注主题更新后的修改功能
 */
public abstract class Observer {
    private String name;
    public abstract void change();

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Observer observer = (Observer) o;
        return Objects.equals(name, observer.name);
    }

    @Override
    public String toString() {
        return "Observer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
