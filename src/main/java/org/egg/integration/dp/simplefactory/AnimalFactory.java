package org.egg.integration.dp.simplefactory;

public class AnimalFactory {
    public static AbstractAnimal animal(String type) {
        switch (type) {
            case "cat": return new Cat();
            case "dog": return new Dog();
            default: throw new RuntimeException("error type");
        }
    }
}
