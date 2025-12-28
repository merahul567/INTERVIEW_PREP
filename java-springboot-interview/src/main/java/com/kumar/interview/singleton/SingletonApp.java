package com.kumar.interview.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonApp {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Hello World!!");
		
//		EagerSingleton obj1 = EagerSingleton.getInstance();
//		System.out.println(obj1.hashCode());
//		
//		EagerSingleton obj2 = EagerSingleton.getInstance();
//		System.out.println(obj2.hashCode());
//		
//		LazySingleton obj3 = LazySingleton.getInstance();
//		System.out.println(obj3.hashCode());
//		
//		LazySingleton obj4 = LazySingleton.getInstance();
//		System.out.println(obj4.hashCode());
//		
//		DoubleCheckingLazySingleton obj5 = DoubleCheckingLazySingleton.getInstance();
//		System.out.println(obj5.hashCode());
//		
//		DoubleCheckingLazySingleton obj6 = DoubleCheckingLazySingleton.getInstance();
//		System.out.println(obj6.hashCode());
//		
//		LazyInnerClassSingleton obj7 = LazyInnerClassSingleton.getInstance();
//		System.out.println(obj7.hashCode());
//		
//		LazyInnerClassSingleton obj8 = LazyInnerClassSingleton.getInstance();
//		System.out.println(obj8.hashCode());
		
		LazySingleton lazyInstance = LazySingleton.getInstance();
		System.out.println(lazyInstance.hashCode());
		
		//Clone breaks Singleton here
//		LazySingleton cloneInstance = (LazySingleton) lazyInstance.clone(); 
//		System.out.println(cloneInstance.hashCode());
		
		LazySingleton reflectionInstance = null;
		
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
		
		
		//Reflection breaks Singleton here
//		for(Constructor constructor: constructors) {
//			constructor.setAccessible(true);
//			reflectionInstance = (LazySingleton) constructor.newInstance();
//		}
//		System.out.println(reflectionInstance.hashCode());
		
		//Serialization breaks Singleton here
		//Serialize Singleton object into file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(lazyInstance);
		out.close();
		
		//Deserialize Singleton object from file
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton serializeInstance = (LazySingleton) in.readObject();
		in.close();
		
		System.out.println(serializeInstance.hashCode());
	}

}
