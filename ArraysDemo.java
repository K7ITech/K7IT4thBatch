package com.k7it;

public class ArraysDemo {
/*
  Arrays: Arrays are sequence of continues memory locations, by using arrays 
  we can store multiple values by using single variable name by using index based insertion 
  or retrieve data. 
  for example if array variable pointing to 10 memory locations then our index is start from 
  0 and end with 9. normal count will start from 1 but index will start from zero. 
  so if we need to give the index for N memory location then our index will be start with 0
  and end with N-1.
     count :  1 to N
     index    0 to N-1
     
     syntax : DataType[] variableName =  new DataType[size];
              or
              DataTypr variableName[] =  new DataType[size];
              or
              DataType []variableName =  new DataType[size];
              
     
     here 
     size: indicates no of elements or no of memory locations which we are reserve for
     this variable. 
     
     DataType: what type data we can able to store in that variable. 
      [] :  array symbol 
     Example: 
       int a[] = new int[10];// this array variable can store 10 int values
       
       // here new int[10] means its not a object for int primitive data type it is object 
        for java.lang.Array class, in that array class object i can store only int type
        value max count is 10.
        
       String s[] = new String[20]; // by using this variable we can store 20 string values
       
       by using arrays we can able to store only one type data which is specific to specified
       data type in case of primitives 
       
       by using arrays we can able to store only same type of objects or sub class type
       objects in case of derived data types. but we can't store super class type objects.
               
               
       Person p[] = new Person[5]; // here in this array we can store 5 person or sub class of
       person class objects we can store.
       
       Note: in side arrays every memory location will initialize with corresponding data type
        default values. for example if array is int type array then all memory locations will 
        fill with zero. if array type is double then it will initialize with 0.0
        if array is derived type then it will initialize with null values by default.
        
        
        arrays will get default values if you declare any place either it can be global 
        variable or local variable or parameter / arguments variable 
        
        
       declaration and initialization of arrays :
       ==========================================
       
       declaration :
                   DataType variableName[];
                   int i[];      //integer type array class variable
                   double d[];   // double type array class variable 
                   double d1;    // just simple double variable; 
                   int i1;       // it simple int varible
        
                   Person[] refvar; // this person type Array class variable. 
                   
       declaration and initalization:
       
            int i[] = new int[3];// left side part called declaration and right side part called
                                     as initialization. 
             this meaning is we are creating object for array class with reserving
             3 memory locations for storing int type values. 
             
             int i[];  // declaration
             
             i= new int[3];// just initialization;
             i[] = new int[3];// CTE error while initializing at different place we no need to 
                              // use [] for variable like this  i[], just use variable name
                               simply thats enough.
             
        how to insert the data and how to read data from arrays :
        ==========================================================
        
         if we want to insert data into array or if we want to read data from array 
         we should use the index of memory location along with variable name. index is
         start with zero and end with N-1; if index is leass than 0 or greater than N-1, then
         we will get the java.lang.ArrayIndexOutOfBoundExcpetion, it is a sub class of
         IndexOutOfBoundExcpetion.
         
         example ;
         int i[] = new int[3];// here array size is 3 so index is 0 to 2;
       
         i[0] = 10;
         i[1] = 20;
         i[2] = 60;
         i[3] = 70;//ArrayIndexOutOfBoundExcpetion
         i[-2] = 15; // ArrayIndexOutOfBoundExcpetion
         
         this code we want to achive without arrays in normal varaibale 
         int i = 10;
         int j =  20
         int k = 60;
         
         how to read values from arrays: 
         
         System.out.println(i[0]);// 10
         System.out.println(i[2]);// 60
         System.out.println(i[1]);// 20
         
         while inserting or reading data from arrays we can insert in any order or
         you read any order by using index, but index should be with in the range else
         we will get ArrayIndexOutOfBoundExcpetion.
         
         
         Person[] p = new Person[5];
         
         p[0] =  new Person(27,"aruna",5.6,55.0);
         p[3] =  new Person(22,"latha",5.2,65.0);
         p[4] =  new Person(32,"divya",5.5,65);
         
         
        Person  p1 =  new Person(27,"aruna",5.6,55.0);
        Person  p2 =  new Person(22,"latha",5.2,65.0);
        Person  p3 =  new Person(32,"divya",5.5,65);
        
         p[0] =  p1;
         p[3] =  p2;
         p[4] =  p4;
         
         Car c1 = new Car(001,"Xyo",12345);
         p[2] = c1; // CTE we can't assign car class objects inside person type array. 
                    // bzc there is no relationship between person and car classes.
                      
         how to find the no of elements in the array:
         ============================================
         
               length : by using length attribute we can able to find the no of elements 
                        in the array.
                        
         How many ways we can give the values or read the values from arrays:
         
         int[]a =  new int[5];
         // 1. Assigning literal way or using direct index 
         a[0] = 20;
         a[1] = 21;
         a[2] = 22;
         a[3] = 23;
         a[4] = 24
         
         2. assign using for loop:
         =========================
          int k = 20;
         for(int i = 0; i< a.length;i++){
            //a[i] =k++;  this called as post increment : first assign the vlaue what ever u have
        	                                              // then increase the value by adding 1
             a[i] =++k;    // this is called pre increment : first increament the value  by adding one
                                                           // then assign same value to left side variable
        
         }
          // how to read the values from arrays by using for loop
         for(int i = 0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
         
         how to read by using while loop:
         ===============================
         while loop: while loop also one of the looping block for executing same code 
         more than one time until condition will get false;
         systax: 
            while(condition){
             
               // body of the while which we need to execute multiple times 
            }
         here condition will except boolean true or false values expressions. if conditon 
         is true while loop code will execute, if condition is false then while code will 
         not execute. 
         example:
         int j = 0;
         while(j < a.length) {
        	 System.out.println(a[j]);
        	 j++;
         }
         
         do -while loop: 
         ===============
                          do whill loop works same as the while loop but there is 
                          one difference. i.e in while first we will check the condition 
                          if condition is true then only while loop body will execute.
                          in case condition is failed at first time only then while loop
                          code will not execute even one time. 
                          
                          But incase of do while loop first we will execute the body of the
                          loop then we will check condition either we need to execute same code
                          again or not. here even though condition failed at first time only our do
                          while loop  code will execute at lease one time. 
                          
                          syntax: 
                           
                            do{
                            // body of the loop which u want to execute multiple times 
                            }while(condition);
                            
                         example:
                         
                           int l = 0;
					        do {
					        	 System.out.println(a[l]);
					        	 l++;
					         }while(l < a.length);
					         
			enhanced for loop:
			=================
			 		  it will works same as for loop but it will use internally 
			                   iterator features instead of index. 
			                   it is JDK 1.5 feature.
			          syntax:
			           for(InnerElement DataType ref : arry or collection obj){
			              // body of loop which u want to execute multiple times
			           }		  
		  
			          examples: 
			           
			           for(int value : a) {
			        	System.out.println(value);
			           }
        
        
        forEach for loop: 
        =================
        its is jadk 1.8 feature, it will also works like same as enhance 
        for loop but it is better than that. 
        
        syntax: 
        
          collection obj. forEach(value -> System.out.println(value));
         
         in side forEach for loop it wont use index or iterator feature it will works using
         lamda expression.
         
         this forEach forloop is using for collections obj mainly so we will see later.
         
         Types of arrays:
         ===============
         
         1. single dimension array : still now what are the arrays which we have seen  those are
            single dimensional arrays. 
         2. multi dimension array : the arrays which is declaring with more on one dimension 
          those are called as multi dimenssion arrays like 2 dimentional arrays or 3 dimensional
          etc...
          
          multi dimension arrays also called as array inside another array is called as multi
          Dimension array. 
         
        
  
 */
	public static void main(String[] args) throws InterruptedException {
		//int[]i =  new int[5];
		char []c =  new char[10];
		//System.out.println(i.length);
		System.out.println(c.length);
		System.out.println(":"+c[0]+":");
		 int[]a =  new int[2000];
		 int k = 20;
		 // how to assign the values  by using for loop
         for(int i = 0; i< a.length;i++){
             //a[i] =k++;  this called as post increment : first assign the vlaue what ever u have
        	                                              // then increase the value by adding 1
             a[i] =++k;    // this is called pre increment : first increament the value  by adding one
                                                           // then assign same value to left side variable
         }
          // how to read the values from arrays by using for loop
      /*   for(int i = 0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
         int j = 0;
         while(j < a.length) {
        	 System.out.println(a[j]);
        	 j++;
         }
         
        int l = 0;
        do {
        	 System.out.println(a[l]);
        	 l++;
         }while(l < a.length);
		*/ 
        for(int value : a) {
        	System.out.println(value);
        	//Thread.sleep(1000);
        }
        
        
	}
}
