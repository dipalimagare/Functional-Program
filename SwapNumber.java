package com.bridgelabz;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ::");
		int a = sc.nextInt();
		System.out.println("Enter Second Number ::");
		int b  = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping the Numbers are:: ");
		System.out.println("First Number is :"+a);
		System.out.println("Second Number is :"+b);
		
	}

}
