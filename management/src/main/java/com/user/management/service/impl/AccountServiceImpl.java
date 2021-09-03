/**
 * AccountServiceImpl.java Sep 11, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 11, 2021
 */
package com.user.management.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.user.management.entity.AccountTbl;
import com.user.management.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private static List<AccountTbl> accountTbls = null;

	@PostConstruct
	void initData() {
		if (accountTbls == null) {
			accountTbls = new ArrayList<>();
			AccountTbl accountTbl = null;

			for (int i = 0; i < 5; i++) {
				accountTbl = new AccountTbl();
				accountTbl.setId(Long.valueOf(i));
				accountTbl.setUsername("Admin_" + i);
				accountTbl.setAge("1" + i);
				accountTbls.add(accountTbl);
			}
		}
	}

	@Override
	public List<AccountTbl> search() {
		return accountTbls;
	}

	@Override
	public void add(AccountTbl accountTbl) {
		if (accountTbls == null) {
			accountTbls = new ArrayList<>();
		}
		accountTbls.add(accountTbl);
	}

	@Override
	public void update(AccountTbl accountTbl) {
		if (accountTbl.getId() != null && accountTbls != null) {
			AccountTbl accountUpdate = accountTbls.stream().filter(item -> item.getId() == accountTbl.getId())
					.findFirst().orElse(null);

			if (accountUpdate != null) {
				accountUpdate.setUsername(accountTbl.getUsername());
				accountUpdate.setAge(accountTbl.getAge());
			}
		}
	}

	@Override
	public void delete(Long id) {
		if (id != null && accountTbls != null) {
			AccountTbl accountDelete = accountTbls.stream().filter(item -> item.getId() == id).findFirst().orElse(null);

			if (accountDelete != null) {
				accountTbls.remove(accountDelete);
			}
		}
	}

}
