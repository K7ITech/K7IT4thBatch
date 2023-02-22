import org.apache.log4j.Logger;

public class Lorry implements Vehicle
{
	private static final Logger log=Logger.getLogger(Lorry.class);
	@Override
	public void fixHandle() {
		
		log.debug("fixing Lorry Handle");
	}

	@Override
	public void fixSeats() {
		
		log.info("Fixing lorry  Seats");
		
	}

	@Override
	public void fixWheels() {
		
		log.error("Fixing lorry wheels");
	}

	@Override
	public void fixBody() {
	
		log.fatal("Fixing lorry Body");
	}

	@Override
	public void fixAccelator() {
	
		log.debug("Fixing lorry Accelerator");
	}

	@Override
	public void fixBreak() {
		
		log.info("Fixing lorry Break");
	}

	@Override
	public void fixEngine() {
		log.info("Fixing lorry Engine");
		
	}

	@Override
	public void fixAdvNumberPlate() {
		log.info("IND 26 AL 2219");
		
	}


}
