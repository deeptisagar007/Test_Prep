package com.java.test;

class SafeDeposit {
	private static SafeDeposit singleton;

	public static SafeDeposit getInstance(int code) {
		if (singleton == null)
			singleton = new SafeDeposit(code);
		return singleton;
	}

	private int code;

	private SafeDeposit(int c) {
		code = c;
	}

	int getCode() {
		return code;
	}
}

public class BeSafe {
	public static void main(String[] args) {
		SafeDeposit sd = SafeDeposit.getInstance(1);
		System.out.println("" + sd.getCode());
		SafeDeposit.getInstance(2);
		System.out.println("" + sd.getCode());

	}

}
