import org.apache.log4j.Logger;

public class SchoolBus extends Bus {
	private static final Logger log=Logger.getLogger(SchoolBus.class); 
	public void fixBody() {
		super.fixBody();
		log.info("change the body color into Yellow");
		log.info("fix the safety  grills for body windows");
	}
	
}
