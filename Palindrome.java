import java.util.Scanner;

import org.apache.log4j.Logger;

public class Palindrome {
	private static final Logger log=Logger.getLogger(Palindrome.class);
	
public static void main(String[] args) {
	
	int r_num=0;
		Scanner s = new Scanner(System.in);
	log.info("Enter the value");
	int num=s.nextInt();
	 int org_num=num;
	 while(num>0)
	 {
		 r_num=(r_num*10)+(num%10);
		 num=num/10;
	 }
	 
	 if(org_num==r_num)
	 {
		 log.info("Given number is Palindrome");
	 }
	 else
	 {
		 log.info("Given number is not Palindrome");
	 }
}	

}
