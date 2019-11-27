package com.laws.mm.service.member.impl;

import com.laws.mm.converters.EntityConverter;
import com.laws.mm.dto.M001RegistrationDto;
import com.laws.mm.entity.Account;
import com.laws.mm.service.member.M001RegistrationService;

public class M001RegistrationServiceImpl implements M001RegistrationService {

	@SuppressWarnings("unused")
	@Override
	public void save(M001RegistrationDto dto) {
		Account convertAccount = EntityConverter.getInsance().convertAccount(dto);
	}
}