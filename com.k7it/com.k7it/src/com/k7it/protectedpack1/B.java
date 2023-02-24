package com.k7it.protectedpack1;
import org.apache.log4j.Logger;
//protected access level
public class B extends A{
	private static final Logger log=Logger.getLogger(B.class);
	public static void main(String[] args) {
		A a=new A();
		log.info(a.i);
		log.debug(a.k);
		B b=new B();
		log.debug(b.i);
		log.info(b.k);
	}

}
