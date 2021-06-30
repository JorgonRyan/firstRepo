package com.hcl.javaexercises.oop;

class Invoice {
	private String partNumber;
	private String partDescription;
	private int partQuantity;
	private double partPrice;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(int partQuantity) {
		this.partQuantity = partQuantity;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}

	public double getInvoiceAmount() {
		if (this.partQuantity <= 0) {
			this.partQuantity = 0;
		} else if (this.partPrice <= 0) {
			this.partPrice = 0.0;
		}
		double invoiceAmount = this.partPrice * this.partQuantity;
		return invoiceAmount;
	}
}