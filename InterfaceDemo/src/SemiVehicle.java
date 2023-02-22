import org.apache.log4j.Logger;

public class SemiVehicle implements Vehicle {

	private static final Logger log=Logger.getLogger(Vehicle.class);
	
	@Override
	public void fixHandle() {
		
		log.info("fix Handle");
	}

	@Override
	public void fixSeats() {
		
		log.info("fix Seats");
		
	}

	@Override
	public void fixWheels() {
		
		log.info("fix seats");
		
	}

	@Override
	public void fixBody() {
		
		log.info("fix Body");
		
	}

	@Override
	public void fixAccelator() {
		
		log.info("fix Accelator");
	}

	@Override
	public void fixBreak() {
		
		log.info("Fix break");
		
	}

	@Override
	public void fixEngine() {
		
		log.info("Fix Engine");
		
	}

	@Override
	public void fixAdvNumberPlate() {
		log.info("Ap 26 AS 2526");
		
	}
}
