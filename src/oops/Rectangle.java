package oops;

import java.util.Scanner;

public class Rectangle extends Shape {

	@Override
	void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of length:");
		int length = sc.nextInt();
		System.out.println("enter the value of breath:");
		int breath = sc.nextInt();
		int result = length * breath;
		System.out.println("The Area of square is:" + result);

	}

	@Override
	public String toString() {
		return "Rectangle [getColor()=" + getColor() + ", toString()=" + super.toString() + "]";
	}
	

}
