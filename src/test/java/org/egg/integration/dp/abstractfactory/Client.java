package org.egg.integration.dp.abstractfactory;

import org.egg.integration.dp.abstractfactory.db.IDatasource;
import org.egg.integration.dp.abstractfactory.user.IUser;
import org.junit.Test;

public class Client {
    /**
     * 创建一个用户A和一个数据库B
     */
    @Test
    public void create() {
        AbstractFactory factory = new FactoryA();
        IUser user = factory.createUser();
        System.out.println(user.getName());
        IDatasource datasource = factory.createDataSource();
        System.out.println(datasource.getName());
    }
}
