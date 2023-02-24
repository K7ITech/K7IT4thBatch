package com.k7it.protectedpack1;
import org.apache.log4j.Logger;
//protected access level
public class A {
	private static final Logger log=Logger.getLogger(A.class);
	protected int i=30;
	int k=40;
	public static void main(String[] args) {
		A a=new A();
		log.debug(a.i);
		log.info(a.k);
	}
}
