package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = sc.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("This Is LEAP Year");
		} else {
			System.out.println("This Is Not a Leap Year");
		}

	}
}