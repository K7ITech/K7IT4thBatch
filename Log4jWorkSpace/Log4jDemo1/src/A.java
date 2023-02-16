import org.apache.log4j.Logger;

public class A {
private static Logger log = Logger.getLogger(A.class);
	public static void main(String[] args) {
    log.debug("Hello");
    log.info("World");
    log.error(args);
    log.fatal(args);
	}

}
