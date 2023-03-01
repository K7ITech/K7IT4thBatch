package Java8FeaturesDemo;

import java.util.function.Function;
 
public class Calculator

{ 
	public static void main(String[] args) {
		Function <Integer,Integer>squared=(Integer  n)->{return n*n;};
		Function <Integer,Integer>Squared=(n)->{return n*n;};
		Function <Integer,Integer>Squared1=(n)->{return n*n;};
		
		System.out.println("square of 4:"+Squared.apply(4));
		System.out.println("square of 5:"+Squared.apply(5));

		
		
			
			
		
	}

	}
	

