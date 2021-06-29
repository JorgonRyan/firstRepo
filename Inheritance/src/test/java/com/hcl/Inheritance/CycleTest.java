package com.hcl.Inheritance;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CycleTest
{
	Motorcycle m = new Motorcycle();
	
	@Test
	public void motorBikeTest()
	{
		String testString = "Hello I am a motorcycle, I am a cycle with an engine. My ancestor is a vehicle with pedals.";
		
		assertEquals(testString, m.whoAmI());
	}
}
