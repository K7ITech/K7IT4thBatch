package com.k7it.InnerClassDemo;

public class Outer {
	  class Inner{
		     void innerMethod(){
		       System.out.println("Hii vinnu i love "); 
		      }
		}
		  void outerMethod(){
		      System.out.println("miss you lucky");
		    }

		  public static void main (String[]args){
		    // Outer o = new Outer();
		     //o.outerMethod();
		    Outer.Inner i = new Outer().new Inner();
		     i.innerMethod();

		   
		     }
		  
		}

		



