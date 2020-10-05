package org.egg.integration.dp.factorymethod.method;

import org.egg.integration.dp.factorymethod.Operation;

public class OperationMultiply extends Operation {
    @Override
    public double calculate(int a, int b) {
        return a * b;
    }
}
