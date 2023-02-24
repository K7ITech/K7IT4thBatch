package com.k7it.protectedpack2;

import org.apache.log4j.Logger;

import com.k7it.protectedpack1.A1;

public class D1 extends A1 {
	
	public int l=40;
	private int k=10;
	private static final Logger log=Logger.getLogger(D1.class);
	public static void main(String[] args) {
	
		D1 d1=new D1();
		log.info(d1.i);
		log.debug(d1.k);
		
		A1 a1=new A1();
		//log.info(a1.i);
		//log.error(a1.k);
		
		/*
		 Protected member act like default scope incase of direct class access by
		  using super class we can't access sub class members
		 */
		
		A1 a2=new D1();
		//log.info(a2.i);
		//log.debug(a2.k);
		//log.error(a2.l);
		
		/*
		 Protected+inherited members act like a sub class specific member so by using 
		 subclass reference we can't access protected+inheritance member
		 */
	}

}
