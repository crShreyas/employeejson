package com.thoughtworks.bootcamp.program;

public class Add {
	int firstNumber;
	int secondNumber;
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	@Override
	public String toString() {
		return "Add [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + "]";
	}
		
}
