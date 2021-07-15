package com.hcl.javaexercises.IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Data;

@Data
public class NumberFormatter {
	Integer sevenDigitNumber;
	String fileToWriteTo = "C:\\Users\\jorgon_ryan\\Documents\\NumbersHere.txt";

	public NumberFormatter(Integer sevenDigitNumber) {
		setSevenDigitNumber(sevenDigitNumber);
	}

	void setSevenDigitNumber(Integer sevenDigitNumber) {
		assert sevenDigitNumber.toString().length() == 7 : "Must input seven digit number";
		assert !sevenDigitNumber.toString().contains("0") && !sevenDigitNumber.toString().contains("1")
				: "Input must not contain 0 or 1";
		this.sevenDigitNumber = sevenDigitNumber;
	}

	void writeToFile(String toWrite) {
		try (FileWriter output = new FileWriter(fileToWriteTo)) {
			output.write(toWrite + "\n");
		} catch (FileNotFoundException e) {
			System.out.println("File: " + fileToWriteTo + " not found.");
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}

	void generateWord() {

	}

}
