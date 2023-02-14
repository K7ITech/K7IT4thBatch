package com.k7it;

public class ArrayReversely {

	public static void main(String[] args) {
		String s="raja";
		String s1=" ";
		String s2="raja";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			System.out.print(s1);// reverse print step by step

		}
		System.out.print("\n"+s1);
if(s.equals(s1))// compare s=s1(Palindrome)
System.out.println("\n"+"True");
else System.out.println("\n"+"False");

if(s.equals(s2))
	System.out.println("\n"+"True");
	else System.out.println("\n"+"False");
	}
	
}
