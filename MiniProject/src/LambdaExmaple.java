import org.apache.log4j.Logger;

@FunctionalInterface
interface EvenOdd {
	void check(int i);
}

public class LambdaExmaple {
	private static Logger log = Logger.getLogger(LambdaExmaple.class);

	public static void main(String[] args) {

		// EvenOdd EvenOdd = new EvenOdd() {
		EvenOdd EvenOdd = i -> {
			// @Override
			// public void check( int a) {
			if (i % 2 == 0) {
				log.info("number" + i + " is even.");

			} else {
				log.info("number" + i + " is odd.");
			}
			log.info("===================");
			// }
		};
		EvenOdd.check(1022);
		EvenOdd.check(555);
		EvenOdd.check(22);
		EvenOdd.check(25);
	}
}
/*
 * OUTPUT:
 =========
2023-03-04 13:47:45 INFO  LambdaExmaple:17 - number1022 is even.
2023-03-04 13:47:45 INFO  LambdaExmaple:20 - number555 is odd.
2023-03-04 13:47:45 INFO  LambdaExmaple:17 - number22 is even.
2023-03-04 13:47:45 INFO  LambdaExmaple:20 - number25 is odd.
 * 
 */
