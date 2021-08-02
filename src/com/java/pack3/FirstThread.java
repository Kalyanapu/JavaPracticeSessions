package com.java.pack3;

public class FirstThread extends Thread {
	MultiplicationTable table;

	public FirstThread(MultiplicationTable table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(5);
	}

}
