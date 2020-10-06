package org.egg.integration.dp.facade;

import org.egg.integration.dp.factorymethod.factory.FactoryAdd;
import org.junit.Test;

/**
 * 外观模式
 * 测试两个接口
 */
public class Client {

    /**
     * 先写作业，后打游戏
     */
    @Test
    public void method1() {
        RunFacade facade = new RunFacadeImpl();
        facade.method1();
    }

    /**
     * 先打游戏，后写作业
     */
    @Test
    public void method2() {
        RunFacade facade = new RunFacadeImpl();
        facade.method2();
    }

}
