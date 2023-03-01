package com.k7it.protectedpack2;
import org.apache.log4j.Logger;
//protected access level
import com.k7it.pack1.A;
public class C {
	private static final Logger log=Logger.getLogger(C.class);
	public static void main(String[] args) {
		A a=new A();
		//log.debug(a.i);
		//log.error(a.k);
		
		
		 /*protected  member by default it act like a default access level scope .so we can't
		 
		*access outside of the package by using sane class references variable
	*/

}
}