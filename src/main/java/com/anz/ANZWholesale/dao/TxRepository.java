package com.anz.ANZWholesale.dao;

import org.springframework.data.repository.CrudRepository;

import com.anz.ANZWholesale.model.Transaction;

public interface TxRepository extends CrudRepository<Transaction, Integer> {

}