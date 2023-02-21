import org.apache.log4j.Logger;

public class Car
{
	private static Logger log = Logger.getLogger(Car.class);
	public void fixHandle() {
		 log.info("Fixing Car Handle");
	}
	
	public void fixSeats() {
		 log.debug("Fixing Car seats");
	}
	public void fixWheels() {
		 log.error("Fixing Car Wheels");
	}
	
	public void fixEngine() {
		 log.fatal("Fixing Car Engine");
	}
	
	public void fixAccelator() {
		log.info("Fixing Car Accelator");
	}
	
	public void fixBody() {
		 log.debug("Fixing Car Body");
	}


}
