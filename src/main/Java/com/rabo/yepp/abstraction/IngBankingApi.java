package com.rabo.yepp.abstraction;

public class IngBankingApi implements BankingApi {

    String user;

    @Override
    public void login(String user, String password) {
        if( checkPasswordForUser(user, password)){
            this.user = user;
        }
    }

    @Override
    public void logout(String user) {
        user = null;
    }

    @Override
    public boolean transferMoney(
            String ibanFrom
            , String ibanTo
            , double amount) {

        if( userHasDebts(user)){
            return false;
        }
        // money transferred
        return true;
    }

    @Override
    public double getBalance(String iban) {
        return 34000.00;
    }

    private boolean userHasDebts(String user) {
        return false;
    }

    private boolean checkPasswordForUser(String user, String password) {
        return true;
    }

}
