package com.k7it.pack1;

import org.apache.log4j.Logger;

public class B {
//private acess level
private static final Logger log=Logger.getLogger(B.class);

	
	public static void main(String[] args) {
		A a1=new A();
		//log.fatal(a1.i);

	}

}
