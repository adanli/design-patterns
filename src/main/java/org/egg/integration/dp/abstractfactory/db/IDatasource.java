package org.egg.integration.dp.abstractfactory.db;

public interface IDatasource {

    IDatasource createDateSource();
    String getName();
}
