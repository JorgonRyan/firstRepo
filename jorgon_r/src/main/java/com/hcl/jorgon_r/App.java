package com.hcl.jorgon_r;

/**
 * Hello world!
 *
 */
public class App {
	int total = 0;

	int ReadArgs(String[] args) {
		for (String s : args) {
			System.out.println(s);
			total = total + Integer.valueOf(s);
		}
		System.out.println(total);
		return 0;
	}

	void PrintArithmetic(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

	void ComputeAvg(int x, int y, int z) {
		int avg = (x + y + z) / 3;
		System.out.println(avg);
	}

	boolean PrimeCheck(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	int GetAscii(char c) {
		int AsciiVal = (int) c;
		return AsciiVal;
	}

	void FizzBuzz() {
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
		}
	}

	int IsOdd(int x) {
		String s = String.valueOf(x);
		for (int i = 0; i < s.length(); i++) {
			int value = Integer.valueOf(s.indexOf(i));
			if (value % 2 != 0) {
				total = total + value;
			}
		}
		return total;
	}

	int EvenSquared(int x) {
		String s = String.valueOf(x);
		for (int i = 0; i < s.length(); i++) {
			int value = Integer.valueOf(s.indexOf(i));
			if (value % 2 == 0) {
				total = total + (value * value);
			}
		}
		return total;
	}

	String GetLargestWord(String s) {
		String[] strarray = s.split(" ", 0);
		String longest = strarray[0];
		for (String str : strarray) {
			if (str.length() > longest.length()) {
				longest = str;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		App a = new App();
		a.ReadArgs(args);
		a.PrintArithmetic(20, 4);
	}
}
