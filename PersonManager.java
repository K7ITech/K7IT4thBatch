import org.apache.log4j.Logger;

public class PersonManager {
	private static Logger log=Logger.getLogger(PersonManager.class); 

	public static void main(String[] args) {
		log.debug("hai");
		log.error("how");
		log.fatal("he");
		log.info("she");
	}

}
