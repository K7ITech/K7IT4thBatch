import org.apache.log4j.Logger;

public class AdvancedBus extends SemiVehicle{
	
private static final Logger log=Logger.getLogger(AdvancedBus.class);

	public void fixBody() {
		log.info("Fix advanced bus body");
	}
	
	public void fixAdvNumberPlate() {
		log.info("Fixing Lorry Number plate");
	}
	public void fixLights() {
		log.info("Advance lighting");
	}
}
