package org.egg.integration.dp.visitor;

public class ConcreteElementA extends Element {
    public ConcreteElementA(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        System.out.println("操作A");
    }

}
