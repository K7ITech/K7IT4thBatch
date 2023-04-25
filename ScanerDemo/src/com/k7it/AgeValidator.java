package com.k7it;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class AgeValidator {

	public static void main(String[] args) {

		//throw new RuntimeException();
		 
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("please enter your age");
			try {
				
			int age = sc.nextInt();

			
			if(age < 0 || age > 100) {
				throw new IllegalArgumentException("Age should be between 0 to 100");
				//System.out.println("asas");  un reachable code
			}
			System.out.println("your age is :" + age);
			System.out.println("do you want try one more time enter true/false");
			isContinue = sc.nextBoolean();
			}catch(Exception e) {
				System.out.println("please enter the valid age");
				isContinue = false;
				throw new IllegalArgumentException();
			}
		}
	}

}
