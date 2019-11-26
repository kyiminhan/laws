package com.laws.mm.repository.dao.impl;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.laws.mm.repository.dao.BaseDao;

@Lazy
@Repository
public abstract class AbstractBaseDaoImpl<T extends Serializable> extends SimpleJpaRepository<T, Long>
		implements BaseDao<T> {

	private static final long serialVersionUID = 1L;

	protected EntityManager entityManager;
	
	protected Class<T> entityClass;

	public AbstractBaseDaoImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
		this.entityManager = em;
		this.entityClass = domainClass;
	}

	@Override
	public T findByProperties(Map<String, Object> map) {
		return null;
	}
}
