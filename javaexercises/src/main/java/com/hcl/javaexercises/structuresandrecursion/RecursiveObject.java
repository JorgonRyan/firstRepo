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
		Stack<Character> openCharStack = new Stack<Character>();
		charArr = parameter.toCharArray();
		if (charArr[0] != '{' || charArr[0] != '[' || charArr[0] != '(' || charArr[0] != '<') {
			return false;
		}
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] != '{' || charArr[i] != '[' || charArr[i] != '(' || charArr[i] != '<') {
				openCharStack.push(charArr[i]);
			} else if (charArr[i] != '}' || charArr[i] != ']' || charArr[i] != ')' || charArr[i] != '>') {
				if (openCharStack.isEmpty()) {
					return false;
				}
				openCharStack.pop();
			}
		}
		if (openCharStack.isEmpty()) {
			return true;
		}
		return false;
	}

	int birthdayCandles(List<Integer> candles) {
		int numberOfTallestCandles = 0, max;
		Collections.sort(candles, Collections.reverseOrder());
		max = candles.get(0);
		for (int i = 1; i < candles.size(); i++) {
			if (candles.get(i) == max) {
				numberOfTallestCandles++;
			}
		}
		return numberOfTallestCandles;
	}

	int summation() {
		int total = 0;
		// ((n + 1)*n)/2
		return total;
	}

	public static void main(String[] args) {
		RecursiveObject rec = new RecursiveObject();
		rec.maxCharacterWithStream("hello");
		rec.maxCharacterWithLoop("hello");
		System.out.println(rec.isStringAPalindrome("abba"));
		System.out.println(rec.isStringAPalindrome("level"));

	}
}
