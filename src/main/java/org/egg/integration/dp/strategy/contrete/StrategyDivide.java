package org.egg.integration.dp.strategy.contrete;

import org.egg.integration.dp.strategy.IStrategy;

public class StrategyDivide implements IStrategy {
    @Override
    public double calculate(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return a*1.0/b;
    }
}
