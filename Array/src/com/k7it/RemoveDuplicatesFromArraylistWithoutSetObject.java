package com.k7it;

import java.util.ArrayList;

public class RemoveDuplicatesFromArraylistWithoutSetObject {

	public static void main(String[] args) {
           
		ArrayList list = new ArrayList();
		
		list.add("Giri");
		list.add("Babu");
		list.add("Pranitha");
		list.add("Giri");
		list.add("Babu");
		list.add("Aruna");
		list.add("Giri");
		
		System.out.println(list);
		
		/*/list.removeAll(e -> e.equals("Giri") ? "Aruna" :"Latha");
		list.remove("Giri");
		list.re
		 
		if(list.equals("Giri")){

		}*/
		
		  for (String dupWord : list) {
		        if (list.equals(dupWord))
		            System.out.println(list.get(dupWord));
		
		System.out.println(list);
		 }
	}


