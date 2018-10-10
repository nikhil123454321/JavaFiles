package com.cg.banking.daoservices;

import java.util.ArrayList;

import com.cg.banking.beans.Account;

public interface AccountDAO {
	Account save(Account account);
	Account find(long accountNo);
	ArrayList<Account> findAll();
}