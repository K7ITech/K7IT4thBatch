import java.util.ArrayList;

import org.apache.log4j.Logger;

public class MyArrayList {

	private static Logger log = Logger.getLogger(MyArrayList.class);

	public static void main(String[] args) {

		MyArrayList1 list = new MyArrayList1();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(30);
		list.add(40);
		log.info(list);
		list.set(3,60);
		log.info(list);
		log.info(list.remove(2));
		log.info(list);
		log.info(list.get(0));
		
		

	}
}