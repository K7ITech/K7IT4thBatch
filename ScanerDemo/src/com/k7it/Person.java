package com.k7it;

public class Person {
	int age;
	String name;
	double ht;
	double wt;
    double legs;
	public Person(int age, String name, double ht, double wt) {
		this.age = age;
		this.name = name;
		this.ht = ht;
		this.wt = wt;
	}

	public double getLegs() {
		return legs;
	}

	public void setLegs(double legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHt() {
		return ht;
	}

	public void setHt(double ht) {
		this.ht = ht;
	}

	public double getWt() {
		return wt;
	}

	public void setWt(double wt) {
		this.wt = wt;
	}

	public String toString() {
		return "Name:" + name + ",age:" + age + ",ht:" + ht + ",wt:" + wt;
	}
}
