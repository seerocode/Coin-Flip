package coinflip;

import java.util.Arrays;
import java.util.Random;

public class Flips {
	static int hcount = 0;
	static int tcount = 0;
	static String[] HandT = flipcoin();

	public static String[] flipcoin() {
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

		System.out.println("Head");
		for (int i = 0; i < HandT.length; i++) {
			if (HandT[i].equals("Head")) {
				System.out.println("index " + Integer.toString(i));
				hcount++;
			}
		}
		
	}

	public static void tailsCount() {
		System.out.println("Tail");
		for (int i = 0; i < HandT.length; i++) {
			if (HandT[i].equals("Tail")) {
				System.out.println("index " + Integer.toString(i));
				tcount++;
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(HandT));
		
		tailsCount();
		System.out.println("Total Tails " + Integer.toString(tcount));
		
		headsCount();
		System.out.println("Total Heads " + Integer.toString(hcount));

	}
}
