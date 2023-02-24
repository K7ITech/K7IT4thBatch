package com.k7it.protectedpack1;

import org.apache.log4j.Logger;

public class C1 {
	private static final Logger log=Logger.getLogger(C1.class);
	public static void main(String[] args) {
		B1 b1=new B1();
		log.info(b1.i);
		log.debug(b1.s);
		
		A1 a1=new A1();
		log.info(a1.i);
		//log.info(a1.s);
		/*
		 By using super class reference variable we can't access sub 
		 class specific member
		 */
		A1 a2=new B1();
		log.info(a2.i);
		//log.debug(a2.s);
		/*
		 By using superclass reference variable from sub class object we can able to 
		 access only what are the member inherited from super class to subclass ,so 
		 sub class specific member we can't access by super reference variable. 
		 */
		
		
	}

}
