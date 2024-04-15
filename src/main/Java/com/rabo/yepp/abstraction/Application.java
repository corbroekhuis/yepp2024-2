package com.rabo.yepp.abstraction;

public class Application {

    public static void main(String[] args) {

        boolean transferred;
        double balance;

        BankingApi raboBankingApi = BankingFactory.getBankingApi( BankingFactory.NAME.RABO);
        BankingApi ingBankingApi = BankingFactory.getBankingApi( BankingFactory.NAME.ING);

        raboBankingApi.login("rabo_user", "uhhr2r");
        transferred = raboBankingApi.transferMoney( "NL98INGA000012345", "ING78RABO00078374", 67475.00);
        balance = raboBankingApi.getBalance("NL98INGA000012345");
        raboBankingApi.logout("rabo_user");

        ingBankingApi.login("ing_user", "popo4io5t");
        transferred = raboBankingApi.transferMoney( "ING78RABO00078374", "NL98INGA000012345", 1556344.56);
        balance = raboBankingApi.getBalance("ING78RABO00078374");
        raboBankingApi.logout("rabo_user");
    }
}
