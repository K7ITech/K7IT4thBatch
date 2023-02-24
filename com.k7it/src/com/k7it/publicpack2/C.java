package com.k7it.publicpack2;
import org.apache.log4j.Logger;

import com.k7it.publicpack1.A;
import com.k7it.publicpack1.B;

//public access level 
public class C extends B{
	
	private static final Logger log=Logger.getLogger(B.class);
	public static void main(String[] args) {
		 
		A a=new A();
		log.info(a.i);
	//	a1.m1();
		/*By default java compiler will look for that class with in the same package.Else we will 
		 * get compile time error.
		*/
	}
	
}
