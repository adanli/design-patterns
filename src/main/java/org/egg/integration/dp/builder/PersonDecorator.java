package org.egg.integration.dp.builder;

public class PersonDecorator {
    private PersonBuilder builder;

    public PersonDecorator(PersonBuilder builder) {
        this.builder = builder;
    }

    public void createPerson() {
        builder.constructEye();
        builder.constructNose();
        builder.constructMouth();
    }

}
