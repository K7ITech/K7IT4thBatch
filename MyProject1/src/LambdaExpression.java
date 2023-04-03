import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class LambdaExpression {
	private static Logger log = Logger.getLogger(LambdaExpression.class);

	public static void main(String[] args) {
		Predicate<Integer> predicate = (n) -> n % 2 == 0;

		log.info("4 is even number:" + predicate.test(4));
		log.info("9 is even number:" + predicate.test(9));
		log.info("7 is even number:"+predicate.test(10));
	    log.info("5 is even number:"+predicate.test(112));
	    log.info("2 is even number :"+ predicate.test(4));


	}
}