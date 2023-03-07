import java.util.Scanner;

import org.apache.log4j.Logger;

public class StringIsPalindromeOrNot {
	private static Logger log=Logger.getLogger(StringIsPalindromeOrNot.class);
	public static void main(String[] args) {
		
		
		/*
		Scanner s = new Scanner(System.in);
		log.info("Enter the string");
		 String inputString=s.next();
		 String reverseString="";
		 int n=inputString.length();
		 for(int i=0;i<n;i++)
		 {
			 char c=inputString.charAt(i);
			 reverseString=c+reverseString;
		 }
		 log.info(reverseString);
		 if(inputString.equals(reverseString))
		 {
			 log.info("Given string is Palindrome");
		 }
		 else
		 {
			 log.info("Given string is not Palindrome");
		 }
	*/	
		int r_num=0;
		Scanner s = new Scanner(System.in);
		log.info(" Enter num value");
		int num=s.nextInt();
		int org_num=num;
		while(num>0)
		{
			r_num=(r_num*10)+(num%10);
			num=num/10;
		}
		log.info(r_num);
		
		if(r_num==org_num)
		{
			log.info("Given number is a palindrome");
		}
		else
		{
			log.info("Given number is not  a palindrome");
		}
		
		
		
	}

}
