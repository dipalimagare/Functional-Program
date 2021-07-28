package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int num = sc.nextInt();
	        double harmonicNum = 0;

	        if (num>0) {
	            for (int i=1; i<=num; i++) {
	            
					System.out.println("1/" +i+ "+");
	                harmonicNum = harmonicNum + (double)(1/i);
	            }
	            System.out.printf("Harmonic number is: %.4f ", harmonicNum);
	            
	        } else {
	            System.out.println("Number should be greater than 0.");
	        }

	}

}
