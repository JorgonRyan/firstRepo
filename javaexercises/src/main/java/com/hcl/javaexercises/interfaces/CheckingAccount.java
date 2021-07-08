package com.hcl.javaexercises.interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class CheckingAccount implements BankAccount {
	private String owner;
	@Setter(AccessLevel.PRIVATE)
	private String password, toAppend;
	@Setter(AccessLevel.PRIVATE)
	private StringBuilder transactionRecord = new StringBuilder();
	private Double balance;
	private final Double INSUFFICIENTFUNDSFEE = 25.00;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	private LocalDateTime now = LocalDateTime.now();

	public CheckingAccount(String owner, String password, Double toDeposit) {
		this.owner = owner;
		setPassword(password);
		setBalance(toDeposit);
		toAppend = "Account Created On: " + now.format(formatter) + "\n";
		transactionRecord.append(toAppend);
	}

	private void setBalance(Double toDeposit) {
		if (toDeposit < 0.0) {
			throw new NumberFormatException("Initial Deposit Must Be Positive.");
		}
		this.balance = toDeposit;
	}

	Double processCheck(Double checkToProcess) {
		if (balance < 0 && checkToProcess >= Math.abs(balance)) {
			toAppend = now.format(formatter).toString() + "\tYour Owed Balance Was Paid.\n";
			transactionRecord.append(toAppend);
		}
		toAppend = now.format(formatter).toString() + "\tA Deposit Of " + checkToProcess.toString() + " Has Posted.\n";
		transactionRecord.append(toAppend);
		return deposit(checkToProcess);
	}

	@Override
	public Double deposit(Double amount) {
		this.balance += amount;
		return this.balance;
	}

	@Override
	public Double withdrawal(Double amount) {
		this.balance -= amount;
		toAppend = now.format(formatter).toString() + "\tA Withdrawal Of " + amount.toString() + " Has Occured.\n";
		transactionRecord.append(toAppend);
		if (this.balance < 0) {
			this.balance -= INSUFFICIENTFUNDSFEE;
			toAppend = now.format(formatter).toString()
					+ "\tYour Account Was Overdrawn And A Insufficient Funds Fee Has Posted.\n";
			transactionRecord.append(toAppend);
		}
		return this.balance;
	}

	@Override
	public String printBalance() {
		return balance.toString();
	}

	@Override
	public String resetPassword(String currentPassword, String newPassword) {
		Boolean provenIdentity = this.proveIdentity(currentPassword);
		if (provenIdentity) {
			return this.password = newPassword;
		}
		return "Incorrect Password";
	}

	@Override
	public Boolean proveIdentity(String enteredPassword) {
		if (enteredPassword == this.password) {
			return true;
		}
		return false;
	}

}
