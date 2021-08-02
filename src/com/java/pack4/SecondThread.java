package com.java.pack4;

public class SecondThread implements Runnable {
	MultiplicationDemo table;

	public SecondThread( MultiplicationDemo table) {
		this.table=table;
		
	}

	@Override
	public void run() {
	 table.printTable(20);

	}

}
