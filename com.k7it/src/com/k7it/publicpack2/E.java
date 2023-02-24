package com.k7it.publicpack2;

import org.apache.log4j.Logger;

import com.k7it.publicpack1.A;
//public access level
public class E extends A{
	private static final Logger log=Logger.getLogger(E.class);
	public static void main(String[] args) {
		E e1=new E();
		log.info(e1.i);
		//e1.m1();
		A a1=new A();
		a1.i=40;
		//a1.m1();
		log.info(a1.i);
		// Here, default members will not inherit default package.
	}
	

}
