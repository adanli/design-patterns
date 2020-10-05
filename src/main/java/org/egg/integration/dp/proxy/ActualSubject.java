package org.egg.integration.dp.proxy;

/**
 * 真实提供实现能力的对象
 */
public class ActualSubject extends Subject{
    @Override
    public void hello() {
        System.out.println("hello, i am actual subject");
    }
}
