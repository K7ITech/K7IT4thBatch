import org.apache.log4j.Logger;

public class Lorry implements Vehicle{
	private static final Logger log = Logger.getLogger(Lorry.class);

	public void fixHandle() {
		log.info("Fixing Car Handle");
	}

	public void fixSeats() {
		log.info("Fixing Car seats");
	}

	public void fixWheels() {
		log.info("Fixing Car Wheels");
	}

	public void fixEngine() {
		log.info("Fixing Car Engine");
	}

	public void fixAccelator() {
		log.info("Fixing Car Accelator");
	}

	public void fixBody() {
		log.info("Fixing Car Body");
	}

	@Override
	public void fixBreak() {
		// TODO Auto-generated method stub
		
	}

}
/*
 OUTPUT:
 =======
   2023-02-21 17:30:10 INFO  Lorry:7 - Fixing Car Handle
  2023-02-21 17:30:10 INFO  Lorry:11 - Fixing Car seats
  2023-02-21 17:30:10 INFO  Lorry:15 - Fixing Car Wheels
  2023-02-21 17:30:10 INFO  Lorry:27 - Fixing Car Body
  2023-02-21 17:30:10 INFO  Lorry:23 - Fixing Car Accelator
  2023-02-21 17:30:10 INFO  Lorry:27 - Fixing Car Body
  
 
 */
