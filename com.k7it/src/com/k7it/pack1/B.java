package com.k7it.pack1;

import org.apache.log4j.Logger;
//private access level
public class B {
	private static final Logger log=Logger.getLogger(B.class); 
	public static void main(String[] args) {
		
		A a1=new A();
		//log.info(a1.i);
	}

}
