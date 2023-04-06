package com.k7it;

import java.util.Iterator;

public class Mythread extends Thread {

	@Override
	public void run() {
		 System.out.println("child2 thread priority:"+Thread.currentThread().getPriority());
		for (int i = 20; i < 30; i++) {
			System.out.println("Name:"+Thread.currentThread().getName()+
					",ID:"+Thread.currentThread().getId()+":"+i);
		}
	}
}
