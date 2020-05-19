package com.anz.ANZWholesale.dao;

import org.springframework.data.repository.CrudRepository;

import com.anz.ANZWholesale.model.Account;


public interface AccountRepository extends CrudRepository<Account, Integer> {

}