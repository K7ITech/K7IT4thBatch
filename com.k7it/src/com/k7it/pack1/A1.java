package com.k7it.pack1;

import org.apache.log4j.Logger;

public class A1 {
private static final Logger log=Logger.getLogger(A1.class);
private int i=30;
private A1() {
log.info("no_Arg");
	
}
public static void main(String[] args) {
	A1 a1=new A1();
	log.debug(a1.i);

	
	}

}
