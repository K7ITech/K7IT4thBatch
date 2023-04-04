import org.apache.log4j.Logger;

public class InterfaceManager {
private static Logger log=Logger.getLogger(InterfaceManager.class);
public static void main(String[] args) {
	log.info("main start");
	Car car=new Car();
	car.fixHandle();
	car.fixSeats();
	car.fixBody();
	car.fixAccelator();
	car.fixWheels();
	car.fixBreak();
	
	Lorry lorry=new Lorry();
	lorry.fixBody();
	lorry.fixAccelator();
	lorry.fixBreak();
	lorry.fixHandle();
	lorry.fixEngine();
	lorry.fixSeats();
	lorry.fixWheels();
	
	Bus bus=new Bus();
	bus.fixAccelator();
	bus.fixBody();
	bus.fixBreak();
	bus.fixEngine();
	bus.fixHandle();
	bus.fixSeats();
	bus.fixWheels();
	
	ElectricBike bike=new ElectricBike();
	bike.fixAccelator();
	bike.fixBody();
	bike.fixBreak();
	bike.fixEngine();
	bike.fixHandle();
	bike.fixSeats();
	bike.fixWheels();
	
	
}
}
