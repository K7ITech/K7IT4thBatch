package Arraylist1;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class MyArraylist1 <T>{
	//private static Logger log =Logger.getLogger(MyArraylist1.class);

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
//		((List) log).set(2,60);
		System.out.println(l1);
		l1.add(2,80);
		System.out.println(l1);
//	    log.info(list.remove(2));
//	    log.info(list);
	}

}
