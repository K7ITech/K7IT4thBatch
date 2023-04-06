import org.apache.log4j.Logger;
public class PersonManager {
	
	private static Logger log = Logger.getLogger(PersonManager.class);

	public static void main(String[] args) {
		
	//	System.out.println("Main start");
	//	System.out.println("Creating person obj");
		
		log.debug("Main start");
		log.info("Creating person obj");
		
		Person person = new Person(27, 5.7, 50.35); 
		log.info("calculating the person Runrate:");
		
		double runRate = person.getRunRate();
		log.info("Persson Runate:"+runRate);
		try {
			int i  = 1/0;
		}catch (ArithmeticException e) {
            log.error(e);

		}
		
	//	System.out.println("Main end");
	}

}



