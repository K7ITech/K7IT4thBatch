package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddAll {

	public static void main(String[] args) {

		
		ArrayList list = new ArrayList();
		Person p1 = new Person(27,"K7iT",5.5,60.25);
		Person p2 = new Person(25,"dhanya",5.3,50.25);
		Person p3 = new Person(22,"aruna",5.6,55.0);
		Person p4 = new Person(25,"giri",5.7,75.0);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p4);
		list.add(new Person(21,"babu",5.6,65.50));
		
		
		Person p1=new Person(26,"Anu",)
		list.add("anu");
	    list.add("Anand");
	    list.add("sangeeta");
	    list.add("123");
	    list.add("#123");
	    list.add("Anu");
	    
	    
	    System.out.println("before sort:"+list);
	    Collections.sort(list);
	   
	    System.out.println("after sorting the list:"+list);
	  
	    
	    
	    
	   
	    
		

	}

}
