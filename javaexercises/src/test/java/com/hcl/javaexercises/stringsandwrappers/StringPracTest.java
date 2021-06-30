package com.hcl.javaexercises.stringsandwrappers;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringPracTest {

	StringPrac strPrac = new StringPrac(null, null, null, null);

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void checkCharsTest() {
		assertEquals(-1, StringPrac.checkCharacters("this is a string"));
		assertEquals(1, StringPrac.checkCharacters("test"));
	}

	@Test
	public void stringCompTest() {
		strPrac.stringComp();
		assertEquals("Cat1 and Cat2 are equal.\r\n" + "cat in the hat\r\n" + "cat has a bat",
				outContent.toString().trim());
	}

	@Test
	public void returnMiddleTest() {
		assertEquals("a", strPrac.returnMiddleChar("cat"));
		assertEquals("aa", strPrac.returnMiddleChar("maam"));
		assertEquals("t", strPrac.returnMiddleChar("greetings"));
	}

	@Test
	public void vowelCounterTest() {
		assertEquals(5, strPrac.vowelCounter("aeiou"));
		assertEquals(2, strPrac.vowelCounter("made"));
		assertEquals(0, strPrac.vowelCounter("try"));
	}

	@After
	public void restoreStream() {
		System.setOut(originalOut);
	}

}
