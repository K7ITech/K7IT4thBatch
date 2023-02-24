package com.k7it.defaultpack1;
//default access level
import org.apache.log4j.Logger;

public class A {
	int i=30;
	private static final Logger log=Logger.getLogger(A.class);
	public static void main(String[] args) {
		
		A a=new A();
		log.info(a.i);
	}
}
