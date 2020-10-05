package org.egg.integration.dp.factorymethod;

/**
 * 基于依赖倒转考虑，将工厂抽象成一个接口
 */
public interface IFactory {
    Operation createOperation();
}
