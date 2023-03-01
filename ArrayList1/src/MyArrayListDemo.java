import org.apache.log4j.Logger;

public class MyArrayListDemo
{
	private static Logger log = Logger.getLogger(MyArrayListDemo.class);
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(40);
		log.info("Add method with element :"+list);
		
		list.add(1,30);
		list.add(3,90);
	log.debug("After add method using  index s, value at 1 & 3  :"+list);
	 
	list.set(2, 60);
	
	log.error("After set method at index 2 list is :"+list);
	
	log.fatal(" using get method of index 1 :"+list.get(1));
	

	log.info("revome method of index 2 :"+(list.remove(2)));

	
	log.info("List is :"+list);
	}


	}



	