package org.egg.integration.dp.abstractfactory.user;

public class UserA implements IUser{
    private String name;

    public UserA(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UserA createUser() {
        return new UserA("A");
    }
}
