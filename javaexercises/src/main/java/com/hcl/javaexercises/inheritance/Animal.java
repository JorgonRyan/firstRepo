package com.hcl.javaexercises.inheritance;

import static java.lang.System.out;

class Animal {
	void walk() {
		out.println("I am walking");
	}
}

class Dog extends Animal {
	void eat() {
		out.println("I am eating");
	}

	void bark() {
		out.println("I am barking");
	}
}

class DogInAction extends Dog {
	void action() {
		walk();
		eat();
		bark();
	}
}
