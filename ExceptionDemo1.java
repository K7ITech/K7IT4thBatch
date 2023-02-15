package com.k7it.exceptions;

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		// cmd line args are it will consider as a string 
		// java ExceptionDemo1 9 
		System.out.println("cmd line args count:"+args.length);
		String str1 = args[0]; //"9"
		int i = Integer.parseInt(str1);
		int result  =  i/(i-9);
		System.out.println("result:"+result);	
		
		/*
		  case 1: we will execute this prog without cmd line args
		  we will java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0	
		  at line 	   String str1 = args[0];
		  
		  case2:  we will run the program with with one string cmd arg like "abc"
		   we will get   java.lang.NumberFormatException: For input string: "abc" at 
		   line  int i = Integer.parseInt(str1);
		   
		   Case3: we will run the program with one integer cmd line arg like "9"
		   
		   9/9 = 1
		   9/1 = 9 
		   9/2 = 4
		   9/0 = infinity
		   
		    i/i-9 = -8 9/9 =1, 1-9 = -8
		    i/(i-9) = 9-9 = 0 , 9/0 =  AE 
		   
		   we will get java.lang.ArithmeticException: / by zero, 
		  at line   int result  =  i/(i-9);
		   in java  if we do somehting divide by zero it will cause to AE.
		   
		   case4: we will run the program with integer input other than
		   9 : 20
		   
		   here we will het the output is 
		   cmd line args count:1
		    result:1
		    
		    20/(20-9) =  20/11 =  1
		    
		    here incase of case 1, 2,3 are called as abnormal execution 
		    in case of abnormal execution ctrl will  not reach last line
		    of our program. where we will receive the abnormal condition 
		    there it self it will stop the execution .
		    
		    but in case 4 : our program end wiht normal execution, so its reaching the
		    last line our program. 
		    
		    in above program if we want to make normal execution
		    we should satisfy min 3 condtions like 
		    1. we should pass at lease one cmd line arg 
		    2. that cmd arg should number 
		    3. that number shld not equals to 9
		    
		    
		    
		    
		    
		    

		 */
		
	}

}
