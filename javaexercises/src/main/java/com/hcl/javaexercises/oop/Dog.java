package com.hcl.javaexercises.oop;

import java.util.Optional;
import java.util.stream.Stream;

class Dog {
	String name;
	int age;
	double weight;

	Dog(String name, int age, double weight) {
		super();
		this.name = name.trim();
		this.age = age;
		this.weight = weight;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name.trim();
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name = " + name + ", age = " + age + ", weight = " + weight + "]";
	}

	String showExcitement() {
		return this.name + " is wagging its tail!";
	}

	String showExcitment(int levelOfExcitement) {
		Optional<String> excitementMultiplier = Stream.generate(() -> "!").limit(levelOfExcitement)
				.reduce((a, b) -> a + b);
		return this.name + " is wagging its tail" + excitementMultiplier.get();
	}

	String eating() {
		return this.name + " is eating.";
	}

	String eating(String food) {
		return this.name + " is eating " + food + ".";
	}
}
