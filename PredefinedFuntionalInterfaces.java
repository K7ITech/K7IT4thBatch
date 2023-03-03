package com.k7it;

import java.util.function.Function;

public class PredefinedFuntionalInterfaces {

	public static void main(String[] args) {
		Function<Integer,Integer> f = (n)->n*n;
	      System.out.println("Square of 4:"+f.apply(4));
	      System.out.println("Square of 5:"+f.apply(5));
	     

	      Student students[]  = {
	    		  new Student(01,"Latha",75),
	    		  new Student(02,"Aruna",80),
	    		  new Student(03,"Deepya",99),
	    		  new Student(04,"Selvi",100),
	    		  new Student(05,"Praneetha",69),
	    		  new Student(06,"anu",50),
	    		  new Student(07,"sunny",35),
	    		  new Student(8,"bunny",25),
	      };
	      
	     Function <Student,String> f1 = s->{

	        	 if( s.marks >= 85 ) {//>= greater than or equal 
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:A"; 
	        	 }else if( s.marks >= 75 ) {//>= greater than or equal 
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:B"; 
	        	 }else if( s.marks >= 65 ) {//>= greater than or equal 
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:C"; 
	        	 }else if( s.marks >= 55 ) {//>= greater than or equal 
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:D"; 
	        	 }else if( s.marks >= 35 ) {//>= greater than or equal 
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:E"; 
	        	 }else {
	        		 return "Id:"+s.id+",Name:"+s.name+",marks:"+s.marks+",Grade:F"; 
	        	 }
	        };
	        for(Student s : students) {// this is called enhanced for loop 
               	System.out.println(f1.apply(s));
               	
	       }
      }
}
	
/*Output:
 Square of 4:16
 Square of 5:25
Id:1,Name:Latha,marks:75,Grade:B
Id:2,Name:Aruna,marks:80,Grade:B
Id:3,Name:Deepya,marks:99,Grade:A
Id:4,Name:Selvi,marks:100,Grade:A
Id:5,Name:Praneetha,marks:69,Grade:C
Id:6,Name:anu,marks:50,Grade:E
Id:7,Name:sunny,marks:35,Grade:E
Id:8,Name:bunny,marks:25,Grade:F
 */
