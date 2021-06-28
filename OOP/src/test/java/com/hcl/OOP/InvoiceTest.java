package com.hcl.OOP;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class InvoiceTest 
{
	Invoice invoiceOne = new Invoice();
	
	@Test
	void testGetPart()
	{
		invoiceOne.setPartNumber("011");
		assertEquals("011", invoiceOne.getPartNumber());
	}
	
	@Test
	void testGetDescription()
	{
		invoiceOne.setPartDescription("Convertor");
		assertEquals("Convertor", invoiceOne.getPartDescription());
	}
	
	@Test
	void testGetQuantity()
	{
		invoiceOne.setPartQuantity(10);
		assertEquals(50, invoiceOne.getPartQuantity());
	}
	
	@Test
	void testGetPrice()
	{
		invoiceOne.setPartPrice(100.0);
		assertEquals(100.0, invoiceOne.getPartPrice(), 0.01);
	}
	
	@Test
	void testInvoiceAmount()
	{
		assertEquals(1000.0, invoiceOne.getInvoiceAmount(), 0.01);
		invoiceOne.setPartPrice(-1);
		assertEquals(0, invoiceOne.getInvoiceAmount(), 0.01);
		invoiceOne.setPartPrice(100);
		invoiceOne.setPartQuantity(-1);
		assertEquals(0, invoiceOne.getInvoiceAmount(), 0.01);
	}
}
