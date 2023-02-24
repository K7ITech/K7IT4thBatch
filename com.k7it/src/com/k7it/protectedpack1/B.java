package com.k7it.protectedpack1;

import org.apache.log4j.Logger;

public class B  extends A{
	private static  final Logger log=Logger.getLogger(B.class);
	public static void main(String[] args) {
		A a=new A();
		log.debug(a.i);
		log.info(a.k);
		B  b=new B();
		log.error(b.i);
		log.fatal(b.k);
	}

}
