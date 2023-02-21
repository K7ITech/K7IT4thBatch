import org.apache.log4j.Logger;

public class Bus {
	private static final Logger log=Logger.getLogger(Bus.class);
	

	public void fixHandle() {
		log.info("fixHandle ");
		
	}

	public void fixSeats() {
		log.debug("fixSeats ");
		
	}

	public void fixWheels() {
		log.error("fixWheels ");
		
	}

	
	public void fixBody() {
		log.fatal(" bus fixBody ");
		
	}


	public void fixAccelator() {
		log.info("fixAccelator ");
		
	}

	
	public void fixBreak() {
		log.debug("fixBreak ");
		
	}
	



}
