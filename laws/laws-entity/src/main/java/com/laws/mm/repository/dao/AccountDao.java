package com.laws.mm.repository.dao;

import com.laws.mm.entity.Account;

public interface AccountDao extends BaseDao<Account> {

	Account findLoginAccount(String email);
}
