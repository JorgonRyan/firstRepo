package com.hcl.javaexercises.inheritance;

import static java.lang.System.out;

class Cycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class Bike extends Cycle {
	@Override
	String define_me() {
		return "a cycle with pedals.";
	}

	Bike() {
		out.println("Hello I am a Bike I am " + define_me());
		String temp = super.define_me();
		out.println("My ancestor is a cycle who is " + temp);
	}

}

class Motorcycle extends Cycle {
	@Override
	String define_me() {
		return "a cycle with an engine.";
	}

	String whoAmI() {
		String s = "Hello I am a motorcycle, I am " + define_me() + " My ancestor is " + super.define_me();
		return s;
	}

	public static void main(String[] args) {
		Motorcycle motorBike = new Motorcycle();
	}
}