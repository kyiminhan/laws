package com.laws.mm.converters;

import org.springframework.beans.BeanUtils;

import com.laws.mm.dto.AS001ForgotPwdDto;
import com.laws.mm.dto.M001RegistrationDto;
import com.laws.mm.entity.Account;

public class EntityConverter {

	private volatile static EntityConverter instance;

	private EntityConverter() {
	}

	public static EntityConverter getInsance() {
		if (null == instance) {
			synchronized (EntityConverter.class) {
				if (null == instance) {
					instance = new EntityConverter();
				}
			}
		}
		return instance;
	}

	public Account convertAccount(M001RegistrationDto dto) {
		Account account = new Account();
		BeanUtils.copyProperties(dto, account, Account.class);
		return account;
	}

	public Account convertAccount(AS001ForgotPwdDto dto) {
		Account account = new Account();
		BeanUtils.copyProperties(dto, account, Account.class);
		return account;
	}
}