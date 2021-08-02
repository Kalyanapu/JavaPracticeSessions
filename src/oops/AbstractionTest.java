package oops;

import java.util.Scanner;

public class AbstractionTest {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please follow these guideliness:\n" + "1.Square\n" + "2.Rectangle\n" + "3.Circle");
			System.out.println("User please enter the option u want:");
			int option = sc.nextInt();
			Shape shape = null;
			switch (option) {
			case 1:
				shape = new Square();
				System.out.println("please enter the color for Square:");
				sc.next();
				String color = sc.nextLine();
				shape.setColor(color);
				shape.calculateArea();

				break;
			case 2:
				shape = new Rectangle();
				System.out.println("please enter the color for Rectangle:");
				sc.next();
				String color1 = sc.nextLine();
				shape.setColor(color1);
				shape.calculateArea();
				break;
			case 3:
				shape = new Circle();
				System.out.println("please enter the color for Circle:");
				sc.next();
				String color2 = sc.nextLine();
				shape.setColor(color2);
				shape.calculateArea();
				break;

			default:
				System.out.println("The entered option is invalid...");
				System.out.println("Program teriminates.");
				System.out.println("Hello programmer");
				sc.close();
				System.exit(0);
			}

		}

	}
}
