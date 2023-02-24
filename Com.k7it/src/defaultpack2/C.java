package defaultpack2;

import org.apache.log4j.Logger;


public class C
{
	private static final Logger log = Logger.getLogger(C.class);
	public static void main(String[] args) 
	{
		A a1 = new A();
		log.info(a1.i);
		
	}

}
