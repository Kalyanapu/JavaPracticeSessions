package com.java.pack4;

public class FirstThread implements Runnable {
	 MultiplicationDemo table;
		public FirstThread( MultiplicationDemo table) {
			this.table=table;
			
		}

	@Override
	public void run() {
		table.printTable(10);

	}

}
