package com.java.test;

public class chocolate {

	public void repeatFront(String strElement, int n) {

		char strCh[] = strElement.toCharArray();
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(strCh[j]);
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		chocolate cho = new chocolate();
		cho.repeatFront("Chocolate", 4);
		System.out.println("Main Ends");
	}

}
