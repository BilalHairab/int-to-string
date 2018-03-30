package com.oop.task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to be converted:");
		String result = integerToString(scanner.nextInt());
		scanner.close();
		System.out.println(result);

	}

	private static String integerToString(int toConvert) {
		boolean isNegative = toConvert < 0;
		Character sign = '+';
		String numberConverted = "";
		int mod;
		if (isNegative) {
			toConvert *= -1;
			sign = '-';
		}
		while (toConvert != 0) {
			mod = toConvert % 10;
			toConvert /= 10;
			Character character = (char) (mod + '0');
			numberConverted = character + numberConverted;
		}
		numberConverted = sign + numberConverted;
		return numberConverted;
	}

}
