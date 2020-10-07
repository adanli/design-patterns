package org.egg.integration.dp.visitor;

public class ConcreteElementB extends Element {
    public ConcreteElementB(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
        System.out.println("操作B");
    }

}
