package org.egg.integration.dp.builder;

import org.junit.Test;

/**
 * 建造者模式
 */
public class Client {
    /**
     * 造人
     */
    @Test
    public void createPeople() {
        Person person = new Person();
        PersonBuilder builder = new ThinPerson();
        builder.setPerson(person);
        PersonDecorator decorator = new PersonDecorator(builder);
        decorator.createPerson();
        person.display();
    }
}
