package com.k7it.defaultpack1;

import org.apache.log4j.Logger;

public class B {
	private static final Logger log=Logger.getLogger(B.class);

	public static void main(String[] args) {
		A a1=new A();
		log.info(a1.i);
		
	}

}
