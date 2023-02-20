import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

public class ArrayList_hasnext 
{
	private static Logger log = Logger.getLogger(ArrayList_hasnext.class);

	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add("Latha");
		list1.add(123);
		list1.add(40.35);
		list1.add(true);
		Iterator it = list1.iterator();
		while(it.hasNext());
		
		
		
		{
			log.debug(it.next());
		}

	}

	

}
