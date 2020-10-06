package org.egg.integration.dp.abstractfactory.db;

public class DataSourceA implements IDatasource {
    private String name;

    public DataSourceA(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IDatasource createDateSource() {
        return new DataSourceA("D_A");
    }
}
