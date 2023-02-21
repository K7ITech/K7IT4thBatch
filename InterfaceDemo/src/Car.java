import org.apache.log4j.Logger;

public class Car extends Vehicle
{
private static Logger log=Logger.getLogger(Vehicle.class);  

 
	@Override
	public void fixHandle() {
		log.error("fixing car handle");
	}

	@Override
	public void fixSeats() {
		log.fatal("fixing car seats");
	}

	@Override
	public void fixWheels()	{
		log.info("fixing car wheels");
	}
	@Override
	public void fixBody() 
	{
		log.debug("fixing car Body");
		
	}

	@Override
	public void fixAccelator() {
	log.debug("fixing car Accelator");	
	}

	@Override
	public void fixBreak() {
	log.error("fixing car breaks"); 	
		
	}

	@Override
	public void fixEngine() {
   log.fatal("fixing car engine");		
	}

}
