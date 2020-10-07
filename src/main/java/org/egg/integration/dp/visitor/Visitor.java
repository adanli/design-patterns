package org.egg.integration.dp.visitor;

/**
 * 定义访问对象的抽象类
 * 为这个对象中所有的元素都定义一个对应的visit操作
 */
public abstract class Visitor {
    private Element element;

    /**
     * 访问具体的element元素的方法
     * @param element
     */
    public abstract void visitConcreteElementA(ConcreteElementA element);
    public abstract void visitConcreteElementB(ConcreteElementB element);

}
