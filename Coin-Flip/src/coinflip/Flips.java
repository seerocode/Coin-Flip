package coinflip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Flips {

	// variables are public so they can be referenced in other classes
	static int hcount = 0;
	static int tcount = 0;
	// String array variable to hold the return from the flipCoin method
	static String[] hAndT = flipCoin();

	public static String[] flipCoin() {
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
		// to general itself automatic when you run it.
	}

	public static void headsCount() {

		System.out.println();
		System.out.println("Heads");
		System.out.println("=====");

		for (int i = 0; i < hAndT.length; i++) {
			if (hAndT[i].equals("Head")) {
				System.out.println("index " + Integer.toString(i));
				hcount++;
			}
		}

		System.out.println("Total Heads: " + Integer.toString(hcount));
	}

	public static void tailsCount() {

		System.out.println();
		System.out.println("Tails");
		System.out.println("=====");

		for (int i = 0; i < hAndT.length; i++) {
			if (hAndT[i].equals("Tail")) {
				System.out.println("index " + Integer.toString(i));
				tcount++;
			}
		}

		System.out.println("Total Tails: " + Integer.toString(tcount));
	}

	public static void main(String[] args) {
		// prints the random array of coin flips to the console
		System.out.println(Arrays.toString(hAndT));

		tailsCount();
		headsCount();

	}
}
