package com.java.pack1;

public class ThreadTest {

	public static void main(String[] args) {
		MultiThreading thread = new MultiThreading();
		System.out.println("The active count in main :"+Thread.activeCount());
		thread.setName("New Thread");
		
		thread.start();
		

	}

}
