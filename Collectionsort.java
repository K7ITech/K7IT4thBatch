import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

public class Collectionsort {
private static Logger log=Logger.getLogger(Collectionsort.class);
	public static void main(String[] args) {
ArrayList list=new ArrayList();
list.add("k7it");
list.add("aruna");
list.add("praneetha");
list.add("dhanya");
list.add("#123");
list.add("123");
log.debug("before sort:"+list);
Collections.sort(list);
log.error("after sort:"+list);
log.error(list);
log.info(list);
log.fatal(list);

		

	}

}
