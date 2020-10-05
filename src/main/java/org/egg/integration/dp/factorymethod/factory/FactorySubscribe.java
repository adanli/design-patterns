package org.egg.integration.dp.factorymethod.factory;

import org.egg.integration.dp.factorymethod.IFactory;
import org.egg.integration.dp.factorymethod.Operation;
import org.egg.integration.dp.factorymethod.method.OperationSubscribe;

public class FactorySubscribe implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSubscribe();
    }
}
