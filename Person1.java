package com.k7it.InnerClassDemo;

public class Person1 {
		
		void m1() {
			System.out.println("hi ra ");	
		    }
		}
class  Person{
	//class Anonymous extends Person1{
		
	public static void main(String[] args) {
		
		Person1 p1 = new Person1();
		p1.m1();
		
		
			 Person1 p2 = new Person1() {
			    void m1(){
			    	System.out.println("vinnu");
			    	
			   
			    	}
			    
			    
			 };	 
			 p2.m1();
			 p2.m1();
			 p2.m1();
			 p2.m1();
			 p2.m1();
			 p2.m1();
			
			 new Person1() {
				 void m1() {
					 System.out.println("Anonymous inner desing1-m1");
				 }
			 }.m1();
			 new Person1() {
				 void m1() {
					 System.out.println("Anonymous inner desing2-m1");
				 }
			 }.m1();
			 new Person1() {
				 void m1() {
					 System.out.println("Anonymous inner desing3-m1");
				 }
			 }.m1();
			 new Person1() {
				 int i = 10;
				 void m1() {
					 System.out.println("Anonymous inner desing4-m1");
					 System.out.println(i);
				    }
				 }.m1();
			 new Person1() {
				  int j = 20;
				  void m1() {
				 System.out.println(j);
				  }
			 }.m1();
			 new Person1() {
				 
			 }.m1();
	}
}
			 
				   
			 
				 

	

