package org.egg.integration.dp.abstractfactory;

import org.egg.integration.dp.abstractfactory.db.DataSourceB;
import org.egg.integration.dp.abstractfactory.db.IDatasource;
import org.egg.integration.dp.abstractfactory.user.IUser;
import org.egg.integration.dp.abstractfactory.user.UserA;

/**
 * 创建一个A用户和一个B数据库
 */
public class FactoryA extends AbstractFactory{

    @Override
    public IUser createUser() {
        return new UserA("U_A");
    }

    @Override
    public IDatasource createDataSource() {
        return new DataSourceB("D_B");
    }
}
