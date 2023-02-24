package com.k7it.protectedpack1;

import org.apache.log4j.Logger;

public class A1 {
	private static final Logger log=Logger.getLogger(A1.class);
	protected int i=30;
	public static void main(String[] args) {	
		A1 a1=new A1();
		log.info(a1.i);
		
	}
}
