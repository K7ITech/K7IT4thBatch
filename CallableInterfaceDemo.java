package com.k7it;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// ctl+shift+o --> organize imports 
// ctrl+shift+f -  formate code 

public class CallableInterfaceDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// creating array of threads 
		MyCallableThread threads[] = { new MyCallableThread(20), new MyCallableThread(30), 
								new MyCallableThread(40), new MyCallableThread(50),
								new MyCallableThread(60), new MyCallableThread(80) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallableThread thread : threads) {
			Future future = service.submit(thread);
			System.out.println(future.get());
		}
		// creating single thread
		MyCallableThread thread = new MyCallableThread(100);
		Future future  = service.submit(thread);
		System.out.println(future.get());

	}
 /*
    
      		
      		
  */
}
