package org.egg.integration.dp.abstractfactory.user;

public interface IUser {
    /**
     * 提供用户
     */
    IUser createUser();

    String getName();
}
