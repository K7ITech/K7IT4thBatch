package com.k7it;

import java.util.ArrayList;

public class AddElementsToArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		//Add elements to the ArrayList using for loop
		for (int i=0; i<10; i++) {
		   list.add(i, null);
		}

		//Print the elements of the ArrayList
		for (String element : list) {
		   System.out.println(element);
		}
	}
}

		 /*/ Create an arraylist 
        ArrayList arrlist = new ArrayList(); 
  
        // Adding elements to arraylist 
        for (int i=1; i<=5; i++) 
            arrlist.add(i); 
  
        // Displaying ArrayList elements 
        System.out.println("ArrayList elements:"); 

        for (int i=0; i<arrlist.size(); i++) 
            System.out.println(arrlist.get(i)); 
	}

}*/
