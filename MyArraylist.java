

import java.util.ArrayList;

import org.apache.log4j.Logger;



public class MyArraylist{
	//private static Logger log =Logger.getLogger(MyArraylist1.class);

	public static void main(String[] args) {
		MyArrayList1 list= new MyArrayList1();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(30);
		list.add(40);
			
		System.out.println(list);
		list.set(2, 6999);
		System.out.println(list);
	    System.out.println(list.remove(3));
	    System.out.println(list);
	    System.out.println(list.get(1));
       }
	}


