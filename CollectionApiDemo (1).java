bpackage com.k7it;

import java.util.ArrayList;

public class CollectionApiDemo {
	/*
	  collections framework : 
	  
	    collections: start with small 'c': this word is used to represents the
	                  collection framework concept.
	    Collection: start with capital 'c' without end with 's' : it is a master super interface
	                in the collection framework. 
	                
	    Collections: start with capital 'C': it is a one of Utility class inside
	                 collection framework like Arrays class in array concept. it will 
	                 some utility methods to manipulates the collection framework elements.
	                 
	    All collection classes and interfaces are available under java.util package, so if
	    we want to use any of the collection classes or interfaces we should add the import 
	    statement. 
	    
	    By using collection framework we can able to store and manipulate multiple values with
	    multiple data types as well by using single variable.
	    
	    why bzc we  collection framework classes or methods are by default Object class type.
	    like Array with Object class type. 
	    
	      ex: 
	        Object obj1 = new Object();
		    String s1 = new String("K7it");
		    Integer i1 =  new Integer(20);
		    
		    a[0] = obj1;
		    a[1] = s1;
		    a[2] = i1;
		    a[3] = 1234; //-> auto boxing into Integer class type
		    
		    Collection framework hierarchy :
		    
		    Collection:                             -> Map
		        ->List                                ->HashMap
		           -> ArrayList  					  ->LinkedHashMap
		           -> LinkedList 					  ->TreeMap
		           -> Vector(Legacy class )			  ->HashTable(legacy class)
		         
	            ->Set 
	                ->HashSet
	                ->LinkedHashSet
	                ->TreeSet
	            ->Queue
	                ->PriorityQueue
	          
	                
	      Legacy classes: its a old classes from jdk1.0 onwards these class are available, but 
	      its not advisable to use legacy classes.
	      
	      in collection framework mainly we have 4 interfaces, in that 3 are sub interface to
	      to Collection interface i.e List , Set, Queue. But 4th interface Map is not a sub 
	      interface to collection interface, it is separate interface inside collections
	      framework. 
	      
	      We will start with List interface:
	      List: list interface is a sub interface of collection interface, its available under 
	      java.util package. 
	      List interface will works same as the Arrays like index based operations. why because
	      list will use Arrays internally with Object type array. 
	      
	     -> by using List we can able to insert the data randomly by using index. 
	     -> by using list we can read the data randomly by using index from where we need.
	     -> list will provide order of output, it means which order we inserted same order we will
	        get the output while printing/reading values .
	     -> by default List size will taken as 10, once we added 10 elements into list then
	        it will increase the size of list double of present size. 
	        i.e it will increase 
	        10 to 20
	        20 to 40
	        40 to 80
	     List is having 3 sub classes  like
	             ArrayList 
	             LinkedList 
	             Vector
	            
	          ArrayList: it is sub class of List interface , it will works same as list 
	          interface features which we have listed above.
	          
	          Arraylist is having 3 types of Constructors.
	              1. Arraylist() -  no arg
	              2. Arraylist(int initialcapaticy);
	              3. Arraylist(Collection col)
	              
	              
	            Note: in side every collections classes toString() method is overridden.
	            
	            ArrayList its internally using arrays only, without arrays Arraylist it will not
	            work.
	            ArrayList internally it will use the Object type Array.
	            
	            Object a[] =  new Object[10];
	            when we start adding elements into a array using add() method
	            before adding element into array it will check 
	            
	            if(size of the array == no of elements in the array){
	             1. then  first we need  created the new array with double size of 
	              old array capacity.
	             2. copy old array elements into a new array
	             3. add our new element on top of old elements 
	             4. return that new array to user.
	            }else{
	               1. add new element old array just increasing index by one.
	            }
	            
	            
	            
	            important methods in  ArrayList: 
	            ================================
	            
	            
	            add(): by using add method we can add the elements into a arraylist. inside every
	             sub class of List interface there  are 2 overloaded add methods 
	              1. add(Element): this add method will add new element at end of arraylist any time
	              2. add(index, element) : this method will add the new element at specified 
	                  index place instead of adding at end of arraylist. 
	                  
	                  in arrays it works like this but
	                  a[1] =  abc;
	                  a[1] = xyz;
	                  sop(a[1]);// xyz
	                  
	                  
	                  in ArrayList:
	                  =============
	                  ArrayList list = new ArrayList();
	                  list.add("abc");//index 0
	                  list.add("pqr");// index 1
	                  list.add("123");// index 2
	                  list.add("456");// index 3
	                  
	                  Syso(list.get(1));//pqr
	                  Syso(list.get(2));//123
	                  Syso(list.get(3));//456
	                  
	                  
	                  list.add(1,"xyz");// 
	                  
	                  Syso(list.get(1));//xyz
	                  Syso(list.get(2));//pqr
	                  Syso(list.get(3));//123
	                  Syso(list.get(4));//456
	                  
	                  // here when we add new element in the specified index, then arraylist 
	                   will shift existing data from specified index to still last element
	                   one step forward i.e 1 index value in to 2 index, 2nd index value into
	                   3rd index, 3rd index value... 4th index........ nth index value 
	                   n+1th index .
	                   
	                   Note: because of this array list will give the less performance in case of 
	                   Random insertion. but it will give best performance in case of random 
	                   access or reading.
	                  
	                  
	                 get(index): this method will give the element data from specified index.
	                 
	                  Syso(list.get(1));//xyz
	                  Syso(list.get(2));//pqr
	                  Syso(list.get(3));//123
	                  Syso(list.get(4));//456
	                  
	                  Note; here if index is less zero or greater than size of arraylist it will
	                   give IndexOutOfBoundExcpetion
	                     
	                     Syso(list.get(7));
	                     
		Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 7 out 
		of bounds for length 5 	at 
	                  
	              
	           
	          
	    
	    
	    
	    
	 */
	
public static void main(String[] args) {
	
	/*
	Object a[] =  new Object[10];
    
    Object obj1 = new Object();
    String s1 = new String("K7it");
    Integer i1 =  new Integer(5);
    
    a[0] = obj1;
    a[1] = s1;
    a[2] = i1;
    a[3] = 1234; //-> auto boxing into Integer class type
    
    Object temp[] =  a;
    a = new Object[20];
    int i=0;
    for(Object obj : a){
       a[i++] = obj;
    }
    
    return a;
    
    
    */
	
	ArrayList list = new ArrayList();
	// how to add elements in to AL
	list.add(100);
	list.add(10.12);
	list.add("pranitha");
	list.add(true);
	list.add("giri");
	list.add('a');
	//list.add
	
	System.out.println(list);
	
	// read values 
	System.out.println(list.get(3));
	System.out.println(list.get(5));
	System.out.println(list.get(2));
	System.out.println(list.get(7));
	
}

}
