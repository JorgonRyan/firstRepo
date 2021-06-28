package com.hcl.OOP;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class InvoiceTest 
{
	Invoice invoiceOne = new Invoice();
	
	@Test
	public void testGetPart()
	{
		invoiceOne.setPartNumber("011");
		assertEquals("011", invoiceOne.getPartNumber());
	}
	
	@Test
	public void testGetDescription()
	{
		invoiceOne.setPartDescription("Convertor");
		assertEquals("Convertor", invoiceOne.getPartDescription());
	}
	
	@Test
	public void testGetQuantity()
	{
		invoiceOne.setPartQuantity(10);
		assertEquals(10, invoiceOne.getPartQuantity());
	}
	
	@Test
	public void testGetPrice()
	{
		invoiceOne.setPartPrice(100.0);
		assertEquals(100.0, invoiceOne.getPartPrice(), 0.01);
	}
	
	@Test
	public void testInvoiceAmount()
	{
		invoiceOne.setPartPrice(100.0); invoiceOne.setPartQuantity(10);
		assertEquals(1000.0, invoiceOne.getInvoiceAmount(), 0.01);
		
		invoiceOne.setPartPrice(-1);
		assertEquals(0, invoiceOne.getInvoiceAmount(), 0.01);
		
		invoiceOne.setPartPrice(100.0);
		invoiceOne.setPartQuantity(-1);
		assertEquals(0, invoiceOne.getInvoiceAmount(), 0.01);
	}
}
