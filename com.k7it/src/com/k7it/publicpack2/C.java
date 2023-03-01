package com.k7it.publicpack2;
import org.apache.log4j.Logger;

import com.k7it.publicpack1.B;
//public access  level
public class C  extends B{
private static final Logger log=Logger.getLogger(B.class);
public static void main(String[] args) {
	//A a1=new A();
	//log.info(a1.i);
	//a1.m1();
	//by default java compiler will look for  that class with the same package .else we will get compiler time error.
}
}
