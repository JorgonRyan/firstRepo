package com.hcl.javaexercises.inheritance;

class Animal2 {
	String furcolor = "BurntOrange";

	String getFurcolor() {
		return furcolor;
	}

	void setFurcolor(String furcolor) {
		this.furcolor = furcolor;
	}

	String makeNoise(String noise) {
		return "Roar";
	}
}

class Doggy extends Animal2 {
	final String furcolor = "Black";
	final String noise = "Bark";

	@Override
	String makeNoise(String noise) {
		return noise;
	}
}