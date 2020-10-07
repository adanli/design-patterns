package org.egg.integration.dp.visitor;

import org.junit.Test;

/**
 * 访问者模式
 */
public class Client {
    @Test
    public void visit() {
        ObjectStructure objectStructure = new ObjectStructure();
        Element elementA = new ConcreteElementA("element a");
        Element elementB = new ConcreteElementB("element b");
        objectStructure.attach(elementA);
        objectStructure.attach(elementB);

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);

    }
}
