package com.hcl.javaexercises.stringsandwrappers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	Calculator calc = new Calculator();

	@Test
	public void additionTest() {
		assertEquals(5, calc.addition(3, 2));
		assertEquals(100, calc.addition(50, 50));
	}

	@Test
	public void subtractionTest() {
		assertEquals(1, calc.subtraction(3, 2));
		assertEquals(50, calc.subtraction(100, 50));
	}

	@Test
	public void multiplicationTest() {
		assertEquals(21, calc.multiply(7, 3));
		assertEquals(100, calc.multiply(25, 4));
	}

	@Test
	public void divisionTest() {
		assertEquals(4, calc.divide(8, 2));
		assertEquals(100, calc.divide(100, 1));
		assertEquals(4, calc.divide(17, 4));
	}

}
