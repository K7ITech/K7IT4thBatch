import org.apache.log4j.Logger;

public class Person {
	private static  Logger log = Logger.getLogger(Person.class);
	
		public static void main(String[] args) {
	
		log.info("Anonymous inner design2-m1");
    }

}

/*
 * p1.m1(); p1.m1(); p1.m1();
 * 
 * new Person() { void m1() { log.info("Anonymous inner  design1 -m1"); }
 * }.m1();
 * 
 * new Person() { void m1() { log.info("Anonymous inner  design2 -m1"); }
 * }.m1();
 * 
 * new Person() { void m1() { log.info("Anonymous inner  design3 -m1"); }
 * }.m1();
 * 
 * new Person() {
 * 
 * }.m1(); }
 */
