package org.egg.integration.dp.facade;

public interface RunFacade {
    /**
     * 先写作业，后打游戏
     */
    void method1();

    /**
     * 先打游戏，后写作业
     */
    void method2();
}
