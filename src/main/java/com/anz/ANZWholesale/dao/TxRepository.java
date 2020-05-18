package com.anz.ANZWholesale.dao;

import org.springframework.data.repository.CrudRepository;

import com.anz.ANZWholesale.model.Transaction;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TxRepository extends CrudRepository<Transaction, Integer> {

}