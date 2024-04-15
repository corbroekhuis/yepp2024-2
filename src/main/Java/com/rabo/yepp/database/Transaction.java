package com.rabo.yepp.database;

public class Transaction {

    long transactionId;
    String ibanFrom;
    String ibanTo;
    double amount;

    public Transaction(long transactionId, String ibanFrom, String ibanTo, double amount) {
        this.transactionId = transactionId;
        this.ibanFrom = ibanFrom;
        this.ibanTo = ibanTo;
        this.amount = amount;
    }
}
