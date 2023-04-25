import org.apache.log4j.Logger;

public class Person {
	
	private static Logger log = Logger.getLogger(Person.class);
	
	
   int age;
   double height;
   double weight;
   
   double getRunRate() {
	   log.debug("I am at Runrate Calculation method");
	   double runRate = (height*weight)/age; 
	  return runRate; 
   }
   
   public Person(int age, double height, double weight) {
	this.age = age;
	this.height = height;
	this.weight = weight;
	log.info("I am at person class constructor");
   }
}
