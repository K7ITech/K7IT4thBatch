package com.k7it.protectedpack1;

import org.apache.log4j.Logger;

public class C1 {
	private static final Logger log=Logger.getLogger(B1.class);
	public static void main(String[] args) {
		B1 b1=new B1();
		log.debug(b1.i);
		log.info(b1.s);
		
		A a1=new A();
		log.error(a1.i);
		//log.fatal(a1.s);
		/*By using super class reference variable we can't access in sub class specific member
		 
		 */
		
		A a2=new B();
		log.debug(a2.i); 
		//log.info(a2.s);
		
		/*
		 By using super class reference variable for sub class ojectwe can able access only what are the members 
		 inherited from super class to sub class,so sub class specific member we can't access by using super
		  reference variable
		 */
	}
}
