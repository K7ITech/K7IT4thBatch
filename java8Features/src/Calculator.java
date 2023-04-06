import java.util.function.Function;

import org.apache.log4j.Logger;



public class Calculator {
	
	private static Logger log = Logger.getLogger(Calculator.class);

	public static void main(String[] args) {
		Function<Integer,Integer> squared =  (n)-> n*n;
        
         log.info("Square of 4:"+squared.apply(4));
		 log.info("Square of 5:"+squared.apply(5));
		 log.info("Square of 6:"+squared.apply(6));
		 log.info("Square of 7:"+squared.apply(7));
		 log.info("Square of 8:"+squared.apply(8));
		 log.info("Square of 9:"+squared.apply(9));
		 log.info("Square of 10:"+squared.apply(10));
		 log.info("Square of 11:"+squared.apply(11));
		 
		
		
	}
}

/*
 * OUTPUT:
 * =======
 * 2023-02-28 16:20:41 INFO  Calculator:14 - Square of 4:16
2023-02-28 16:20:41 INFO  Calculator:15 - Square of 5:25
2023-02-28 16:20:41 INFO  Calculator:16 - Square of 6:36
2023-02-28 16:20:41 INFO  Calculator:17 - Square of 7:49
2023-02-28 16:20:41 INFO  Calculator:18 - Square of 8:64
2023-02-28 16:20:41 INFO  Calculator:19 - Square of 9:81
2023-02-28 16:20:41 INFO  Calculator:20 - Square of 10:100
2023-02-28 16:20:41 INFO  Calculator:21 - Square of 11:121

 * 
 */
