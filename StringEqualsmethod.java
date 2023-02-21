import org.apache.log4j.Logger;

public class StringEqualsmethod {

	private static final Logger log = Logger.getLogger(StringEqualsmethod.class);

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






