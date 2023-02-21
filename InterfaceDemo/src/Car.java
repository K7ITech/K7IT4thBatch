import org.apache.log4j.Logger;

public class Car extends Vehicle
{
private static final Logger log=Logger.getLogger(Car.class);


	@Override
	public void fixHandle() {
	
		log.debug("Fixing car handle");
	}

	@Override
	public void fixSeats() {
		
		log.info("Fixing car seats");
	}

	@Override
	public void fixWheels() {
		
		log.fatal("Fixing car wheels");
	}

	@Override
	public void fixBody() {
		
		log.fatal("Fixing car body");
	}

	@Override
	public void fixAccelator() {
		
		log.error("Fixing car accelator");
	}

	@Override
	public void fixBreak() {
		log.info("Fixing car break" );
		
	}

	@Override
	public void fixEngine() {
		log.info("Fixing car Engine");
		
	}
	

}
