package com.java.pack1;

public class MultiThreading extends Thread {

	@Override
	public void run() {
		System.out.println("In the run method...");
		System.out.println("The activecount in the run method:"+Thread.activeCount());
		System.out.println("in run:"+Thread.currentThread());
	}

}
