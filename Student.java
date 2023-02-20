package com;

public class Student {
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Student(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city; 
		 }
		 
		 
		 @Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
		}  


	public static void main(String[] args) {
		 Student s1=new Student(101,"Anu","Gulbarga");  
		   Student s2=new Student(102,"Anand","kalburgi");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString() 

	}

}
