package com.java.pack3;

public class MarkerMain {

	public static void main(String[] args) {
		MarkerImp obj=new MarkerImp();
		if(obj instanceof MarkerInterfaceDemo) {
			System.out.println("Access");
		}else {
			System.out.println("no permission");
		}

	}

}
