package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String values[] = input.nextLine().split(" ");

		for(String i : values) {
			System.out.println(i + " in binary is " + convertToBinary(i));
		}

		input.close();
	}

	public static String convertToBinary(String decimal) {
		int asInt = Integer.parseInt(decimal);
		if(asInt == 0) {
			return "0";
		}

		boolean negativeInt = asInt < 0;
		String ret = "";

		while(asInt != 0) {
			int remainder = asInt % 2;
			asInt /= 2;
			ret += String.valueOf(Math.abs(remainder));
		}

		if(negativeInt) {
			return "-" + reverseString(ret);
		} else {
			return reverseString(ret);
		}
	}

	public static String reverseString(String word) {
		String ret = "";

		for(int i = word.length() - 1; i >= 0; i--) {
			ret += word.charAt(i);
		}

		return ret;
	}

}
