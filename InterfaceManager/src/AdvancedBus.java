import org.apache.log4j.Logger;

public class AdvancedBus extends SemiVehicle {
	private static final Logger log = Logger.getLogger(SchoolBus.class);

	@Override
	public void fixBody() {
		log.info("fix advanced bus body");

	}

	public void fixAdvNumberPlate() {
		log.info("Fixing Lorry number plate");
	}

	@Override
	public void fixLights() {
		log.info("advanced lighting");
	}

}
