import org.apache.log4j.Logger;

public class Bus extends Vehicle{
	private static final Logger log=Logger.getLogger("Bus.class");

	@Override
	public void fixHandle() {
		
		log.info("Fixing Bus Handle");
	}

	@Override
	public void fixSeats() {
		
		log.debug("Fixing bus Seats");
	}

	@Override
	public void fixWheels() {
		
		log.error("Fixing bus Wheels");
	}

	@Override
	public void fixBody() {
		
		log.fatal("Fixing bus Body");
	}

	@Override
	public void fixAccelator() {
		
		log.debug("Fixing bus Accelerator");
	}

	@Override
	public void fixBreak() {
		
		log.info("fixing bus Break");
	}

	@Override
	public void fixEngine() {
		
		log.error("Fixing bus Engine");
	}
	

}
