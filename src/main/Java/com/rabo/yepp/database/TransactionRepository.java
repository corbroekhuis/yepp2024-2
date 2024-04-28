package com.rabo.yepp.database;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository {
    Transaction save(Transaction transaction);

    Transaction update(Transaction transaction);

    List<Transaction> findAll();

    Optional<Transaction> findById(long id);

    Optional<Transaction>deleteById(long id);
}
