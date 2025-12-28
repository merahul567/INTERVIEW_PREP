package com.kumar.interview.singleton;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable{
	
	private LazySingleton() {
		//To avoid breaking singleton from Reflection
		if(instance != null) {
			throw new IllegalStateException("Object can't be created using Reflection");
		}
	}
	
	//To avoid breaking singleton from Serialization
	protected Object readResolve() {
		return instance;
	}
	//To avoid breaking singleton from Clone
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	private static LazySingleton instance;
	
//	public static LazySingleton getInstance() {
//		if(instance ==  null) {
//			return instance = new LazySingleton();
//		}else {
//			return instance;
//		}
//	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance ==  null) {
			return instance = new LazySingleton();
		}else {
			return instance;
		}
	}
}
