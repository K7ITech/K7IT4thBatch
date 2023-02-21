import org.apache.log4j.Logger;
class person{
	private static Logger log=Logger.getLogger(InnerClassDemo.class);

	void m1()
	{
		log.debug("person-m1");
	}

}
   abstract class Vehicle
   {
	abstract void addBody();
	
   }

abstract class Car extends Vehicle{
}

public class InnerClassDemo{
	private final static  Logger log=Logger.getLogger(InnerClassDemo.class);
   public static void main(String[] args) {
	Vehicle car=new Vehicle() {
		void addBody() {
			new InnerClassDemo().log.debug("Fixed for anonymous car");
		}
	};
	car.addBody();
	new Vehicle() {
		void addBody() {
			log.error("fixed body for anonymous car");
		}
		}.addBody();	

person p1=new person() 
{
	int i=0;
	void m1() {
		log.fatal("anonymous inner class-m1");
		log.info(i);
	}
};

p1.m1();
p1.m1();
new person() 
{
	
	void m1() {
		log.error("anonymous inner design1-m1");
	}
}.m1();
new person() 
{
void m1() {
	log.error("anonymous inner design2-m1");
	
	}
}.m1();
	new person() {
		
	
}.m1();
}

}


	


	
		

	


