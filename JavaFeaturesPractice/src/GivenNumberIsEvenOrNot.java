
import java.util.Scanner;
import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class GivenNumberIsEvenOrNot {
	private static final  Logger log=Logger.getLogger(GivenNumberIsEvenOrNot.class);
	
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
		System.out.println(" Enter n value");
		int n=s.nextInt();
		Predicate<Integer>p=(n1)->n%2==0;
		System.out.println(n+" is a even number:"+p.test(n);
		
	}

}
