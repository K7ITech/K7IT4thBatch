import org.apache.log4j.Logger;

public class InnerClass {
	private static Logger log = Logger.getLogger(InnerClass.class);
	class Person{
		void m1()
		{
			log.debug("Person-m1");
		}
		
		
	}
	abstract class Vehicle
	{
		abstract void addBody1();
		
	}
	abstract class Car extends Vehicle
	{
		
	}
	
	public class InnerClassDemo
	{
		private Logger log = Logger.getLogger(InnerClassDemo.class);
		
	public void main(String[] args)
	{
		Vehicle car = new Vehicle()
				{

					void addBody()
					{
						new InnerClassDemo().log.debug("Fixed for anonymous car");
						
					}

					@Override
					void addBody1() {
						// TODO Auto-generated method stub
						
					}
			
				
				};
				car.addBody1();
				new Vehicle()
				{
					void addBody1()
					{
						log.error(" Fixed body for Anonymous car");
					}
					
				}.addBody1();
				Person p1 = new Person()
						{
					int i=0;
					void m1()
					{
						log.error(" Anonymous Inner Class-m1");
						log.fatal(i);
					}
						};
						
						p1.m1();
						p1.m1();
						
						new Person()
						{
							void m1()
							{
								log.debug("Anonymous inner design2-m1");
							}
							
						}.m1();
						new Person()
						{
							void m1()
							{
								log.info("Anonymous inner design2-m1");
							}
						}.m1();
							new Person()
							{
								
							}.m1();
				
	}

}
}

