package com.anz.ANZWholesale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.anz.ANZWholesale.dao.TxRepository;
import com.anz.ANZWholesale.dao.AccountRepository;
import com.anz.ANZWholesale.model.Account;
import com.anz.ANZWholesale.model.Transaction;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(path="/anzwholesale") 
public class ANZWholesaleController {
	
  private TxRepository txRepository;
  private AccountRepository accountRepository;
  @Autowired 
  public  ANZWholesaleController(TxRepository txRepository, AccountRepository accountRepository )  {
	  this.txRepository = txRepository;
	  this.accountRepository = accountRepository;
  }
  


  @PostMapping(path="/addAccount") 
  public @ResponseBody String addNewAccount (@RequestParam Integer accountNumber
      , @RequestParam String accountName, @RequestParam String accountType, @RequestParam String balanceDate, @RequestParam String currency, @RequestParam Double openingAvailableBalance) {
    
    

    Account acc = new Account();
    acc.setAccountNumber(accountNumber);
    acc.setAccountName(accountName);
    acc.setAccountType(accountType);
    acc.setBalanceDate(balanceDate);
    acc.setCurrency(currency);
    acc.setOpeningAvailableBalance(openingAvailableBalance);

    accountRepository.save(acc);
    return "Saved";
  }

  
  @PostMapping(path="/addTransaction") 
  public @ResponseBody String addNewTransaction (@RequestParam String accountNumber
      , @RequestParam String accountName, @RequestParam String valueDate, @RequestParam String currency, @RequestParam Double debitAmount, @RequestParam Double creditAmount, @RequestParam String txType, @RequestParam String txDescription ) {

    Transaction txn = new Transaction();
    txn.setAccountNumber(accountNumber);
    txn.setAccountName(accountName);
    txn.setValueDate(valueDate);
    txn.setDebitAmount(debitAmount);
    txn.setCurrency(currency);
    txn.setCreditAmount(creditAmount);
    txn.setTxType(txType);
    txn.setTxDescription(txDescription);

    txRepository.save(txn);
    return "Saved";
  }
  
  @GetMapping(path="/viewAccountList")
  public @ResponseBody ModelAndView getAccontList(HttpServletRequest request) {
    ModelAndView mav = new ModelAndView("/resources/account.jsp", request.getParameterMap());
    mav.addObject("accountList", accountRepository.findAll());
    return mav;
  }
  
  @GetMapping(path="/viewTransactionList")
  public @ResponseBody ModelAndView getTransactionList(HttpServletRequest request) {
      ModelAndView mav = new ModelAndView("/resources/transaction.jsp", request.getParameterMap());
      mav.addObject("transactionList", txRepository.findAll());
    return mav;
  }
}


