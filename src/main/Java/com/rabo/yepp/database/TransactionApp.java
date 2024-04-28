package com.rabo.yepp.database;

import com.github.javafaker.Faker;

import java.util.Optional;

public class TransactionApp {

    public static void main(String[] args) {

        Faker faker = new Faker();

        TransactionRepositoryImpl transactionRepository = new TransactionRepositoryImpl();
        Transaction transaction = new Transaction(
                2309334878L,
                faker.finance().iban("NL"),
                faker.finance().iban("NL"),
                93884.00);

        transactionRepository.save(transaction);

        System.out.println(transactionRepository.findAll());

        transaction.setAmount(3456.00D);
        Transaction transaction1 = transactionRepository.update(transaction);

        Optional<Transaction> transaction2 = transactionRepository.findById(1L);
        System.out.println( transaction2.get());

        transactionRepository.deleteById( 1L);
    }
}
