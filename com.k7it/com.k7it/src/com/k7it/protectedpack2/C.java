package com.k7it.protectedpack2;
import org.apache.log4j.Logger;
import com.k7it.protectedpack1.A;
//protected access level
public class C {
	private static final Logger log=Logger.getLogger(C.class);
	public static void main(String[] args) {
		A a=new A();
		//log.debug(a.i);
		//log.info(a.k);
		
		/*
		 Protected members by default it act like  default access level scope.so we can't access 
		 outside of the package by using same class reference variable.
		 */
	}

}
