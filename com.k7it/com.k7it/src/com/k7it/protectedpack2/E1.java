package com.k7it.protectedpack2;

import org.apache.log4j.Logger;

public class E1 {
	private static final Logger log=Logger.getLogger(E1.class);
	public static void main(String[] args) {
		D1 d1=new D1();
		//log.info(d1.i);
		/*
		 protected + inheritance members act like specific and private to sub class
		 */
		
		//log.info(d1.k);
		/*
		 Private member we can't access outside
		 */
		
	}

}
