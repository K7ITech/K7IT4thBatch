package java8Features;

import org.apache.log4j.Logger;

public class Calculator1 {
	private static Logger log = Logger.getLogger(Calculator1.class);
	public static void main(String[] args) {
		
		Calculator1 c1 = new Accounts();
		
		 log.info("sum of 10, 20 is:"+ c1.add(10, 20));
		 log.info("sum of 143, 143 is:"+ c1.add(143, 143));
		 log.info("sum of 1111, 2222 is:"+ c1.add(1111, 2222));
		 log.info("sum of 1222, 9000 is:"+ c1.add(1222, 9000));
		 log.info("sum of 100000, 200000 is:"+ c1.add(100000, 200000));
		 log.info("sum of 1000000, 1000000 is:"+ c1.add(1000000, 1000000));
		 
	}
	private int add(int i, int j) {
		return 0;
	}
	
	}
/*		
		 Calculator1 c1 = new Accounts();	
		 log.info("sum of 10, 20 is:"+ c1.add(10, 20));
		 log.info("sum of 10000, 20000 is:"+ c1.add(10000, 20000));
		 log.info("sum of 100, 2000 is:"+ c1.add(100, 2000));
		 log.info("sum of 10000, 20000 is:"+ c1.add(10000, 20000));
		 log.info("sum of 100000, 2000000 is:"+ c1.add(100000, 2000000));
		 log.info("sum of 10000000, 20000000 is:"+ c1.add(10000000, 20000000));
		 log.info("sum of 30000, 200000 is:"+ c1.add(30000, 200000));
		 log.info("sum of 400000, 600000 is:"+ c1.add(400000, 600000));

	}
	public int add(int i, int j) {
		
		return 0;
	}
}
*/
/*
 * OUTPUT:
 * =======
 * 2023-02-28 17:13:17 INFO  Calculator1:10 - sum of 10, 20 is:30
2023-02-28 17:13:17 INFO  Calculator1:11 - sum of 10000, 20000 is:30000
2023-02-28 17:13:17 INFO  Calculator1:12 - sum of 100, 2000 is:2100
2023-02-28 17:13:17 INFO  Calculator1:13 - sum of 10000, 20000 is:30000
2023-02-28 17:13:17 INFO  Calculator1:14 - sum of 100000, 2000000 is:2100000
2023-02-28 17:13:17 INFO  Calculator1:15 - sum of 10000000, 20000000 is:30000000
2023-02-28 17:13:17 INFO  Calculator1:16 - sum of 30000, 200000 is:230000
2023-02-28 17:13:17 INFO  Calculator1:17 - sum of 400000, 600000 is:1000000
 */
