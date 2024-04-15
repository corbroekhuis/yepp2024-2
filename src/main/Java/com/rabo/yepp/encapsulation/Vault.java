package com.rabo.yepp.encapsulation;

public interface Vault {
    boolean checkPassword(String user, String password) throws Exception;
    void storePassword(String user, String s);
}
