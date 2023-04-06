package com.k7it;

import java.util.ArrayList;
import java.util.Comparator;

public class Company implements Comparable
{
	   int id;
	   String name;
	   double sal;

	   
	   Company(int id,String name,double sal){
		    this.id = id;
		    this.name = name;
		    this.sal = sal;
	   }
		    @Override
			   public String toString() {
				return "{id:"+this.id+",name:"+this.name+
						   ",sal:"+this.sal+"}";
				
		    }
				public int compareTo(Object obj) {
					
					Company c = (Company)obj;
					
					 if(this.id > c.id) {
							return 1;
						}else if(this.id < c.id) {
							return -1;
						}
						return 0;
				  
		    }
				
					
				}  



