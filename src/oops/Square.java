package oops;

import java.util.Scanner;

public class Square extends Shape {

	@Override
	void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of side:");
		int side = sc.nextInt();
		int result = side * side;
		System.out.println("The Area of square is:" + result);

	}

	@Override
	public String toString() {
		return "Square [getColor()=" + getColor() + ", toString()=" + super.toString() + "]";
	}

}
