package com.java.test;

interface Syrupable {
	void getSugary();
}

abstract class Pancake implements Syrupable {
}

class BlueBerryPancake extends Pancake {
	@Override
	public void getSugary() {
		;
	}
}

class SourdoughBlueBerryPancake extends BlueBerryPancake {
	void getSugary(int s) {
		;
	}
}
