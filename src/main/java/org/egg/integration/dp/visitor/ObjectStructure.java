package org.egg.integration.dp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 能够枚举所有的元素
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for(Element element: elements) {
            element.accept(visitor);
        }
    }

}
