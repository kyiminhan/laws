package com.laws.mm.entity;

import java.io.Serializable;

import javax.persistence.Id;

public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	protected Long id;
}
