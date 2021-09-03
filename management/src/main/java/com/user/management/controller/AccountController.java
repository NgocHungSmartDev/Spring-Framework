/**
 * AccountController.java Sep 11, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 11, 2021
 */
package com.user.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.management.entity.AccountTbl;
import com.user.management.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping
	public List<AccountTbl> search () {
		return accountService.search();
	}

	@PostMapping
	public void create(@RequestBody AccountTbl accountTbl) {
		accountService.add(accountTbl);
	}

	@PutMapping
	public void update(@RequestBody AccountTbl accountTbl) {
		accountService.update(accountTbl);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		accountService.delete(id);
	}
}
