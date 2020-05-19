package com.anz.ANZWholesale.controller;

import com.anz.ANZWholesale.controller.ANZWholesaleController;
import com.anz.ANZWholesale.dao.TxRepository;
import com.anz.ANZWholesale.dao.AccountRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ANZWholesaleControllerTest {
	 TxRepository txRepository;
	 AccountRepository accountRepository;
	 ANZWholesaleController anzWholesaleController;
	 HttpServletRequest request;
	 
	 @Before
	 public void setUp() {
		 txRepository = mock(TxRepository.class);
		 accountRepository = mock(AccountRepository.class);
		 request = mock(HttpServletRequest.class);
		 anzWholesaleController = new ANZWholesaleController(txRepository, accountRepository );
		 
	 }
	 
	 @Test
	 public void addNewAccountTest() {
		 Assert.assertEquals("Saved", anzWholesaleController.addNewAccount(111, "SGSaving", "saving", "08/11/2018", "SGD", 3.3));
	 }
	 
	 @Test
	 public void addNewTransactionTest() {
		 Assert.assertEquals("Saved", anzWholesaleController.addNewTransaction("121-121-121", "Current Account", "Jan 12, 2018", "SGD",0.0,123.3, "credit", "Credited"));
	 }
	 
	 @Test
	 public void getAccountTest() {
		 ModelAndView modelAndView = anzWholesaleController.getAccontList(request);
		 Assert.assertNotNull(modelAndView);
		 Assert.assertEquals("/resources/account.jsp", modelAndView.getViewName());
	 }
	 
	 @Test
	 public void getTransactionTest() {
		 ModelAndView modelAndView = anzWholesaleController.getTransactionList(request);
		 Assert.assertNotNull(modelAndView);
		 Assert.assertEquals("/resources/transaction.jsp", modelAndView.getViewName());
	 }
}