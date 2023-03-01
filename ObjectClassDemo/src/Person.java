import org.apache.log4j.Logger;

public class Person {
	private static final Logger log=Logger.getLogger("Person.class");
	int age;
	String name;
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
		public String toString() {
			return "Name:"+this.name+",Age:"+this.age;
		}
		 public boolean equals (Object obj)
		{
			Person p=(Person)obj;
			
				return this.age==p.age&&this.name.equals(p.name);
				
			}
			
	}
	
	
	
	
	
	
	
	
	
	

