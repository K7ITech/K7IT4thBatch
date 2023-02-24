package Com.k7it.privatepack1;

import org.apache.log4j.Logger;

public class A
{
	private static final Logger log = Logger.getLogger(A.class);
	private int i=30;
	void m1()
	{
		log.debug(i);
		
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m1();
		log.error(a1.i);
		
	}

}
