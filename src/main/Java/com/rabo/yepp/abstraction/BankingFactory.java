package com.rabo.yepp.abstraction;

public class BankingFactory {

    public enum NAME { ING, RABO};

    public static BankingApi getBankingApi(NAME name) {

        if( name == NAME.ING)
        return new IngBankingApi();

        if( name == NAME.RABO)
            return new RaboBankingApi();

        return null;
    }
}
