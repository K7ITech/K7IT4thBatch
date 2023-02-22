import org.apache.log4j.Logger;

public class ElectricBike  implements  Vehicle {
	private static final Logger log=Logger.getLogger(ElectricBike.class);

	@Override
	public void fixHandle() {
   log.debug("fixing handle");		
	}

	@Override
	public void fixSeats() {
  log.info("fixing seats");		
	}

	@Override
	public void fixWheels() {
log.fatal("fixing wheels");		
	}

	@Override
	public void fixBody() {
 log.fatal("fixing body");		
	}

	@Override
	public void fixAccelator() {
 log.error("fixing accelator");		
	}

	@Override
	public void fixBreak() {
 log.debug("fixing break");		
	}

	@Override
	public void fixEngine() {
 log.info("fixing engine");		
	}

	@Override
	public void fixAdvancedNumberPlate() {
		log.fatal("fixingadvancednumberplate");
	}

}
