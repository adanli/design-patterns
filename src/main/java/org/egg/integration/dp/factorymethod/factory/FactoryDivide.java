package org.egg.integration.dp.factorymethod.factory;

import org.egg.integration.dp.factorymethod.IFactory;
import org.egg.integration.dp.factorymethod.Operation;
import org.egg.integration.dp.factorymethod.method.OperationDivide;

public class FactoryDivide implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDivide();
    }
}
