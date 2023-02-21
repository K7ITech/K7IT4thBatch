import org.apache.log4j.Logger;

public class StringEqualsmethod {

	private static  Logger log = Logger.getLogger(StringEqualsmethod.class);

	public static void main(String[] args) {

		String s1 = "k7it";
		String s2 = "java";
		String s3 = new String("k7it");
		String s4 = s3;
		String s5 = "k7it";
		String s6 = new String("k7it");

		log.fatal(s1 == s2);
		log.fatal(s1 == s3);
		log.fatal(s1 == s5);
		log.fatal(s2 == s5);
		log.fatal(s3 == s5);
		log.fatal(s3 == s4);
		log.fatal(s3 == s6);
	
	}

}
/*

   OUTPUT:
   ======
   2023-02-21 17:07:01 FATAL StringEqualsmethod:16 - false
  2023-02-21 17:07:01 FATAL StringEqualsmethod:17 - false
  2023-02-21 17:07:01 FATAL StringEqualsmethod:18 - true
  2023-02-21 17:07:01 FATAL StringEqualsmethod:19 - false
  2023-02-21 17:07:01 FATAL StringEqualsmethod:20 - false
  2023-02-21 17:07:01 FATAL StringEqualsmethod:21 - true
  2023-02-21 17:07:01 FATAL StringEqualsmethod:22 - false
	
*/




