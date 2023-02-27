package com.k7it;

public class Person {
	
	
	private int age;
	private String name;
	private double height;
	private double weight;
	
	Person(int age,String name,double height, double weight)
	{
		this.age = age; this.name = name; this.height = height; this.weight = weight;
	}
	@Override
	public String toString()
	{
		return "Age:"+age+",Name:"+name+",Weight:"+weight+",Height:"+height;
	}
	
	

	public static void main(String[] args) {
		
		Person p1 = new Person(20, "Likith", 6.0, 50.0);
		Person p2 = new Person(1, "k7it", 7.0, 55.0);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("=====================================");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		

	}

}
