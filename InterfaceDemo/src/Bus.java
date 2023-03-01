import org.apache.log4j.Logger;

public class Bus implements Vehicle {
private static  final Logger log=Logger.getLogger(Bus.class);
	@Override
	public void fixHandle() {
   log.debug("fixing handle");	
	}

	@Override
	public void fixSeats() {
   log.fatal("fixing seats");		
	}

	@Override
	public void fixWheels() {
   log.info("fixing wheels");		
	}

	
	

	@Override
	public void fixAccelator() {
 log.debug(" fixing accelator");		
	}

	@Override
	public void fixBreak() {
 log.info("fixing break");		
	}

	@Override
	public void fixEngine() {
 log.fatal("fixing engine");		
	}

	@Override
	public void fixAdvancedNumberPlate() {
		log.fatal("ap 24 pg 0910");
	}

	@Override
	public void fixBody() {
	log.debug("fixing body");
	}

}
