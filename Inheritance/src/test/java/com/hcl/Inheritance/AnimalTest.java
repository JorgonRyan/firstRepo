package com.hcl.Inheritance;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

public class AnimalTest
{
	Dog dog = new Dog();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStream()
	{
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void walkTest()
	{
		dog.walk();
		assertEquals("I am walking", outContent.toString().trim());
	}
	
	@Test
	public void eatTest()
	{
		dog.eat();
		assertEquals("I am eating", outContent.toString().trim());
	}
	
	@Test
	public void barkTest()
	{
		dog.bark();
		assertEquals("I am barking", outContent.toString().trim());
	}
	
	DogInAction dAction = new DogInAction();
	
	@Test
	public void actionTest()
	{
		dAction.action();
		assertEquals("I am walking\r\n"
					+ "I am eating\r\n"
					+ "I am barking", 
					outContent.toString().trim());
	}
	
	@After
	public void restoreStream()
	{
		System.setOut(originalOut);
	}
}
