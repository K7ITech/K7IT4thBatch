package com.k7it.protectedpack2;

import org.apache.log4j.Logger;

import com.k7it.protectedpack1.A;
//protected access level
public class D extends A{
	
	private static final Logger log=Logger.getLogger(D.class);
	public static void main(String[] args) {
		D d=new D();
		log.info(d.i);
		//log.debug(d.k);
		A a=new A();
		//log.addAppender(a.i);
		
		/*
		 	Protected + inheritance member act like a public scope so we cann't access 
		 	outside of the package. 
		 */
	}
	
}