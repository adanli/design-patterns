package org.egg.integration.dp.strategy;

import org.egg.integration.dp.strategy.contrete.StrategyAdd;
import org.egg.integration.dp.strategy.contrete.StrategyDivide;
import org.egg.integration.dp.strategy.contrete.StrategyMultiply;
import org.egg.integration.dp.strategy.contrete.StrategySubscribe;

public class WithFactoryContext {
    private IStrategy strategy;
    public WithFactoryContext(String type) {
        switch (type) {
            case "+":
                strategy = new StrategyAdd();
                break;
            case "-":
                strategy = new StrategySubscribe();
                break;
            case "*":
                strategy = new StrategyMultiply();
                break;
            case "/":
                strategy = new StrategyDivide();
                break;
            default:
                break;
        }
    }

    public double calculate(int a, int b) {
        if(strategy != null) {
            return strategy.calculate(a, b);
        }
        throw new RuntimeException("strategy没有被初始化");
    }

}
