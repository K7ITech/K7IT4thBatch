package com.k7it.defaultpack2;

import org.apache.log4j.Logger;

import com.k7it.defaultpack1.A;


public class D {
	private static final Logger log=Logger.getLogger(D.class);
	public static void main(String[] args) {
		A a =new A();
		//log.debug(a.i);
		//here class A is having default access level.so,we can't access outside of the package
	}
}
