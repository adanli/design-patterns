package org.egg.integration.dp.simpleFactory;

import org.egg.integration.dp.simplefactory.AbstractAnimal;
import org.egg.integration.dp.simplefactory.AnimalFactory;
import org.junit.Test;

/**
 * 简单工厂模式，根据不同的条件返回不同的实例对象
 */
public class Client {

    @Test
    public void catSpeak() {
        AbstractAnimal animal = AnimalFactory.animal("cat");
        animal.speak();
    }

    @Test
    public void dogSpeak() {
        AbstractAnimal animal = AnimalFactory.animal("dog");
        animal.speak();
    }

}
