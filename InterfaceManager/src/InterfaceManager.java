import org.apache.log4j.Logger;

public class InterfaceManager {
	private static final Logger log = Logger.getLogger(InterfaceManager.class);

	public static void main(String[] args) {
		log.info("main start");

		Car car = new Car();
		car.fixHandle();
		car.fixSeats();
		car.fixWheels();
		car.fixBody();
		car.fixAccelator();
		// car.fixBreak(); //break feature not implemented in car class

		Lorry lorry = new Lorry();

		lorry.fixHandle();
		lorry.fixSeats();
		lorry.fixWheels();
		lorry.fixBody();
		lorry.fixAccelator();
		lorry.fixBody();

	}
}

