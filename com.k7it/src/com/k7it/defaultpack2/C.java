package com.k7it.defaultpack2;

import org.apache.log4j.Logger;

public class C {
	
	private static final Logger log=Logger.getLogger(C.class);
	public static void main(String[] args) {
		//A a=new A();
		//log.info(a.i);
		
		/* we can't access default scope members outside of package (or) different package even though
		 *  if we added import  statement also.
		 */
	}

}
