import org.apache.log4j.Logger;

public class EqualMethodDemo {
private static final Logger log=Logger.getLogger("EqualMethodDemo.class");

	public static void main(String[] args) {
       Person p1=new Person(25,"java");
       Person p2=new Person(27,"k7it");
       Person p3=p1;
       Person p4=new Person(23,"java");
      
       log.debug(p1.equals(p2));
       log.info(p2.equals(p3));
       log.error(p3.equals(p4));       
       log.fatal(p4.equals(p1));
       log.info(p1.equals(p3));
        
	}

}
