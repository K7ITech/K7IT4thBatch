package com.k7it.pack1;

import org.apache.log4j.Logger;


public class A{
	private static final Logger log=Logger.getLogger(A.class);
private int i=30;
void m1() {
	log.debug(i);
}
public static void main(String[] args) {
	A a1=new A();
	a1.m1();
	log.info(a1.i);
}
}
