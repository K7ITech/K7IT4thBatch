
import java.util.Scanner;
import java.util.function.Predicate;

public class GivenNumberIsEvenOrNot {
	
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
		System.out.println(n+" is a even number:"+p.test(n));
		
	}

}
