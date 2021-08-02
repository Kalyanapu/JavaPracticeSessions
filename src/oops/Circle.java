package oops;

import java.util.Scanner;

public class Circle extends Shape {

	@Override
	void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of radius1:");
		int radius1 = sc.nextInt();
		System.out.println("enter the value of radius2:");
		int radius2 = sc.nextInt();
		double result = Math.PI * radius1 * radius2;
		System.out.println("The Area of square is:" + result);

	}

	@Override
	public String toString() {
		return "Circle [getColor()=" + getColor() + ", toString()=" + super.toString() + "]";
	}

}
