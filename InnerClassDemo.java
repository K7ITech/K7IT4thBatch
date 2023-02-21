import org.apache.log4j.Logger;

class Person{
	private static Logger log=Logger.getLogger(InnerClassDemo.class);	
	void m1()
	{
		log.debug("Person-m1");
	}
}
abstract class Vehicle
{
	abstract void addBody();
}
abstract class Car extends Vehicle{
	
}
public class InnerClassDemo {
	
	private static Logger log=Logger.getLogger(InnerClassDemo.class);
	
	public static void main(String[] args) {
		
	Vehicle car=new Vehicle() {
		void addBody() {
			new InnerClassDemo().log.debug("Fixed for anonymous car");
		}
	};
	car.addBody();
	new Vehicle() {
		void addBody() {
			log.error("Fixed body for anonymous car");
		}
	}.addBody();
	 
	
	Person p1=new Person()
	{
		int i=10;
		void m1()
		{
			log.error("Anonymous inner class-m1");
			log.fatal(i);
		
		}
	};
	
	p1.m1();
	p1.m1();
	
	new Person()
	{
		void m1() {
			log.debug("Anonymous inner design1-m1");
			
		}
	}.m1();
	new Person()
	{
		void m1()
		{
			log.info("Anonymous inner design2-m1");
		}
	
		}.m1();
		new Person() {
			
		
}.m1();

}
}