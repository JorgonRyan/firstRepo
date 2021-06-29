package com.hcl.Inheritance;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Animal2Test 
{
	Animal2 animal = new Animal2();
	Doggy	doggy  = new Doggy();
	
	@Test
	public void animal2Test()
	{
		assertEquals("BurntOrange", animal.getFurcolor());
		animal.setFurcolor("Orange");
		assertEquals("Orange", animal.getFurcolor());
		assertEquals("Roar", animal.makeNoise("hello"));
	}
	
	@Test
	public void doggyTest()
	{
		doggy.setFurcolor(doggy.furcolor);
		assertEquals("Black", doggy.getFurcolor());
		assertEquals("Bark", doggy.makeNoise(doggy.noise));
	}
}
