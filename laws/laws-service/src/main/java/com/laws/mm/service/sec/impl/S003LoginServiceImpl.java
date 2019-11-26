package com.laws.mm.service.sec.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.laws.mm.entity.Account;
import com.laws.mm.repository.AccountRepository;
import com.laws.mm.service.sec.S003LoginService;

@Lazy
@Service
public class S003LoginServiceImpl implements S003LoginService {

	private AccountRepository accountRepo;

	@Override
	public Account findByEmail() {
		return accountRepo.findLoginAccount("email");
	}

}
