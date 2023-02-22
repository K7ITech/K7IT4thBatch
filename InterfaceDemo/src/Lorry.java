import org.apache.log4j.Logger;

public class Lorry  implements Vehicle{
	private static final Logger log=Logger.getLogger(Lorry.class);

	@Override
	public void fixHandle() {
		log.debug("fixing lorry handle");
	}

	@Override
	public void fixSeats() {
	log.info("fixing lorry seats" );	
	}

	@Override
	public void fixWheels() {
	log.error("fixing lorry wheels");	
	}

	@Override
	public void fixBody() {
	log.fatal("fixing lorry body" );	
	}

	@Override
	public void fixAccelator() {
   log.error("fixing accelator");		
	}

	@Override
	public void fixBreak() {
log.fatal("fixing lorry break");		
	}

	public void fixEngine() {
    log.debug("fixing lorry engine");		
	}

	@Override
	public void fixAdvancedNumberPlate() {
		log.debug("fixing advancednumberplate");
	}
	

}
