package org.egg.integration.dp.visitor;

public abstract class Element {
    protected String name;

    public Element(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return "element, name = " + name;
    }
}
