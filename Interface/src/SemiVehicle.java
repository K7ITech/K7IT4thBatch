import org.apache.log4j.Logger;

public class  SemiVehicle
{
	private static Logger log = Logger.getLogger(SemiVehicle.class);
	public void fixHandle() {
		log.info("fixHandle ");
		
	}

	public void fixSeats() {
		log.debug("fixSeats ");
		
	}

	public void fixWheels() {
		log.error("fixWheels ");
		
	}

	public void fixAccelator() {
		log.info("fixAccelator ");
		
	}

	public void fixBreak() {
		log.fatal("fixBreak ");
		
	}
   

}
