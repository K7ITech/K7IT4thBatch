import org.apache.log4j.Logger;

public abstract class SemiVehicle implements Vehicle {
	private static final Logger log = Logger.getLogger(SemiVehicle.class);


	public void fixHandle() {
		log.info("fixHandle ");
		
	}

	public void fixSeats() {
		log.info("fixSeats ");
		
	}

	public void fixWheels() {
		log.info("fixWheels ");
		
	}

	public void fixAccelator() {
		log.info("fixAccelator ");
		
	}

	public void fixBreak() {
		log.info("fixBreak ");
		
	}

	@Override
	public void fixBody() {
		// TODO Auto-generated method stub
		
	}
   
	

}


