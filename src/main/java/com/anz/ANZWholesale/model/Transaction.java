package com.anz.ANZWholesale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Transaction {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String accountNumber;

  private String accountName;

  private String valueDate;
  
  private String currency;
  
  private Float debitAmount;
  
  private Float creditAmount;
  
  private String txType;
  
  private String txDescription;
  
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public Float getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(Float debitAmount) {
    this.debitAmount = debitAmount;
  }
  
  public String getCurrency() {
	 return currency;
  }

  public void setCurrency(String currency) {
	 this.currency = currency;
  }
  public Float getCreditAmount() {
	return creditAmount;
  }

  public void setCreditAmount(Float creditAmount) {
	this.creditAmount = creditAmount;
  }
  
  public String getTxType() {
    return txType;
  }

  public void setTxType(String txType) {
    this.txType = txType;
  }
  
  public String getTxDescription() {
	return txDescription;
  }

  public void setTxDescription(String txDescription) {
    this.txDescription = txDescription;
  }
	  
}