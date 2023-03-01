package Java8FeaturesDemo;

import java.util.function.Predicate;

public class LambdaExpression {
	public static void main(String[] args) {
		Predicate <Integer> predicate=(n)->n%2==0;
		System.out.println("4 is even number:"+predicate.test(4));
		System.out.println("5 is even number:"+predicate.test(5));
		
	}

}