package com.hcl.javaexercises.stringsandwrappers;

import static java.lang.Math.addExact;
import static java.lang.Math.floorDiv;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.subtractExact;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class Calculator {
	int result;

	int addition(int x, int y) {
		return result = addExact(x, y);
	}

	int subtraction(int x, int y) {
		return result = subtractExact(x, y);
	}

	int multiply(int x, int y) {
		return result = multiplyExact(x, y);
	}

	int divide(int x, int y) {
		return result = floorDiv(x, y);
	}

}
