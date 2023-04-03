package com.k7it.junit.testRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.k7it.junit.test.CalculatorTest;
import com.k7it.junit.test.DemoTest;

public class TestRunnerDemo {

	static int add(int... n ){
		   
	     int sum =0;
	     for(int i =0;i < n.length;i++){
	      sum+=n[i];
	     }
	     return sum;
	   }
	   
	   
	public static void main(String[] args) {
		
		 System.out.println(add(10,20,30,40,50,60,70,80,90,100,110));
		System.out.println("Starting junit test");
		Result result = JUnitCore.runClasses(CalculatorTest.class,DemoTest.class);
		
		System.out.println("ending  junit test with following count:"+ result.getRunCount()
		+", with follwing success stastus:"+result.wasSuccessful());
		
		// how to find the failure test cases:
		
		System.out.println("failure Tests count:"+result.getFailureCount());
		System.out.println("failure Tests:"+result.getFailures());
	}
	
	/*
	  VarArgs:  variable arguments : its is one of key feature in jdk 1.5 version. it will 
	  support multi arguments for methods or constructor signatures with single data type.
	  
	  for example:
	  
	  if we wan to add 5 int values using add method;
	  
	  normal:
	    int add(int n1 = 10, int n2=20, int n3=30, int n4=40, int n5=50){
	      
	      return n1+n2+n3+n4+n5;
	    
	   }
	   
	   add(10,20,30,40,50);
	   
	   
	   var args: var args are act like a arrays. 
	   
	   int add(int... n = {10,20,30,40,50}){
	   
	     int sum =0;
	     for(int i =0;in.length;i++){
	      sum+=n[i];
	     }
	     return sum;
	   }
	   
	    add(10,20,30,40,50);
	   
	    Note: var args should be only one parameter in any method signature. 
	          var args should be a last parameter in the method signature. 
	          var args act like a annonymous array, while reading values we should use 
	          the array technique only i.e using index and array symbol refVar[index].
	          
	          
	          
	    
	  
	 */
}
