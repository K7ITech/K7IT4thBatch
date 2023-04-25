package com.k7it.deepCopy;


public class Person implements Cloneable{
    int age;
    String name;
    double ht;
    double wt;
    public Person(int age,String name, double ht, double wt){
    	this.age = age;
    	this.name = name;
    	this.ht = ht;
    	this.wt = wt;
	}
    public String toString() {
		return "Name:" + name + ",Age:" + age + ",Ht:" + ht + ",Wt:" + wt/* +",Address:"+add.toString() */;
    }
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		
		Person p1 = new Person(37,"K7iT",5.6,60.25);
		//Person p1Dup =  p1.clone();//CTE  Type mismatch: cannot convert from Object to Person, bzc clone method 
									// return type is Object class type , so we can assing super type to Sub type
									// if we want to assign we should do the down casting into person type.
				
		Person p1Dup =  (Person)p1.clone(); // Unhandled exception type CloneNotSupportedException
		System.out.println("Before modification");
		System.out.println(p1);
		System.out.println(p1Dup);
		
		p1.age =  27;
		p1.ht = 5.7;
		System.out.println("after modification");
		System.out.println(p1);
		System.out.println(p1Dup);
		
		/* this meaning is JAVA will not support clone operation because it is unsecure operation.
		 if we want to perform this unsecured operation the 
		   1. we should take take the One marker interface  Recommendation  Cloneable interface 
		      i.e our class should implements the Cloneable interface. 
		
		      Cloneable is a marker interface, every marker interface is empty interface , 
		      it wont have any methods or attributes etc. 
		      But we can't say every empty interface is marker interface .	
		      	   
		      Marker interface will not give any features to our class , but he will send one special note to 
		      JRE please allow cloneable operation for this class, he is belongs to my category.
		    
		    2. We should add throws CloneNotSupportedException to method after signature which method we are using 
		      the clone().
		    
		    output with only primitive variables  :
		    Before modification
			Name:K7iT,Age:37,Ht:5.6,Wt:60.25
			Name:K7iT,Age:37,Ht:5.6,Wt:60.25
			after modification
			Name:K7iT,Age:27,Ht:5.7,Wt:60.25
			Name:K7iT,Age:37,Ht:5.6,Wt:60.25
			
			
			here out put is produced as deep copy, even though we have updated in original obj its not effected o
			on duplicate object.

		 */
	}

}
