package com.almulla.main.pojo;

public class CalculationResult {
	private int result;

	public CalculationResult() {
		// TODO Auto-generated constructor stub
	}

	public CalculationResult(int result) {
		super();
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "CalculationResult [result=" + result + "]";
	}

}
