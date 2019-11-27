package com.laws.mm.converters;

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

}