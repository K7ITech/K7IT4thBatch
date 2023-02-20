import java.util.Date;

import org.apache.log4j.Logger;

public class loggerDemo {
	private static Logger log=Logger.getLogger(loggerDemo.class);
	public static void main(String[] args) {
		Date date=new Date();
		log.debug(date.getDate());
		log.info(date.getHours());
		log.error(date.getMinutes());
		log.fatal(date.getSeconds());

	}

}
