package org.egg.integration.dp.Decorator;

import org.egg.integration.dp.decorator.DecoratorWare;
import org.egg.integration.dp.decorator.People;
import org.egg.integration.dp.decorator.WareDress;
import org.egg.integration.dp.decorator.WareTShirt;
import org.junit.Test;

/**
 * 装饰模式=门面模式
 */
public class Client {

    @Test
    public void ware() {
        People people = new People("aaa");
        DecoratorWare decorator = new DecoratorWare();
        decorator.decorator(people);

        WareTShirt wareTShirt = new WareTShirt();
        wareTShirt.decorator(people);

        WareDress wareDress = new WareDress();
        wareDress.decorator(people);
        wareDress.show();

    }
}
