import java.util.ArrayList;

import org.apache.log4j.Logger;

public class Collectionsort
{
	private static Logger log = Logger.getLogger(Collectionsort.class);

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("k7it");
		list.add("latha");
		list.add("Pranitha");
		list.add("aruna");
		list.add("Lucky");
		list.add("dhanya");
		log.debug("befor sort:"+list);
		log.error("after sort:"+list);
		log.error(list);
		log.info(list);
		

	}

}
