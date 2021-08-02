package oops;

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter the option:");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				TallPerson tp = new TallPerson();
				System.out.println("enter height of TallPerson:");
				int th = sc.nextInt();
				tp.setHeight(th);
				System.out.println("enter the weight of TallPerson");
				float tw = sc.nextFloat();
				tp.setWeight(tw);
				float BMI = tw / (th * th);
				System.out.println(tp);
				System.out.println("The BMI of TallPerson:" + BMI);
				ShortPerson sp = new ShortPerson();
				System.out.println("enter the height of a short person ");
				int sh = sc.nextInt();
				System.out.println("enter the weight of short person:");
				float sw = sc.nextFloat();
				float BMI1 = sw / (sh * sh);
				System.out.println(sp);
				System.out.println("The BMI of ShortPerson:" + BMI1);
				
				if (tw == sw) {
					System.out.println(
							"The weights of Both TallPersons & shortPersons are matched Then The ShortPerson has weighted more");
				} else {
					System.out.println("Both weights are not matched");
				}
				break;

			default:
				System.out.println("Enter the valid option");
				System.exit(0);
				sc.close();
			}
		}

	}

}
