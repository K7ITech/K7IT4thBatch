package DiagonalArrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_hasnext {

	public static void main(String[] args)
	{
		ArrayList list1=new ArrayList();
		list1.add("pranitha");
		list1.add(123);
		list1.add(40.35);
		list1.add(true);
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		
			
		}

	}

}
