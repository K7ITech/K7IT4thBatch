package com.k7it.publicpack2;

import org.apache.log4j.Logger;

import com.k7it.publicpack1.A;

public class D {
	private static final Logger log=Logger.getLogger(D.class);
	public static void main(String[] args) {
		A a1=new A();
		log.debug(a1.i);
	//	a1.m1();
		
		/* m1() is default scope member .so we can't access outside of package even though
		 *  class is public. 
		 */
	}

}
