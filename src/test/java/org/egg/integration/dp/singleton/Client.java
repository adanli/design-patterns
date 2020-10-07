package org.egg.integration.dp.singleton;

import org.junit.Test;

/**
 * 单例模式
 */
public class Client {
    @Test
    public void provider() {
        Instance instance1 =  Instance.getInstance();
        System.out.println(instance1);
        Instance instance2 =  Instance.getInstance();
        System.out.println(instance2);
        System.out.println(instance1==instance2);
    }
}
