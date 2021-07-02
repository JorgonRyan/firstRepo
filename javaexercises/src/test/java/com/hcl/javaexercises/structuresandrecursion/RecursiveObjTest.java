package com.hcl.javaexercises.structuresandrecursion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RecursiveObjTest {
	RecursiveObject recObj = new RecursiveObject();
	List<Integer> candleTest1 = new ArrayList<Integer>();
	List<Integer> candleTest2 = new ArrayList<Integer>();

	@Test
	public void maxCharStreamTest() {
		assertEquals(0, recObj.maxCharacterWithStream("aaaeefeaa"));
		assertEquals(-1, recObj.maxCharacterWithStream(""));
		assertEquals(2, recObj.maxCharacterWithStream("aabbbefgbbzzbb"));
	}

	@Test
	public void maxCharLoopTest() {
		assertEquals(0, recObj.maxCharacterWithStream("aaaeefeaa"));
		assertEquals(-1, recObj.maxCharacterWithStream(""));
		assertEquals(2, recObj.maxCharacterWithStream("aabbbefgbbzzbb"));
	}

	@Test
	public void palindromeTest() {
		assertTrue(recObj.isStringAPalindrome("level"));
		assertFalse(recObj.isStringAPalindrome("rocket"));
		assertTrue(recObj.isStringAPalindrome("abba"));
		assertFalse(recObj.isStringAPalindrome("this is a very long string"));
	}

	@Test
	public void openAndClosedTest() {
		assertTrue(recObj.openAndClosed("{{{}{{}}}}"));
		assertFalse(recObj.openAndClosed("this wont work"));
		assertTrue(recObj.openAndClosed("[[[[[][[]]]]]]"));
		assertFalse(recObj.openAndClosed("<<>><><<<>>"));
	}

	@Test
	public void birthdayTest() {
		candleTest1.add(2);
		candleTest1.add(2);
		candleTest1.add(55);
		candleTest1.add(2);
		candleTest1.add(3);
		candleTest1.add(4);
		candleTest1.add(55);
		candleTest1.add(55);

		candleTest2.add(3);
		candleTest2.add(3);
		candleTest2.add(2);
		candleTest2.add(1);
		candleTest2.add(3);

		assertEquals(3, recObj.birthdayCandles(candleTest1));
		assertEquals(3, recObj.birthdayCandles(candleTest2));
		candleTest1.removeAll(candleTest1);
		assertEquals(0, recObj.birthdayCandles(candleTest1));
	}

	@Test
	public void summationTest() {
		assertEquals(1275, recObj.summation(50));
		assertEquals(5050, recObj.summation(100));
		assertEquals(500500, recObj.summation(1000));
	}
}
