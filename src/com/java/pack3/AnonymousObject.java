package com.java.pack3;

public class AnonymousObject {
	int a;

	void display() {
		System.out.println("in the display method");
		System.out.println(a);
	}

	public static void main(String[] args) {
		AnonymousObject obj=new AnonymousObject();
		obj.a=26;
		new AnonymousObject().a=50;
		new AnonymousObject().display();

	}

}
