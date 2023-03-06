import java.util.Scanner;

import org.apache.log4j.Logger;

public class palindrome 
{
	private static Logger log = Logger.getLogger(palindrome .class);
	public static void main(String[] args) {
		
		/*
		char ch[];
		int i,j;
		int length=0;
	     boolean flag=true;
	     Scanner s = new Scanner(System.in);
		 String inputString=s.next();
			i=0;
			while(inputString[i]!='\0') { 
				
				length++;
				i++;
				}
			for(i=0,j=(length-1);i<length/2;i++,j--)
			{
				if(ch[j]!=ch[i])
				{
					flag=false;
					break;
				}
			}
			if(flag=true)
			{
				System.out.println("the given string is palindrome");
			}
			else
			{
				System.out.println("the given string is not palindrome");
			}
		*/
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
			 log.info("Given String is palindrome");
		 }
		 else
		 {
			 log.info("Given String is not palindrome");
		 }
	}	

	

}
