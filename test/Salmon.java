package com.java.test;

public class Salmon extends Thread {
	public static long id;

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {

			if (i == 2) {
				new Thread(new Salmon()).start();
				throw new Error();
			}
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Salmon();
		id = t1.getId();
		t1.start();
	}
}
