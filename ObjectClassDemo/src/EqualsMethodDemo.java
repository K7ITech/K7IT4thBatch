import org.apache.log4j.Logger;

public class EqualsMethodDemo {
	private static final Logger log=Logger.getLogger("EqualsMethodDemo.class");
	
	
	public static void main(String[] args) {
		
		Person p1=new Person(27,"K7iT");
		Person p2=new Person(25,"Java");
		Person p3=p1;
		Person p4=new Person(27,"K7iT");
		
		log.debug(p1.equals(p2));
		log.info(p2.equals(p3));
		log.error(p3.equals(p4));
		log.fatal(p3.equals(p1));
		log.info(p1.equals(p4));
	}

}

