package com.seerocode;

import java.util.Arrays;
import java.util.Collections;

public class CoinFlip {
	
	public static void setRandomFlip(String[] coinFlips){
		
		Collections.shuffle(Arrays.asList(coinFlips));
	}

	public static void main(String[] args) {
		
		String[] coinFlips = { "Tail", "Tail", "Head", "Tail", "Tail", "Tail", "Head", "Head", "Tail", "Head" };
		setRandomFlip(coinFlips);
		
		System.out.println(Arrays.toString(coinFlips));
	}

}
