package com.java.test;

import java.util.Scanner;

public class ArraysRotation {

	public void solution(int arrayElement[], int N, int K) {
		int startPosition = (N - K);
		// System.out.println("The position is: " + startPosition);
		int[] retArray = new int[N];

		for (int i = 0; i < 5; i++) {
			if (startPosition == (N - 1)) {
				// System.out.println("IF Sp:" + startPosition);
				retArray[i] = arrayElement[startPosition];
				startPosition = 0;
			} else {
				// System.out.println("Inel Sp:" + startPosition);
				retArray[i] = arrayElement[startPosition];
				startPosition = startPosition + 1;
			}
		}
		for (int j = 0; j < N; j++) {
			System.out.println(retArray[j]);
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Starts");
		int[] array1 = { 3, 8, 9, 7, 6 };

		System.out.println("Enter Number of Rotation");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		ArraysRotation ar = new ArraysRotation();

		ar.solution(array1, array1.length, k);

		System.out.println("Main Ends");
	}

}
