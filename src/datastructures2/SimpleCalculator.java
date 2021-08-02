package datastructures2;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("Lets make a simple calculator please select the user Menu......");
		Scanner scanner = new Scanner(System.in);
		System.out.println("user guideliness");
		System.out.println("press 1 for the Addition");
		System.out.println("press 2 for the subtraction");
		System.out.println("press 3 for the Multiplication");
		System.out.println("press 4 for the divison");
		System.out.println("------------------------");
		System.out.println("please enter the first number:");
		int first = scanner.nextInt();
		System.out.println("please enter the second number:");
		int second = scanner.nextInt();
		System.out.println("please enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("The result:" + (first + second));

			break;
		case 2:
			System.out.println("The result:" + (first - second));
			break;
		case 3:
			System.out.println("The result:" + (first * second));
			break;
		case 4:
			System.out.println("The result:" + (first / second));
			break;

		default:
			System.out.println("please enter the correct input");
		}

		scanner.close();

	}

}
