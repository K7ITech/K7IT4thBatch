import org.apache.log4j.Logger;

public class InterfaceManager 
{
	private static Logger log = Logger.getLogger(InterfaceManager.class);

	public static void main(String[] args) 
	{
log.info("main start");
		
		Car car = new Car();
		car.fixHandle();
		car.fixSeats();
		car.fixWheels();
		car.fixBody();
		car.fixAccelator();
		
		Lorry lorry = new Lorry();
		
		lorry.fixHandle();
		lorry.fixSeats();
		lorry.fixWheels();
		lorry.fixBody();
		lorry.fixAccelator();
		lorry.fixBreak();
		
		Bus schoolBus = new Bus();
		schoolBus.fixAccelator();
		schoolBus.fixBreak();
		
		//Auto shareAuto = new Auto();

	}

}
