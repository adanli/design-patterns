package org.egg.integration.dp.abstractfactory.db;

public class DataSourceB implements IDatasource {
    private String name;

    public DataSourceB(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IDatasource createDateSource() {
        return new DataSourceB("D_B");
    }
}
