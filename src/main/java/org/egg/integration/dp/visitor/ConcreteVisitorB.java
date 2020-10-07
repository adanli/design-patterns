package org.egg.integration.dp.visitor;

public class ConcreteVisitorB extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("访问具体的A元素");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("访问具体的B元素");
    }
}
