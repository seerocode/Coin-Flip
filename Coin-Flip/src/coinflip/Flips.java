package coinflip;

import java.util.Arrays;
import java.util.Random;

public class Flips {

	// variables are public so they can be referenced in other classes
	int hCount = 0;
	 int tCount = 0;
	// String array variable to hold the return from the flipCoin method
	 String[] hAndT = flipCoin();

	public String[] flipCoin() {
		String[] coins = new String[10];
		Random rand = new Random();
		for (int i = 0; i < coins.length; i++) {
			int flips = rand.nextInt(2);
			if (flips == 0) {
				coins[i] = "Tail";
			} else {
				coins[i] = "Head";
			}
		}
		return coins;
	}

	public void headsCount() {

		System.out.println();
		System.out.println("Heads");
		System.out.println("=====");

		for (int i = 0; i < hAndT.length; i++) {
			if (hAndT[i].equals("Head")) {
				System.out.println("index " + i);
				hCount++;
			}
			
		}

		System.out.println("Total Heads: " + hCount);
	}

	public void tailsCount() {

		System.out.println();
		System.out.println("Tails");
		System.out.println("=====");

		for (int i = 0; i < hAndT.length; i++) {
			if (hAndT[i].equals("Tail")) {
				System.out.println("index " + i);
				tCount++;
			}
		}

		System.out.println("Total Tails: " + tCount);
	}

	public static void main(String[] args) {
//		// prints the random array of coin flips to the console
//		System.out.println(Arrays.toString(hAndT));
//
//		tailsCount();
//		headsCount();

	}
}
