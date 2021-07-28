package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.print("Enter a number N: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int power =1;

		if (N > 0 && N < 31) {
			for (int i = 1; i <= N; i++) {
				power = power * 2;
				System.out.println(2 + " to the power " + i + " : " + power);
			}
		} else {
			System.out.println("It exceeds the 'int' datatype limit");
		}
	}

}
