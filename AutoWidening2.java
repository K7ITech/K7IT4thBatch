package com.k7it.autowidening;

class B{
	void m1(short s) {
	 System.out.println("short"+s);	
	}
	void m1(Integer i) {
		 System.out.println("Integer"+i);
	}
	void m1(long l) {
		System.out.println("long"+l);
	}
	void m1(Double d) {
		System.out.println("Double"+d);
	}	
	void m1(double d) {
		System.out.println("double"+d);
	}
}
public class AutoWidening2 {
   public static void main(String[] args) {	 
	   B a1 = new B();
	   int i =10;
	   a1.m1(i);//long10
	   short s = 12;
	   Short s2  = new Short(s);
	   a1.m1(s2);// short12
	   long l1= 45;
	   a1.m1(l1);//long45
	   
	   Float f1 = new Float(20.35);
	   a1.m1(f1);//double20.35
	 
}
}
