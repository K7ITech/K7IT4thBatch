package com.k7it.defaultpack2;

import org.apache.log4j.Logger;
import com.k7it.defaultpack1.A;
//default acess level
public class D {
	
	private static final Logger log=Logger.getLogger(D.class);
	public static void main(String[] args) {
		{
			A a=new A();
		//	log.info(a.i);
		
		// Here class A is having default access level.So,we can't access outside of the package.
		}
	}
}
