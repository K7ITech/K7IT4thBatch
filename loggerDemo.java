import java.util.ArrayList;

import org.apache.log4j.Logger;

public class loggerDemo {
private static Logger log=Logger.getLogger(loggerDemo.class);
	public static void main(String[] args) {
ArrayList list=new ArrayList();
list.add(10);
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
log.debug(list);
log.fatal(list);
log.error(list);
log.info(list);
	}

}
