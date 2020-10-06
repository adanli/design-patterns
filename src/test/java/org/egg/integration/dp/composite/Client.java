package org.egg.integration.dp.composite;

import org.junit.Test;

/**
 * 组合模式
 */
public class Client {
    @Test
    public void tree() {
        Composite composite = new Composite("总公司");
        composite.add(new Leaf("浙江分公司"));

        Composite childComposite = new Composite("河北分公司");
        childComposite.add(new Leaf("石家庄中支"));
        composite.add(childComposite);

        composite.display(1);

    }
}
