package com.cg.banking.services;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.daoservices.AccountDAOImpl;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;

public class BankingServicesImpl implements BankingServices {
	private static AccountDAO accountDAO = new AccountDAOImpl();
	
	public static final  Logger logger = Logger.getLogger(BankingServicesImpl.class);
	@Override
	public long openAccount(String accountType, float initBalance)
			throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		Account account = new Account(accountType, initBalance);
		if(account.getAccountBalance()<1000)
			throw new InvalidAmountException("Minimum account balance should be 1000!");
		account = accountDAO.save(account);
		return account.getAccountNo();
	}

	@Override
	public Account depositAmount(long accountNo, float amount)
			throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException {
		Account account = new Account();
		account = accountDAO.find(accountNo);
		if(account==null)
			throw new AccountNotFoundException("Please enter a valid account number!");
		account.setAccountBalance(account.getAccountBalance()+amount);
		return account;
	}

	@Override
	public Account withdrawAmount(long accountNo, float amount, int pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException{
		Account account = new Account();
		account = accountDAO.find(accountNo);
		if(account==null)
			throw new AccountNotFoundException("Please enter a valid account number!");
		else if(account.getAccountBalance()-amount<0)
			throw new InsufficientAmountException("Please Enter a Valid Amount");
		else if(account.getPinNumber()!=pinNumber)
			throw new InvalidPinNumberException("Enter a valid PinNumber");
		account.setAccountBalance(account.getAccountBalance()-amount);
		return account;
	}

	@Override
	public boolean fundTransfer(long accountNoTo, long accountNoFrom, float transferAmount, int pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServicesDownException, AccountBlockedException {
		Account acc1 = accountDAO.find(accountNoTo);
		Account acc2 = accountDAO.find(accountNoFrom);
		if(acc2.getAccountBalance()<transferAmount)
			throw new InsufficientAmountException("Please Enter a Valid Amount!");
		if(acc2.getPinNumber()!=pinNumber)
			throw new InvalidPinNumberException("Enter a valid PinNumber");
		acc2.setAccountBalance(acc2.getAccountBalance()-transferAmount);
		acc1.setAccountBalance(acc1.getAccountBalance()+transferAmount);
		return true;
	}

	@Override
	public Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServicesDownException {
		Account account = accountDAO.find(accountNo);
		return account;
	}

	@Override
	public List<Account> getAllAccountDetails() throws BankingServicesDownException {
		return accountDAO.findAll();
	}

	@Override
	public List<Transaction> getAccountAllTransaction(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String accountStatus(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException, AccountBlockedException {
		Account account = accountDAO.find(accountNo);
		return account.getStatus();
	}

}
