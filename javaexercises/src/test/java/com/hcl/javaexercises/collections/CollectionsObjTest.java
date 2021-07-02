package com.hcl.javaexercises.collections;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CollectionsObjTest {
	CollectionsObj collector = new CollectionsObj();

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void printCollectionTest() {
		String[] colors = { "red", "white", "blue" };
		collector.printCollection(colors);
		assertEquals("[red, white, blue]", outContent.toString().trim());
	}

	public void iterateListTest() {
		ArrayList<Object> intList = new ArrayList<Object>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		collector.iterateList(intList);
		assertEquals("[1, 2, 3, 4]", outContent.toString().trim());
	}

	public void reverseOrderTest() {
		List<Object> reverseThis = new ArrayList<Object>();
		reverseThis.add("hello");
		reverseThis.add("I");
		reverseThis.add("Like");
		reverseThis.add("To");
		reverseThis.add("Program");
		List<Object> reversed = new ArrayList<Object>();
		// Need to find asserts for Collection objects!
		// assertArrayEquals(reversed, collector.reverseOrder(reverseThis));
	}

	@After
	public void restoreStream() {
		System.setOut(originalOut);
	}
}
