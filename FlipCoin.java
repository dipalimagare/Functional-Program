package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
	private final int HEADS = 0;
	private int face;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("How many times u want to toss a coin: ");
		int FLIPS = s.nextInt();

		if (FLIPS > 0) {
		
			final int Toss = FLIPS;
			int headCount = 0, tailCount = 0;

			FlipCoin coin = new FlipCoin();

			for (int i = 1; i <= FLIPS; i++) {
				coin.flip();

				if (coin.isHeads()) {
					headCount++;
				} else {
					tailCount++;
				}
				System.out.println(coin.toString());
			}
			System.out.println("Number of Toss: " + Toss);
			System.out.println("Number of Heads: " + headCount);
			System.out.println("Number of tails: " + tailCount);

			double headPercentage = (headCount * 100.0) / FLIPS;
			System.out.printf("Head percentage = %.2f %n", headPercentage);
			double tailPercentage = 100 - headPercentage;
			System.out.printf("Tail percentage = %.2f %n ", tailPercentage);
		}
	}

	private boolean isHeads() {
		return (face == HEADS);
	}

	private void flip() {
		face = (int) (Math.random() * 2);

	}

	public String toString() {
		return (face == HEADS) ? "Heads" : "Tails";

	}

}
