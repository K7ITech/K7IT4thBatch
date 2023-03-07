import java.util.Scanner;
import java.util.function.Function;

import org.apache.log4j.Logger;

public class SumOfNumber 
{
	private static Logger log = Logger.getLogger(SumOfNumber .class);
	public static void main(String[] args) {
		//int sum=0;
		Scanner s = new Scanner(System.in);
		log.info(" Enter n value");
		
		int n=s.nextInt();
		Function<Integer,Integer> f = (j)-> {
			int sum=0;
			for(int i=0;i<=j;i++)
					sum=sum+i;
			return sum;
			
		};
		
		log.info(f.apply(n));
	}
	


}
