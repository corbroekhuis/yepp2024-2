package com.rabo.yepp.designpatterns.factory;

public class FactoryStarter {

    public static void main(String[] args) {

    //    DataSource dataSource = DataSourceFactory.createDataSource(DataSourceFactory.ORACLE);
        DataSource dataSource = DataSourceFactory.createDataSource(DataSourceFactory.MSSQL);

        dataSource.connect();










    }
}
