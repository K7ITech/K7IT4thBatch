import java.util.Scanner;
import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class GivemNumberIsEverOrNot {
	private static Logger log = Logger.getLogger(GivemNumberIsEverOrNot.class);
	public boolean isEvenNumber(int n) {
		if(n%2==0) {
			return true;
				
		}
		else {
			return false;
			
		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info(" Enter n value");
		int n=s.nextInt();
		Predicate<Integer>p=(n1)->n%2==0;
		log.info(n+" is a even number:"+p.test(n));
		
	}

}
