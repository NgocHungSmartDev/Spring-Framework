/**
 * AccountService.java Sep 11, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 11, 2021
 */
package com.user.management.service;

import java.util.List;

import com.user.management.entity.AccountTbl;

public interface AccountService {

	List<AccountTbl> search();

	void add(AccountTbl accountTbl);

	void update(AccountTbl accountTbl);

	void delete(Long id);
}
