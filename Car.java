import org.apache.log4j.Logger;

public  class Car  {

	private static final Logger log = Logger.getLogger(Car.class);

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

}
/*
 OUTPUT:
 =======
 2023-02-21 17:30:10 INFO  InterfaceManager:7 - main start
  2023-02-21 17:30:10 INFO  Car:8 - Fixing Car Handle
  2023-02-21 17:30:10 INFO  Car:12 - Fixing Car seats
  2023-02-21 17:30:10 INFO  Car:16 - Fixing Car Wheels
  2023-02-21 17:30:10 INFO  Car:28 - Fixing Car Body
  2023-02-21 17:30:10 INFO  Car:24 - Fixing Car Accelator
 */
