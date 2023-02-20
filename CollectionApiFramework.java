package CollectioDemo;

import java.util.ArrayList;

public class CollectionApiFramework 
{

	public static void main(String[] args) 
	{
		Object a[]=new Object[10];
		Object obj1=new Object();
		String s1=new String("K7it");
		Integer i1=new Integer(20);
		a[0]=obj1;
		a[1]=s1;
		a[2]=i1;
		a[3]=1234;
		
	
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(10.21);
		list.add("Praneetha");
		list.add(false);
		list.add("giri");
		list.add('a');
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.get(5));
		System.out.println(list.get(2));
		/*
		 System.out.println(list.get(7));
		 System.out.println(list.get(6));
		*/
	}

}
