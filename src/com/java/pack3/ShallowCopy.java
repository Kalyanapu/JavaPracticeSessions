package com.java.pack3;

public class ShallowCopy {
	int a, b;

	@Override
	public String toString() {
		return "ShallowCopy [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		ShallowCopy s = new ShallowCopy();
		s.a = 20;
		s.b = 50;
		System.out.println(s);

		ShallowCopy s1 = s;
		
		System.out.println(s1);

	}

}
