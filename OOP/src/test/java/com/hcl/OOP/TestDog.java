package com.hcl.OOP;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestDog 
{
	Dog d1 = new Dog("Fido", 7, 50.0);
	Dog d2 = new Dog("Spot", 11, 20.0);
	
	@Test
	public void testAge() 
	{
		assertEquals(7, d1.getAge());
		d1.setAge(3);
		assertEquals(3, d1.getAge());
	}
	
	@Test
	public void testName()
	{
		assertEquals("Fido", d1.getName());
		d1.setName("NewFido");
		assertEquals("NewFido", d1.getName());
	}
	
	@Test
	public void testWeight()
	{
		assertEquals(50.0, d1.getWeight(), 0.01);
		d1.setWeight(25.0);
		assertEquals(25.0, d1.getWeight(), 0.01);
	}
	
	@Test
	public void testToString()
	{
		String str1 = 	"Dog [name = " + d1.getName() + ", age = " + d1.getAge() +
						", weight = " + d1.getWeight() + "]";
	
		String str2 = 	"Dog [name = " + d2.getName() + ", age = " + d2.getAge() +
						", weight = " + d2.getWeight() + "]";
		
		assertEquals(str1, d1.toString());
		assertEquals(str2, d2.toString());
	}
	
	@Test
	public void testShowExcitement()
	{
		String str1 = d1.getName() + " is wagging its tail!";
		String str2 = d2.getName() + " is wagging its tail!";
		
		assertEquals(str1, d1.showExcitement());
		assertEquals(str2, d2.showExcitement());
	}
	
	@Test
	public void testStreamedExcitement()
	{
		String str1 = d1.getName() + " is wagging its tail!!!";
		String str2 = d1.getName() + " is wagging its tail!!!!!";
		
		assertEquals(str1, d1.showExcitment(3));
		assertEquals(str2, d1.showExcitment(5));
	}
	
	@Test
	public void testEating()
	{
		String str1 = d1.getName() + " is eating.";
		assertEquals(str1, d1.eating());
	}
	
	@Test
	public void testEatingVar()
	{
		String str1 = d1.getName() + " is eating dogfood.";
		assertEquals(str1, d1.eating("dogfood"));
	}
}
