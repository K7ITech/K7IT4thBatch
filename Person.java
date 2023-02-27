import org.apache.log4j.Logger;

public class Person {
	private static Logger log = Logger.getLogger(Person.class);

	public static void main(String[] args) {
		log.debug("Anu");
		log.error("Abc");
		log.fatal("xyz");
		log.info("pqr");

	}

}
