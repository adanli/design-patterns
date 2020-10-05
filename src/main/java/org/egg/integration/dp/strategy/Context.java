package org.egg.integration.dp.strategy;

/**
 * 上下文，包含抽象的策略算法
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int a, int b) {
        return strategy.calculate(a, b);
    }

}
