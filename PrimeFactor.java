package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = sc.nextInt();
		System.out.println("Prime Factors are : " );

		for (int i = 2; i < number; i++) 
		{
			while (number % i == 0) //number%i==0,print i
			{
				System.out.println(i + " ");
				number = number / i;  //iterate upto number/i
			}
		}
		if (number < 2) {
			System.out.println(number);
		}

	}
}
