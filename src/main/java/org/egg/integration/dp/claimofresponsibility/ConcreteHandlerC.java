package org.egg.integration.dp.claimofresponsibility;

public class ConcreteHandlerC extends Handler {
    @Override
    public void execute(int request) {
        if(request > 20) {
            System.out.println("第三阶段" + request);
        }
    }
}
