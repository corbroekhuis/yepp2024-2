package com.rabo.yepp.designpatterns.factory;

public class MsSqlDataSource implements DataSource{


    @Override
    public boolean connect() {
        return false;
    }
}
