package com.java.test;

import java.util.Scanner;

public class CheckInts {

	public boolean checkInts(int[] intArray) {
		// System.out.println("In meothod: " + intArray);
		boolean flag = false;
		for (int i = 0; i < intArray.length; i++) {
			if (1 == intArray[i]) {
				if (i == (intArray.length - 1)) {
					break;
				} else {
					if (2 == intArray[i + 1]) {
						if (i == (intArray.length - 1)) {
							break;
						} else {
							if (3 == intArray[i + 2]) {
								// System.out.println("In third");
								flag = true;
							}
						}

					}
				}

			}
		}
		return flag;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Main Starts");
		int[] array1 = { 1, 1, 2, 3, 1 };
		int[] array2 = { 1, 1, 2, 4, 1 };
		int[] array3 = { 1, 1, 2, 1, 2, 3 };
		boolean result = false;
		CheckInts check = new CheckInts();
		System.out.println("Enter Choice 1 for Array 1");
		System.out.println("Enter Choice 2 for Array 2");
		System.out.println("Enter Choice 3 for Array 3");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			// System.out.println("In Choice 1");
			result = check.checkInts(array1);
			System.out.println("The Result is: " + result);
			break;
		case 2:
			// System.out.println("In Choice 2");
			result = check.checkInts(array2);
			System.out.println("The Result is: " + result);
			break;
		case 3:
			// System.out.println("In Choice 3");
			result = check.checkInts(array3);
			System.out.println("The Result is: " + result);
			break;

		default:

			break;
		}

		System.out.println("Main Ends");
	}

}
