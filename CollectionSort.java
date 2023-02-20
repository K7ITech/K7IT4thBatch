import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

public class CollectionSort {
	private static Logger log=Logger.getLogger(CollectionSort.class);
	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add("K7iT");
		list.add("Latha");
		list.add("aruna");
		list.add("praneetha");
		list.add("123");
		list.add("#143");
		log.debug("Before sort:"+list);
		Collections.sort(list);
		log.info("After Sort:"+list);
		
		
	}

}
