package com.hcl.javaexercises.interfaces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckingAccountTest {
	CheckingAccount checking1 = new CheckingAccount("Bob", "password", 50.00);
	CheckingAccount checking2 = new CheckingAccount("Joe", "simple", 10.00);

	@Test
	public void checkingConstructorTest() {
		assertThrows(NumberFormatException.class, () -> new CheckingAccount("fail", "passfail", -1.00));
	}

	@Test
	public void processCheckTest() {
		assertEquals(50.00, checking1.getBalance(), 0.01);
		assertEquals(100.00, checking1.processCheck(50.00), 0.01);
		assertEquals(-35.00, checking1.withdrawal(110.00), 0.01);
		assertEquals(-1.00, checking1.processCheck(34.00), 0.01);
		assertEquals(0, checking1.processCheck(1.00), 0.01);

	}

	@Test
	public void depositTest() {
		assertEquals(50.00, checking1.deposit(0.0), 0.01);
		assertEquals(100.0, checking1.deposit(50.0), 0.01);
		assertEquals(100000, checking2.deposit(99990.0), 0.01);
	}

	@Test
	public void withdrawalTest() {
		assertEquals(50.00, checking1.withdrawal(0.0), 0.01);
		assertEquals(40.0, checking1.withdrawal(10.0), 0.01);
		assertEquals(0.0, checking1.withdrawal(40.0), 0.01);
		assertEquals(-35.0, checking1.withdrawal(10.0), 0.01);
	}

	@Test
	public void resetPasswordTest() {
		assertEquals("password", checking1.getPassword());
		checking1.resetPassword("password", "newpassword");
		assertEquals("newpassword", checking1.getPassword());
		assertEquals("simple", checking2.getPassword());
		assertEquals("Incorrect Password", checking2.resetPassword("simpl", "this should fail anyways"));
	}

	@Test
	public void proveIdentityTest() {
		assertTrue(checking1.proveIdentity("password"));
		assertFalse(checking1.proveIdentity("incorrect password"));
	}

}
