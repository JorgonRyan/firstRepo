package com.hcl.javaexercises.stringsandwrappers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class StringPrac {
	String cat1, cat2;
	StringBuilder cat3;
	StringBuffer cat4;

	static int checkCharacters(String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return 1;
		}
		return -1;
	}

	void stringComp() {
		cat1 = "cat";
		cat2 = "cat";

		if (cat1 == cat2) {
			System.out.println("Cat1 and Cat2 are equal.");
		}

		cat1 = new String("cat");

		if (cat1 == cat2) {
			System.out.println("Cat1 and Cat2 are equal again.");
		}

		cat3 = new StringBuilder("cat");
		cat4 = new StringBuffer("cat");

		cat3.append(" in the hat");
		cat4.append(" has a bat");

		System.out.println(cat3);
		System.out.println(cat4);
	}

	String returnMiddleChar(String str) {
		StringBuilder middle = new StringBuilder();
		int mid = str.length() / 2;
		if (str.length() % 2 == 0) {
			middle.append(str.charAt(mid - 1));
			middle.append(str.charAt(mid));
		} else {
			middle.append(str.charAt(mid));
		}
		return middle.toString();
	}

	int vowelCounter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
}
