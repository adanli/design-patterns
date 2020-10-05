package org.egg.integration.dp.strategy;

public interface IStrategy {
    /**
     * 计算接口，具体的功能在实现中体现
     * @param a 第一个参与计算的变量
     * @param b 第二个参与计算的变量
     * @return 返回的结果
     */
    double calculate(int a, int b);
}
