package com.laws.mm.converters;

public class DtoConverter {

	private volatile static DtoConverter instance;

	private DtoConverter() {
	}

	public static DtoConverter getInsance() {
		if (null == instance) {
			synchronized (DtoConverter.class) {
				if (null == instance) {
					instance = new DtoConverter();
				}
			}
		}
		return instance;
	}

}