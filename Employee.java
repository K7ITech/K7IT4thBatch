package com.k7it.generics;

public class Employee {
  int id;
  String name;
  String dept;
  public Employee(int id, String name, String dept) {
	  this.id =  id;
	  this.name = name;
	  this.dept =  dept;
}
  @Override
	public String toString() {
		return "id:"+id+",name:"+name+",dept:"+dept;
	}
}
