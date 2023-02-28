package com.k7it;

import java.util.function.Function;

public class FunctionInterfacesQ

{
	public static boolean isEvenNumber(int n) {
		return n%2==0;
	}
	
	public static void main(String[] args) {
		
		Function<Integer,Integer>squared=(n) -> n*n;
		
		System.out.println("square of 4:"+squared.apply(4));
		System.out.println("square of 5:"+squared.apply(5));
		
		java.util.function.Predicate<Integer>Predicate=(n) -> n%2==0;
		
		System.out.println("4 is even number:"+Predicate.test(4));
		System.out.println("5 is even number:"+Predicate.test(5));
		

	}

}
