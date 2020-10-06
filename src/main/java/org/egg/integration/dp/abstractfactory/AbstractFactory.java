package org.egg.integration.dp.abstractfactory;

import org.egg.integration.dp.abstractfactory.db.IDatasource;
import org.egg.integration.dp.abstractfactory.user.IUser;

public abstract class AbstractFactory {
    /**
     * 创建用户
     */
    public abstract IUser createUser();

    /**
     * 创建数据库
     */
    public abstract IDatasource createDataSource();

}
