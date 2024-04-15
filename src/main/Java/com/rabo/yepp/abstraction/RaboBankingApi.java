package com.rabo.yepp.abstraction;

public class RaboBankingApi implements BankingApi {

    @Override
    public void login(String user, String password){
    }

    @Override
    public void logout(String user){}

    @Override
    public boolean transferMoney(String ibanFrom , String ibanTo, double amount){
        return true;
    }

    @Override
    public double getBalance(String iban) {
        return getCurrentBalance(iban);
    }

    private double getCurrentBalance(String iban) {
        return 34000.00;
    }
    private String createHash( String password){
        return "1K5D89L3F5JJ";
    }
    private String getHashedPasswordFromDatabase( String user){
        return "1K5D89L3F5JJ";
    }

}
