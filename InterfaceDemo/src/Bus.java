import org.apache.log4j.Logger;

public class Bus extends Vehicle {
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
	public void fixBody() {
 log.fatal("fixing body");		
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

}
