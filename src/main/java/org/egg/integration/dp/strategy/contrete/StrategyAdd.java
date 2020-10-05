package org.egg.integration.dp.strategy.contrete;

import org.egg.integration.dp.strategy.IStrategy;

public class StrategyAdd implements IStrategy {

    @Override
    public double calculate(int a, int b) {
        return a + b;
    }
}
