package com.laws.mm.repository.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.laws.mm.entity.Account;
import com.laws.mm.repository.dao.AccountDao;

public class AccountDaoImplTest extends AbstractBaseDaoImpl<Account> implements AccountDao {

	private static final long serialVersionUID = 1L;

	public AccountDaoImplTest(Class<Account> domainClass, EntityManager em) {
		super(domainClass, em);
	}

	@Override
	public Account findLoginAccount(String email) {

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Account> cQuery = builder.createQuery(entityClass);
		@SuppressWarnings("unused")
		Root<Account> root = cQuery.from(entityClass);
		return null;
	}

}
