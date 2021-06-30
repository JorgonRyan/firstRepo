package com.hcl.javaexercises.inheritance;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class AclassTest 
{
	Aclass a = new Aclass();
	Bclass b = new Bclass();
	Cclass c = new Cclass();
	
	@Test
	public void aClassTest()
	{
		assertEquals("this is Aclass.", a.whosTalking());
		assertEquals(100, a.whosNumber());
		assertEquals(false, a.whosRight());
	}
	
	@Test
	public void bClassTest()
	{
		assertEquals("this is Aclass.", b.whosTalking());
		assertEquals(200, b.whosNumber());
		assertEquals(true, b.whosRight());
	}
	
	@Test
	public void cClassTest()
	{
		assertEquals("this is Cclass.", c.whosTalking());
		assertEquals(200, c.whosNumber());
		assertEquals(true, c.whosRight());
	}
}
