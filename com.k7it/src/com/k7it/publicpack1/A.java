package com.k7it.publicpack1;

import org.apache.log4j.Logger;
// public access level
public class A {
private static final Logger log=Logger.getLogger(A.class);
public int i=30;
public A()
{
	
}
	void m1() {
		log.info("m1");
	}
	
}		
