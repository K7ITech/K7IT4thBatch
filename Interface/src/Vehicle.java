import org.apache.log4j.Logger;

public  abstract class Vehicle {
	public static Logger log = Logger.getLogger(Vehicle.class);
	public abstract void fixHandle();
	public abstract void fixSeats();
	public abstract void fixWheels();
	public abstract void fixBody();
	public abstract void fixAccelator();

	
}
