import java.io.Serializable;

import org.apache.log4j.Logger;

public class Vehicle implements Serializable
{ 
	private static Logger log = Logger.getLogger(Vehicle.class);
	int i;
	String s1;
	Vehicle()
	{
		log.debug("super class Vehicle no age");
		
	}
	void printobj()
	{
		log.equals("I:"+this.i+",s1:"+this.s1);
		
	}
	
}
