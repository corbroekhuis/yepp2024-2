package com.rabo.yepp.designpatterns.factory;

public class OracleDataSource implements DataSource{

    @Override
    public boolean connect() {
        return true;
    }
}
