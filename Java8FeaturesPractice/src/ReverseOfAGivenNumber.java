import java.util.Scanner;

import org.apache.log4j.Logger;

public class ReverseOfAGivenNumber {
	private static Logger log=Logger.getLogger(ReverseOfAGivenNumber.class);
	public static void main(String[] args) {
		int r_num=0;
		Scanner s = new Scanner(System.in);
		log.info(" Enter n value");
		int num=s.nextInt();
		while(num>0)
		{
			r_num=(r_num*10)+(num%10);
			num=num/10;
		}
		log.info(r_num);
	}

}
