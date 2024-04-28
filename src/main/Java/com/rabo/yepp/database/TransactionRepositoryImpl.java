package com.rabo.yepp.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransactionRepositoryImpl implements TransactionRepository {

    List<Transaction> rows = new ArrayList<>();

    public long getNextId(){
        return rows.size() + 1;
    }

    @Override
    public Transaction save(Transaction transaction){

        transaction.setId( getNextId());
        rows.add( transaction);
        return transaction;
    }

    @Override
    public Transaction update(Transaction transaction){

        Optional<Transaction> found = rows
                .stream()
                .filter(x -> x.getId() == transaction.getId())
                .findFirst();
        if(found.isPresent()){
            rows.remove(found);
            rows.add( transaction);

        }
        return null;
    }

    @Override
    public List<Transaction> findAll(){
        return rows;
    }

    @Override
    public Optional<Transaction>findById(long id){
        Optional<Transaction> found = rows
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
        return found;
    }

    @Override
    public Optional<Transaction>deleteById(long id){
        Optional<Transaction> found = rows
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();

        if( found.isPresent()){
            rows.remove(found.get());
        }
        return found;
    }
}
