package com.k7it.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class Test{
    
	 <T>Test(T element){
       System.out.println(element);
      }
}
public class GenericsDemo {
	
	public static void main(String[] args) {
		 Test test1 = new Test("Test");		  
		// test1.add(new Integer(10)); 
		  
		  ArrayList<?> test = new ArrayList<>();
           //test.addAll(10);
		  
		  ArrayList<String> list = new ArrayList<>();
		  list.add("abc");
		  list.add("xyz");
		  //list.add(10);
		  
		  ArrayList<Integer> list1 = new ArrayList<>();
		  list1.add(100);
		  list1.add(200);
		  
		  int i  = list1.get(0);
		  
		  
		  ArrayList list2 = new ArrayList();
		  list2.add(100);
		  list2.add("212");
		  
		  
		  TreeSet<Person> set = new TreeSet<>();
		  
		  set.add(new Person(10,"K7it",5.5,55.25));
		  set.add(new Person(5,"Java",5.5,55.25));
		  //set.add("j2ee");// CTE
		 // set.add(new Address(12,"TPT",517126));//CTE 
		  
		  Iterator<Person> it = set.iterator();
		  while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person.toString());
			
		}
		  
		HashMap<String, Integer> monthToDays = new HashMap<>();
		monthToDays.put("jan", 31);
		monthToDays.put("feb", 28);
		monthToDays.put("mar", 31);
		monthToDays.put("apr", 30);
		monthToDays.put("may", 31);
		monthToDays.put("jun", 30);
		monthToDays.put("jul", 31);
		monthToDays.put("Aug", 31);
		monthToDays.put("spe", 30);
		monthToDays.put("oct", 31);
		monthToDays.put("nov", 30);
		monthToDays.put("dec", 31);
		
		System.out.println("No of days in Apr:"+monthToDays.get("apr"));
		
		HashMap<Integer, Employee> empMap = new HashMap<>();
		
		Employee emp1 = new Employee(01,"kesav","dev");
		Employee emp2 = new Employee(02,"pranitha","dev");
		Employee emp3 = new Employee(03,"aruna","dev");
		
		empMap.put(01,emp1);
		empMap.put(02,emp2);
		empMap.put(03,emp3);
		
		Employee emp =  empMap.get(02);
		
		System.out.println(empMap.get(02));
		
	} 
	
	/*
	   Generics: by using Generics we can achieve the dynamic datatype for attributes or 
	    method return types or method or constructor signature variables or any variables.
	    it is part of jdk 1.5 feature.
	    
	    before generics if we want to use different data types for same method we can go with
	     method over loading concept, how many different data types we need those many different
	     methods we need.
	    
	     class Calculator {
	     void print(int i, int j){
	       System.out.println(i+":"+j);
	     }
	     
	     void print(float i, floal j){
	      System.out.println(i+":"+j);   
	     }
	     
	     void print(String i, String j){
	      System.out.println(i+":"+j);
	     }
	     
	    }
	    
	    Calculator c1 = new Calculator();
	        c1.print(10,20);
	        c1.print("java","K7iT");
	        c1.print(10.25f,20.25f);
	        c1.print(20.12,30.35);// there is no double type method 
	    
	     Calculator class with generics:
	     ================================
	     class Calculator<T>{
	        void print(T i, T j){
	          System.out.println(i+":"+j);
	        }
	     }
	     
	     Calculator<Integer> c1 = new Calculator<Integer>();
	     
	     class Calculator<Integer>{
	        Integer add(Integer i, Integer j){
	          return i+j;
	        }
	     }	         
	     c1.add(10,20);// cs 
	     
	     
	     Calculator<String> c2 = new Calculator<String>()

	     class Calculator<String>{
	        void print(String i, String j){
	          System.out.println(i+":"+j);
	        }
	     }	
	     c2.print("Java","K7iT");// cs 
	     c2.print(20,40);//CTE as per c2 obj data type of method parameters are string type
	                   // so we cant pass the int values.
	     
	     
	     Syntax Generics: 
	     
	     class ClassName<T>{
	       // where ever dataType required use T as a datatype inside our class.
	        T attributeName;
	        
	        // here T is act as Datatype for attribute 
	        
	        T methodName(T parameterVariables){
	        
	        }
	        // here T is act as return type and also parameter variable data type.
	         
	          className(T parameterVar){
	             // here T act like data type foe constructor parameter.
	          }	        
	     }
	     
	     How to defind the dataype for the Generic datatype :
	     ======================================================
	     while calling statement we need decide which datatype we need to use it for 
	     generic datatype inside our class while object creation time. 
	     
	     Syntax:
	     
	         ClassName<datType> ref = new ClassName<datType>();
	           					or
	         ClassName<datType> ref = new ClassName<>(); 
	     
	     Types Generics:
	     ===============
	     Class level Generics :
	     
	     Single Generic Datatype
	     Syntax :
	      class ClassName<T,K,L,H,I>{
	       // where ever dataType required use T as a datatype inside our class.
	        T attributeName;
	        
	        // here T is act as Datatype for attribute 
	        
	        T methodName(T parameterVariables){
	        
	        }
	        // here T is act as return type and also parameter variable data type.
	         
	          className(T parameterVar){
	             // here T act like data type foe constructor parameter.
	          }	        
	     }
	     How to defind the dataype for the Generic datatype :
	     ======================================================
	     while calling statement we need decide which datatype we need to use it for 
	     generic datatype inside our class while object creation time. 
	     
	     Syntax:
	     
	         ClassName<datType> ref = new ClassName<datType>();
	           					or
	         ClassName<datType> ref = new ClassName<>(); 
	         
	         
	         
	     Multiple generic  Data Type:
	     Syntax :
	      class ClassName<K,V>{
	       
	        K key;
	        V value;
	        
	        void put(K key, V value){
	         
	        }              
	     }
	     
	     use:
	     ======
	     Syntax:
	     
	         ClassName<datType1,dataType2> ref = new ClassName<datType1,dataType2>();
	           					or
	         ClassName<datType1,dataType2> ref = new ClassName<>(); 
	         
	     Ex:
	        class Test<K,V>{
	        
	          K key;
	          V Value;
	          void put(K key, V value){
	             ///
	          }
	          
	         void add(K key, K value,K name){
	             //
	          }	
	        }
	        
	      1.  Test<String,Integer> test1 = new Test<String,Integer>();
	        
	        class Test<String,Integer>{
	        
	          String key;
	          Integer Value;
	          void put(String key, Integer value){
	             ///
	          }
	          
	         void add(String key, String value,String name){
	             //
	          }	
	        }
	        
	        
	        test1.put("K7iT",10);
	        test1.add("K7iT","java","J2ee");
	        
	        
	      2.  Test<Double,String> test2 = new Test<>();
	        
	         class Test<Double,String>{
	        
	          Double key;
	          String Value;
	          void put(Double key, String value){
	             ///
	          }
	          
	         void add(Double key, Double value,Double name){
	             //
	          }	
	        }       
	        
	        test2.put(20.23,"Java");
	        test2.add(10.25,15.12,14.12);
	        
	       3. Test<String,String> test3 = new Test<String,String>();
	        
	        class Test<String,String>{
	        
	          String key;
	          String Value;
	          void put(String key, String value){
	             ///
	          }
	          
	         void add(String key, String value,String name){
	             //
	          }	
	        }	        
	        test3.put("K7iT","Java");
	        test2.add("K7iT","Java","J2EE");
	     
	     
	     Method level Generics: by using method level generics we can declare the generic data
	     ======================
	     types each method level instead of entire class level. 
	     
	     systax for declaration:
	     class ClassName{
	     
	       <E> returnType methodName(E age, E Name){
	       
	       }	       
	       
	     }
	     // here <E> is act like generic datatype for only one method. 
	      
	       
	     How to define the data Type for method level generics:
	     ========================================================
	    
	     we no need to specify Specific datatype for method level generic type 
	     while creating class object or while calling method by using calling stamt.
	     Based on method input parameter value type that method generic datatype decide
	     Dynamically. 
	     
	     ClassName ref = new ClassName();
	     ref.methodName(10);
	     ref.methodName("K7it");  
	     
	     Ex:
	     
	     class Test{
	      <E> E m1(E element){	      
	         	return element;	         
	       	 }
	     }
	     
	     Test t1 = new Test();
	     t1.m1(20);
	     class Test{
	      <Integer> Integer m1(Integer element){	      
	         	return element;	         
	       	 }
	     }
	     
	     t1.m1("K7iT");
	     // in this calling stmt our class will act like this 
	      class Test{
	      <String> String m1(String element){	      
	         	return element;	         
	       	 }
	     }
	     
	     
	     Exmaple Q:
	     
	     class Test{
	      
	      <E> E add(E i,E j){
	         return i;
	      }
	     }
	     
	     Test t1 = new Test();
	     t1.add("K7iT",10);
	     
	     class Test{
	      
	      <E> E add(String i,Integer j){
	         return i;
	      }
	     }
	     
	     1.CTE 2. CS, RTE  3. CS,RS   4. CTE, RS   5. Non of the above
	     
	     class Test<T>{
	       T i1;
	     }
	     1. Test<Integer> test1 = new Test<>();
	         class Test<T>{
		       Integer i1;
		     }
	     
	     2. Test<String> test2 = new Test<String>();
	     
	       class Test<T>{
		       String i1;
		     }
	     
	     3. Test test3 = new Test();
	        
	         class Test<T>{
		       Object i1;
		     }
	       Note: if we are not specifying the data type for class level generics , 
	             then it will consider as Object data type dy default.
	             
	             
	     4. Test<> test4 = new Test<>();
	         
	     5. Test<> test5 = new Test<Integer>();
	     
	     6. Test<String>  test6 = new Test<Integer>();
	     
	     
	     
	     Q: what are the stmts are correct from above list?
	       
	        ans: 1, 2, 3
	     
	     wild card(?)operators in generics 
	     =================================
	     ? symbol is called as wild card operator in generic, by using wild card operator 
	     we can achive more restrictions in the generics with the help of extends or super
	     keys words 
	      ?
	      ? extends   --- lower bound 
	      ? super      --- upper bound
	      
	      syntax :
	      
	       class Test<T>{
	           void Add(T element){
	             System.out.println(element);
	           }
	       }
	       
	       Test<Number> test1 = new Test<>();
	       
	        test1.add(10);
	        test1.add(10.12);
	        test1.add(20.12f);
	        test1.add(new Number());
	        
	        Test<Integer> test2 = new Test<>();
	         test2.add(10.25);
	         
	         test2.add(new Number());
	         test2.add(new Object());
	         
	         Test<?> test2 = new Test<>();
	         // any data type like default type it will consider as Object type
	         Test<? extends Number> test2 = new Test<>();
	         // it will consider any of the Number class or sub class Number class 
	          but it will not support super class of number class type.
	          
	          Test<? super Number> test3 = new Test<>();
	          // it will consider either number class or super classes of number classes 
	           but not support sub class of number classes .
	           
	           
	          Note : where ever we are using generic class Type reference variable there only 
	           we can able to use the ? wild card operator options .
	           
	         
	       
	       3. constructor level generics :
	       ==============================
	       
	       constructor level generics are same as method level generics, even for constructor 
	       level genenrics we need to specify the generic declaration before constructor name
	       and data type for this generics is we can define while creating object by passing
	       paramter values to constructor like same as method 
	       
	       class Test{
	        <T> Test(T i){
	          
	        }
	       }
	       Test test1 = new Test(10);
	       
	       
	       
	       
	     
	     
	     Special chars in generics:
	     ==========================
	     T - type
	     E - element 
	     K - key
	     V - value
	     N - number
	     
	     Generic Collections:
	     ====================
	     
	     List list = new ArrayList();
	     
	     list.add(10);
	     list.add("abc");
	     list.add(10.26);
	     list.add(new StringBuilder("abc"));
	     addAllIntegerNumbers
	     
	     
	    int addAllIntegerNumbers(List list){
	    int sum =0;
	       for(Object element : list){
	        //if(element instancOf Integer){
	            sum+=element; // sum = sum+element;
	        //} 
	       }
	       return sum;
	     }
	     
	     by using Generics we can achieve more specialization in collection
	     
	     class Arraylist{
	       add(Object obj);
	       Object get(int index);
	       insert(int, Object);
	     }
	     
	     class ArrayList<E>{
	        add(E element);
	        E get(int index);
	        insert(int index, E element);
	        
	      }
	      
	      
	      ArrayList list2 = new ArrayList();  // default all methods in collections is Object
	                                          // type , so we can able to add any type values
		  list2.add(100);
		  list2.add("212");
		  
		  
	       ArrayList<String> list = new ArrayList<>();
		  list.add("abc");
		  list.add("xyz");
		  //list.add(10);// CTE why bzc we are restricted Arraylist to support only String data
		   *             //  values so we cant able to add integer values.
		  
		  ArrayList<Integer> list1 = new ArrayList<>();
		  list1.add(100);
		  list1.add(200);		  
		  int i  = list1.get(0);
		  
		  
		  HashSet<Person> set = new HashSet<>();
		  
		  set.add(new Person(10,"K7it",5.5,55.25));
		  set.add(new Person(12,"Java",5.5,55.25));
		  set.add("j2ee");// CTE
		  set.add(new Address(12,"TPT",517126));//CTE 
		  
		  // sorting tree set :
		    TreeSet<Person> set = new TreeSet<>();
		  
		  set.add(new Person(10,"K7it",5.5,55.25));
		  set.add(new Person(5,"Java",5.5,55.25));
		  //set.add("j2ee");// CTE
		 // set.add(new Address(12,"TPT",517126));//CTE 
		  
		  Iterator<Person> it = set.iterator();
		  while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person.toString());
			
		} 
		   
		  
		  
		  
	     
	     
	     
	     
	     
	   
	  
	 */
	 

}
