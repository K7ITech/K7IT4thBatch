import org.apache.log4j.Logger;

public class ElectricBike implements Vehicle {
	private static final Logger log=Logger.getLogger("ElectricBike");

	@Override
	public void fixHandle() {
		log.info("Fixing bike Handle");
		
	}

	@Override
	public void fixSeats() {
		log.info("Fixing bike Seats");
		
	}

	@Override
	public void fixWheels() {
		log.debug("Fixing bike Wheels");
		
	}

	@Override
	public void fixBody() {
		
		log.debug("Fixing bike Body");
	}

	@Override
	public void fixAccelator() {
		
		log.error("Fixing bike Accelerator");
	}

	@Override
	public void fixBreak() {
		
		log.error("Fixing bike Break");
	}

	@Override
	public void fixEngine() {
	
		log.fatal("Fixing bike Engine");
	}

	@Override
	public void fixAdvNumberPlate() {
		log.info("AP 26 IN 0911");
		
	}
	
}
