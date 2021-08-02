package com.java.pack1;

import java.util.Scanner;

public class VotingDemo {

	public static void main(String[] args) throws Exception  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int age = sc.nextInt();

		ageException(age);

		sc.close();

	}

	private static void ageException(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("The age is less than 18 so u can't vote");
		} else {
			System.out.println("You are eligible to vote");

		}
	}

}
