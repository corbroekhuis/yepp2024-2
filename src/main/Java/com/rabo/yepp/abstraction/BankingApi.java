package com.rabo.yepp.abstraction;

public interface BankingApi {

    void login(String user, String password);
    void logout(String user);
    boolean transferMoney(String ibanFrom
            , String ibanTo, double amount);

    double getBalance(String iban);
}
