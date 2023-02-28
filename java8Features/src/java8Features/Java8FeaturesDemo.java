package java8Features;

import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class Java8FeaturesDemo {
	private static Logger log = Logger.getLogger(Java8FeaturesDemo.class);

	public static void main(String[] args) {
		Predicate<Integer> predicate = (n) -> n % 2 == 0;

		log.info("4 is even number:" + predicate.test(4));
		log.info("5 is even number:" + predicate.test(5));
		log.info("4 is even number:" + predicate.test(6));
		log.info("5 is even number:" + predicate.test(7));
		log.info("4 is even number:" + predicate.test(8));
		log.info("5 is even number:" + predicate.test(9));
		log.info("4 is even number:"+predicate.test(10));
	    log.info("5 is even number:"+predicate.test(112));


	}
}
/*
 * OUTPUT:
 * ======
 * 2023-02-28 16:32:06 INFO  Java8FeaturesDemo:13 - 4 is even number:true
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:14 - 5 is even number:false
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:15 - 4 is even number:true
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:16 - 5 is even number:false
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:17 - 4 is even number:true
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:18 - 5 is even number:false
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:19 - 4 is even number:true
2023-02-28 16:32:06 INFO  Java8FeaturesDemo:20 - 5 is even number:true
 */
