import java.util.Scanner;

import org.apache.log4j.Logger;

public class Swap {
	private static  Logger log=Logger.getLogger(Swap.class);
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		log.info(" Enter  A and B values");
		
	
		int a=s.nextInt();
		int b=s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		log.info("a:"+a+" b:"+b);
		
	}

}
