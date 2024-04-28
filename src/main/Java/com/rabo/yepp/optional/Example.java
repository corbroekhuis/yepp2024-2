package com.rabo.yepp.optional;

import com.rabo.yepp.database.Transaction;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {

        Transaction transaction = new Transaction( 123456, "", "", 38895.00D);
        Optional<Transaction> optional = Optional.of(transaction);
        if( optional.isPresent()){
            Transaction anotherTransaction = optional.get();
            System.out.println(transaction);
        }

        transaction = null;
        optional = Optional.ofNullable(transaction);
        if( optional.isPresent()){
            Transaction anotherTransaction = optional.get();
            System.out.println(transaction);
        }
    }
}
