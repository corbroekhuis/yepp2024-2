package com.rabo.yepp.database;

import com.github.javafaker.Faker;

import java.util.Optional;

public class CustomerApp {

    public static void main(String[] args) {

        Faker faker = new Faker();

        Repository<Customer> customerRepository = new RepositoryImpl<Customer>();
        String name = faker.name().firstName() + " " + faker.name().lastName();
        String email = name.replaceAll(" ", ".").toLowerCase() + "@savings.org";
        Customer customer = new Customer(288374L, name, email);

        customerRepository.save( customer);
        // customer now has an id

        System.out.println("Customer:");
        System.out.println( customerRepository.findById(customer.getId()));

        Repository<Transaction> transactionRepository = new RepositoryImpl();
        Transaction transaction = new Transaction(
                2309334878L,
                faker.finance().iban("NL"),
                faker.finance().iban("NL"),
                93884.00);

        transactionRepository.save(transaction);

        transaction = new Transaction(
                3487823093L,
                faker.finance().iban("NL"),
                faker.finance().iban("NL"),
                35894.00);

        transactionRepository.save(transaction);

        System.out.println("Transactions:");
        System.out.println(transactionRepository.findAll());

        transaction.setAmount(3456.00D);
        Transaction transaction1 = transactionRepository.update(transaction);

        Optional<Transaction> optionalTransaction = transactionRepository.findById(1L);
        System.out.println("Transaction:");
        System.out.println( optionalTransaction.get());

        transactionRepository.deleteById( 1L);
        System.out.println("Transactions:");
        System.out.println(transactionRepository.findAll());
    }
}
