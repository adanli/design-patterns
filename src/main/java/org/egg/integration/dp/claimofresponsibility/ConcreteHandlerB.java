package org.egg.integration.dp.claimofresponsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void execute(int request) {
        if(request>10 && request<=20) {
            System.out.println("第二阶段" + request);
        } else {
            nextHandler.execute(request);
        }
    }
}
