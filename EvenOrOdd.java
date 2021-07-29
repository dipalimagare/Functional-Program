package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		sc.close();

		boolean result = isEven(number);
		if (isEven(number)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}

}