package org.egg.integration.dp.claimofresponsibility;

public class ConcreteHandlerA extends Handler {

    @Override
    public void execute(int request) {
        if(request>0 && request<=10) {
            System.out.println("第一阶段" + request);
        } else {
            nextHandler.execute(request);
        }
    }
}
