import java.io.Serializable;

import org.apache.log4j.Logger;

public class Car extends Vehicle implements Serializable 

{



	private static Logger log = Logger.getLogger(Car.class);
	


	int j;
	String s2;






	
	Car()
	{
		log.fatal("sub class car no arg");
		
	}
	void PrintObj()
	{
		log.info("I:"+this.i+"J:"+this.j+",S1:"+this.s1+",S2:"+this.s2);
	}
	
}