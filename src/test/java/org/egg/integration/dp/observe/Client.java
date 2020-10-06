package org.egg.integration.dp.observe;

import org.junit.Test;

/**
 * 观察者模式
 */
public class Client {
    /**
     * 通过所有的观察者，修改自己的name，变成${name}2
     */
    @Test
    public void changeAllObserversName() {
        AbstractTopic topic = new StudentTopic();
        Observer observer1 = new StudentObserver("ob1");
        Observer observer2 = new StudentObserver("ob2");
        topic.attach(observer1);
        topic.attach(observer2);
        topic.change();
        System.out.println("------第一次------");
        topic.show();

        topic.detach(observer1);
        topic.change();
        System.out.println("------第二次------");
        topic.show();

    }
}
