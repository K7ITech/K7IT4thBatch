import org.apache.log4j.Logger;

public class InterfaceManager {
	private static final Logger log=Logger.getLogger(InterfaceManager.class);
	public static void main(String[] args) {
		log.info("Main Start");
		
		Car car=new Car();
		car.fixHandle();
		car.fixSeats();
		car.fixWheels();
		car.fixBody();
		car.fixAccelator();
		car.fixBreak();
		car.fixEngine();
		
		log.info("\n");
		Lorry lorry=new Lorry();
		lorry.fixHandle();
		lorry.fixSeats();
		lorry.fixWheels();
		lorry.fixEngine();
		lorry.fixBody();
		lorry.fixAccelator();
		lorry.fixBreak();
		
		log.info("\n");
		Bus bus=new Bus();
		bus.fixHandle();
		bus.fixSeats();
		bus.fixWheels();
		bus.fixBody();
		bus.fixAccelator();
		bus.fixBreak();
		bus.fixEngine();
		
		log.debug("\n");
		ElectricBike bike=new ElectricBike();
		bike.fixAccelator();
		bike.fixBody();
		bike.fixEngine();
		bike.fixHandle();
		bike.fixSeats();
		bike.fixWheels();
		bike.fixBreak();

	}

}
