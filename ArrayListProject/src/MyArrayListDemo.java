public class MyArrayListDemo {
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println("Add method with element :"+list);
		
		list.add(1,30);
		list.add(3,90);
	System.out.println("After add method using  index s, value at 1 & 3  :"+list);
	 
	list.set(2, 60);
	
	System.out.println("After set method at index 2 list is :"+list);
	
	System.out.println(" using get method of index 1 :"+list.get(1));
	

	System.out.println("revome method of index 2 :"+(list.remove(2)));

	
	System.out.println("List is :"+list);
	}

}
