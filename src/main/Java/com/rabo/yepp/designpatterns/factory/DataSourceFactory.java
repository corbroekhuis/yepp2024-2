package com.rabo.yepp.designpatterns.factory;

public class DataSourceFactory {

    public static final String ORACLE = "ORACLE";
    public static final String MSSQL = "MSSQL";

    public static DataSource createDataSource( String type) {
        if(type.equals(ORACLE)){
            return new OracleDataSource();
        }
        return new MsSqlDataSource();
    }
}
