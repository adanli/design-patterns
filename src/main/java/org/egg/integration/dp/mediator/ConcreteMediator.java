package org.egg.integration.dp.mediator;

public class ConcreteMediator implements Mediator {
    @Override
    public void sendMessage(Colleague colleague, String message) {
        System.out.println(colleague.name + " send message: " + message);
    }
}
