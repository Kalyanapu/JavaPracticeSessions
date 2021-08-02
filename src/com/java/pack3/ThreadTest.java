package com.java.pack3;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MultiplicationTable table = new MultiplicationTable();
		FirstThread thread1 = new FirstThread(table);
		SecondThread thread2 = new SecondThread(table);
		thread1.start();
		thread1.join();
		thread2.start();

	}

}
