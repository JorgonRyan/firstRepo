package com.hcl.javaexercises.interfaces;

public interface BankAccount {

	Double deposit(Double amount);

	Double withdrawal(Double amount);

	String printBalance();

	String resetPassword(String enteredPassword, String newPassword);

	Boolean proveIdentity(String enteredPassword);
}
