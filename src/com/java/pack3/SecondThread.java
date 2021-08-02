package com.java.pack3;

public class SecondThread extends Thread {

	MultiplicationTable table;
	
		public SecondThread(MultiplicationTable table) {
			this.table = table;
		}
	
		@Override
		public void run() {
			table.printTable(10);
		}
	
	

}
