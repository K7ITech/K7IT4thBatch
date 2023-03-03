package com.k7it;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (n)->n%2==0;
	     
	    System.out.println("4 is even number:"+predicate.test(4));
	    System.out.println("5 is even number:"+predicate.test(5));
	    
	     
		Student students[]  = {
	    		  new Student(01,"Latha",75),
	    		  new Student(02,"Aruna",80),
	    		  new Student(03,"Deepya",99),
	    		  new Student(04,"Selvi",100),
	    		  new Student(05,"Praneetha",69),
	    		  new Student(06,"anu",50),
	    		  new Student(07,"sunny",35),
	    		  new Student(8,"bunny",25),
	    		  new Student(9,"unny",15)    		  
	    		  };
		
        Predicate<Student> p = s -> s.marks>=65;
        
	     Function <Student,String> f1 = s->{

        if(p.test(s)) {
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
   	 }
   	 return " ";
	};
	     for(Student s : students) {// this is called enhanced for loop 
       	  System.out.println(f1.apply(s));
	     }
	}

}

/*4 is even number:true
5 is even number:false
Id:1,Name:Latha,marks:75,Grade:B
Id:2,Name:Aruna,marks:80,Grade:B
Id:3,Name:Deepya,marks:99,Grade:A
Id:4,Name:Selvi,marks:100,Grade:A
Id:5,Name:Praneetha,marks:69,Grade:C 
 */



