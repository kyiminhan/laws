package com.laws.mm.repository.dao;

import java.io.Serializable;
import java.util.Map;

public interface BaseDao<T extends Serializable> extends Serializable {
	T findByProperties(Map<String, Object> map);
}
