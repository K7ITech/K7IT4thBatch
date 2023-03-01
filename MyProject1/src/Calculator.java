import java.util.function.Function;
import java.util.function.Predicate;

public class Calculator {
	public static void main(String[] args) {

		Function<Integer, Integer> Squared = (n) -> n * n;

		System.out.println("Square of 4:" + Squared.apply(4));
		System.out.println("Square of 5:" + Squared.apply(5));

		Predicate<Integer> predicate = (n) -> n % 2 == 0;

		System.out.println("4 is even number:" + predicate.test(4));
		System.out.println("5 is even number:" + predicate.test(5));

	}
}
