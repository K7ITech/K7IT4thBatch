package com.k7it;

public class ArrayTest {
	public static void main(String[] args) throws InterruptedException {
		//int[]i =  new int[5];
		char []c =  new char[10];
		//System.out.println(i.length);
		System.out.println(c.length);
		System.out.println(":"+c[0]+":");
      // int[]a =  new int[2000];
		 int[]a =  new int[20];

		 int k = 20;
		 // how to assign the values  by using for loop
         for(int i = 0; i< a.length;i++){
            // a[i] =k++; // this called as post increment : first assign the value 
        	                                            //what ever u have then increase
        	                                              //the value by adding 1
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

