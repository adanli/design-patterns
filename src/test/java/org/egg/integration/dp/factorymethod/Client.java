package org.egg.integration.dp.factorymethod;

import org.egg.integration.dp.factorymethod.factory.FactoryAdd;
import org.egg.integration.dp.factorymethod.factory.FactoryDivide;
import org.egg.integration.dp.factorymethod.factory.FactoryMultiply;
import org.egg.integration.dp.factorymethod.factory.FactorySubscribe;
import org.junit.Test;

public class Client {

    @Test
    public void add() {
        IFactory factory = new FactoryAdd();
        Operation operation = factory.createOperation();
        System.out.println(operation.calculate(1, 2));
    }

    @Test
    public void subscribe() {
        IFactory factory = new FactorySubscribe();
        Operation operation = factory.createOperation();
        System.out.println(operation.calculate(1, 2));
    }

    @Test
    public void multi() {
        IFactory factory = new FactoryMultiply();
        Operation operation = factory.createOperation();
        System.out.println(operation.calculate(1, 2));
    }

    @Test
    public void divide() {
        IFactory factory = new FactoryDivide();
        Operation operation = factory.createOperation();
        System.out.println(operation.calculate(1, 2));
    }

}
