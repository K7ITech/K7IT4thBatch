package com.k7it;

public class ArrayPalindrome {

	public static void main(String[] args) {
      String s="Good Morning";
      String rstr=" ";
      int n=s.length();
     for(int i=0;i<n;i++)
         // for(int i=0;i<n-8;i++)
         //for(int i=5;i<n;i++)

       {
 		char c=s.charAt(i);
     	  rstr=c+rstr;
           System.out.println("Reverse String:"+rstr);
       }
      System.out.println("\n"+"Original String:"+s);
      System.out.println("Reverse String:"+rstr);
	}

}
