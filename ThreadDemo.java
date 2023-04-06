package com.K7it;



public class ThreadDemo   {	
	public static void main(String[] args  ) throws InterruptedException {
		   
		
		Mythread t1 = new Mythread();
	      t1.setName("Mythread");
		  t1.start();
		  t1.run();  
	    // t1.notifyAll();
		
		
		   for (int i =11;i<20; i++) {
			  // System.out.println(10/0);
	       
               System.out.println(Thread.currentThread().getName()+":"+i);
	            // System.out.println(10/0);
	       	}
		 
	}

}
