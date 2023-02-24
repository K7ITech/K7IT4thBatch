package defaultpack1;

import org.apache.log4j.Logger;

public class A 
{
	private static final Logger log = Logger.getLogger(A.class);
	int i = 30;
	public static void main(String[] args) {
		A a1 = new A();
		log.debug(a1.i);
	}

}
