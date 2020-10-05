package org.egg.integration.dp.strategy.contrete;

import org.egg.integration.dp.strategy.IStrategy;

public class StrategyMultiply implements IStrategy {
    @Override
    public double calculate(int a, int b) {
        return a * b;
    }
}
