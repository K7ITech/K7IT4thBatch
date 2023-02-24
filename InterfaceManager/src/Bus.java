import org.apache.log4j.Logger;

public abstract class Bus implements Vehicle {
	
	private static final Logger log = Logger.getLogger(Bus.class);

		
	

	@Override
	public void fixHandle() {
		log.info("fixHandle ");

	}

	@Override
	public void fixSeats() {
		log.info("fixSeats ");

	}

	@Override
	public void fixWheels() {
		log.info("fixWheels ");

	}

	@Override
	public void fixBody() {
		log.info(" bus fixBody ");

	}

	@Override
	public void fixAccelator() {
		log.info("fixAccelator ");

	}

	@Override
	public void fixBreak() {
		log.info("fixBreak ");

	}

	

}
