package org.egg.integration.dp.abstractfactory.user;

public class UserB implements IUser {
    private String name;
    public UserB(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UserB createUser() {
        return new UserB("B");
    }
}
