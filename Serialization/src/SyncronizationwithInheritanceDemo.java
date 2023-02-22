import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class SyncronizationwithInheritanceDemo 
{
	private static final Logger log = Logger.getLogger( SyncronizationwithInheritanceDemo.class);
	public static void main(String[] args) 
	{
		log.debug("Syncronization started");
		Car car = new Car();
		car.i = 20;
		car.j = 30;
		car.s1 = "K7it";
		car.s2 = "java";
		log.debug("serialization object");
		car.PrintObj();
		FileOutputStream Out = null;
		ObjectOutputStream obj = null;

		try
		{
			Out = new FileOutputStream("Car Details.txt");
			obj = new ObjectOutputStream(Out);
			obj.writeObject(car);
			log.error("serialization Completed");
			
			
		}
		 catch(FileNotFoundException e)
		{
			 e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(obj != null)
				{
					obj.close();
					
				}
				if(Out !=null)
				{
					Out.close();
					
					
				}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
	
		

		  
	  }
	
		

	}





