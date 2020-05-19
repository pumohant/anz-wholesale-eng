package com.anz.ANZWholesale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Account {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer accountNumber;

  private String accountName;

  private String accountType;
  
  private String balanceDate;
  
  private String currency;
  
  private Double openingAvailableBalance;
  
  public Integer getAccountNumber() {
	 return accountNumber;
  }

  public void setAccountNumber(Integer accountNumber) {
	 this.accountNumber = accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
  }
  
  public String getCurrency() {
	 return currency;
  }

  public void setCurrency(String currency) {
	 this.currency = currency;
  }
  public Double getOpeningAvailableBalance() {
	return openingAvailableBalance;
  }

  public void setOpeningAvailableBalance(Double openingAvailableBalance) {
	this.openingAvailableBalance = openingAvailableBalance;
  }
}