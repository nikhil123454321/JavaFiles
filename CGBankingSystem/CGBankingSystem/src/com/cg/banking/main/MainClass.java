package com.cg.banking.main;

import com.cg.banking.beans.Account;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

public class MainClass {
	public static void main(String[] args) {
		BankingServices bankingServices = new BankingServicesImpl();
		try {
			bankingServices.openAccount("Savings", 1000);
			bankingServices.openAccount("Savings", 3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Account account = bankingServices.depositAmount(100001, 2000);
			System.out.println(account.getAccountBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Account account = bankingServices.withdrawAmount(100001, 1000,1111);
			System.out.println(account.getAccountBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bankingServices.fundTransfer(100001, 100002, 999, 1112);
			Account account = bankingServices.getAccountDetails(100001);
			System.out.println(account.getAccountBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bankingServices.getAllAccountDetails();
		} catch (BankingServicesDownException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
