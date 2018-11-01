package com.marlabs.strings;

import java.util.Scanner;

public class StringApp {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Select Constructor Types to Create String Using: ");
		System.out.println(" 1) One Argument: Sequence of characters ");
		System.out.println(" 2) One Argument: character array ");
		System.out.println(
				" 3) Three Arguments: char type Character Array, int type start Index og char array, int type End end of char array ");

		Scanner scanner = new Scanner(System.in);
		int stringConstructorchoice = scanner.nextInt();
		String string;
		switch (stringConstructorchoice) {
		case 0:
			System.out.println("Enter ");
			string = new String();
			System.out.println("Constructor: String( ) is been called ");
			System.out.println("String Value: " + string);

			break;

		case 1:
			System.out.println("Enter Sequence of characters");
			string = new String(scanner.next());
			System.out.println("Constructor: String(String original) is Been called ");
			System.out.println("String Value: " + string);
			break;

		case 2:
			System.out.println("Enter the length of Character Array");
			int charArraysLength = scanner.nextInt();
			char charArray[] = new char[charArraysLength];
			for (int i = 0; i < charArraysLength; i++) {
				if (i == 0) {
					System.out.println("Enter First Char");
					charArray[i] = scanner.next().charAt(0);
				} else {
					System.out.println("Enter Next Char");
					charArray[i] = scanner.next().charAt(0);
				}
			}
			string = new String(charArray);
			System.out.println("Constructor: String(char value[]) is been called ");
			System.out.println("String Value: " + string);

			break;

		case 3:
			System.out.println("Enter the length of char array ");
			charArraysLength = scanner.nextInt();
			char charArray2[] = new char[charArraysLength];
			for (int i = 0; i < charArraysLength; i++) {
				if (i == 0) {
					System.out.println("Enter First Char");
					charArray2[i] = scanner.next().charAt(0);
				} else {
					System.out.println("Enter Next Char");
					charArray2[i] = scanner.next().charAt(0);
				}
			}
			System.out.println("Enter Start Index of char for String");
			int startIndex = scanner.nextInt();
			System.out.println("Enter Start Index of char for String");
			int endIndex = scanner.nextInt();
			string = new String(charArray2, (startIndex - 1), (endIndex - 1));
			System.out.println("\n" + "Constructor: String( char value[], int offset, int count ) is been called ");
			System.out.println("\n" + "String Value: " + string);

			break;

		default:
			scanner.close();
			System.exit(0);
			break;
		}
		System.out.println("Main Ends");
	}

}
