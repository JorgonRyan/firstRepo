package com.hcl.javaexercises.structuresandrecursion;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;

class RecursiveObject {
	int firstIndex = 0;
	char[] charArr;

	public int maxCharacterWithStream(String passedIn) {
		if (passedIn.length() == 0) {
			return -1;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < passedIn.length(); i++) {
			map.merge(passedIn.charAt(i), 1, Integer::sum);
		}
		Map<Character, Integer> result = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		Optional<Character> firstKey = result.keySet().stream().findFirst();
		return firstIndex = passedIn.indexOf(firstKey.get());
	}

	public int maxCharacterWithLoop(String passedIn) {
		if (passedIn.length() == 0) {
			return -1;
		}
		int count = 0, max = 0;
		char maxChar = 0, currentChar, possibleChar;
		for (int i = 0; i < passedIn.length(); i++) {
			currentChar = passedIn.charAt(i);
			for (int j = i + 1; j < passedIn.length(); j++) {
				possibleChar = passedIn.charAt(j);
				if (possibleChar == currentChar) {
					count++;
				}
				j++;
			}
			if (count > max) {
				max = count;
				maxChar = currentChar;
			}
			i++;
		}
		firstIndex = passedIn.indexOf(maxChar);
		return firstIndex;
	}

	boolean isStringAPalindrome(String possiblePalindrome) {
		charArr = possiblePalindrome.toCharArray();
		int i = 0, j = charArr.length - 1, mid = Math.floorDiv(charArr.length, 2);
		while (i < mid) {
			if (charArr[i] != charArr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	boolean openAndClosed(String parameter) {
		Stack<Character> charStack = new Stack<Character>();
		charArr = parameter.toCharArray();
		if (charArr[0] != '{' && charArr[0] != '[' && charArr[0] != '(' && charArr[0] != '<') {
			return false;
		}
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '{' || charArr[i] == '[' || charArr[i] == '(' || charArr[i] == '<') {
				charStack.push(charArr[i]);
			} else if (charArr[i] == '}' || charArr[i] == ']' || charArr[i] == ')' || charArr[i] == '>') {
				if (charStack.isEmpty()) {
					return false;
				}
				charStack.pop();
			}
		}
		if (charStack.isEmpty()) {
			return true;
		}
		return false;
	}

	int birthdayCandles(List<Integer> candles) {
		if (candles.size() == 0) {
			return 0;
		}
		int numberOfTallestCandles = 1, max;
		Collections.sort(candles, Collections.reverseOrder());
		max = candles.get(0);
		for (int i = 1; i < candles.size(); i++) {
			if (candles.get(i) == max) {
				numberOfTallestCandles++;
			}
		}
		return numberOfTallestCandles;
	}

	int summation(int n) {
		return ((n + 1) * n) / 2;
	}

	public static void main(String[] args) {
		RecursiveObject recObj = new RecursiveObject();
	}
}
