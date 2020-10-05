package org.egg.integration.dp.strategy;

import org.egg.integration.dp.strategy.contrete.StrategyAdd;
import org.egg.integration.dp.strategy.contrete.StrategyDivide;
import org.egg.integration.dp.strategy.contrete.StrategyMultiply;
import org.egg.integration.dp.strategy.contrete.StrategySubscribe;
import org.junit.Test;

/**
 * 策略模式
 * 包含策略模式和结合了工厂模式的策略模式两种使用方式
 */
public class Client {
    @Test
    public void add() {
        Context context = new Context(new StrategyAdd());
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void subscribe() {
        Context context = new Context(new StrategySubscribe());
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void multiply() {
        Context context = new Context(new StrategyMultiply());
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void divide() {
        Context context = new Context(new StrategyDivide());
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void addWithFactory() {
        WithFactoryContext context = new WithFactoryContext("+");
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void subscribeWithFactory() {
        WithFactoryContext context = new WithFactoryContext("-");
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void multiplyWithFactory() {
        WithFactoryContext context = new WithFactoryContext("*");
        System.out.println(context.calculate(1, 2));
    }

    @Test
    public void divideWithFactory() {
        WithFactoryContext context = new WithFactoryContext("/");
        System.out.println(context.calculate(1, 2));
    }

}
