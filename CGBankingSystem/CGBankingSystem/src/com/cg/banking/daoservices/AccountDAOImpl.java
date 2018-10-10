package com.cg.banking.daoservices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import com.cg.banking.beans.Account;

public class AccountDAOImpl implements AccountDAO{

	ArrayList<Account> accList = new ArrayList<Account>();
	@Override
	public Account save(Account account) {
		accList.add(account);
		return account;
	}
	@Override
	public Account find(long accountNo) {
		for (Account acc : accList)
			if(acc.getAccountNo()==accountNo)
				return acc;
		return null;
	}
	@Override
	public ArrayList<Account> findAll() {
		System.out.println(accList);
		return accList;
	}
	

}