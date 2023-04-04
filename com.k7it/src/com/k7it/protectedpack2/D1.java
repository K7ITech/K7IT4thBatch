package com.k7it.protectedpack2;

import org.apache.log4j.Logger;

import com.k7it.protectedpack1.A1;



public class D1 extends A1 {
	public  int l=40;
	private int k=10;
	private static final Logger log=Logger.getLogger(D1.class);
	public static void main(String[] args) {
		

		D1 d1=new D1();
		log.debug(d1.i);
		log.info(d1.k);
		
		
		A1 a1=new A1();
		//log.error(a1.i);
	//	log.fatal(a1.k);
		/*
		 protected member act like default scope in case of direct class access by using 
		 super class we can't access sub class members.
		 */
		
		
		
		A1 a2=new D1();
		//log.info(a2.i);
		//log.debug(a2.k);
		//log.info(a2.l);
		
		/*
		 protected +inherited members act like a sub class specific member to by using sub class reference we can't 
		 access protected+inheritance member.
		 
		 */
		
		
	}
	

}
