import org.apache.log4j.Logger;

public interface Vehicle {
	public static final Logger log=Logger.getLogger(Vehicle.class);
	public abstract void fixHandle();
	public abstract void fixSeats();
	public abstract void fixWheels();
	public abstract void fixBody();
	public abstract void fixAccelator();
	public abstract void fixBreak();
	public abstract void fixEngine();
	public abstract void fixAdvNumberPlate();
	public static int numberOfLights() {
		return 2;
	}
	public default void fixLights() {
		log.info("Fixing default lights");
	}
}
