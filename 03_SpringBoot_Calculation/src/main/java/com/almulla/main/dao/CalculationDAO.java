package com.almulla.main.dao;

import org.springframework.stereotype.Repository;

import com.almulla.main.pojo.Calculation;
import com.almulla.main.pojo.CalculationResult;

@Repository
public class CalculationDAO implements CalculationDAOInterface {

	@Override
	public CalculationResult addition(Calculation calculation) {
		int result = calculation.getNumber1() + calculation.getNumber2();
		CalculationResult calculationResult = new CalculationResult();
		calculationResult.setResult(result);
		return calculationResult;
	}

	@Override
	public CalculationResult multiplication(Calculation calculation) {
		int result = calculation.getNumber1() * calculation.getNumber2();
		CalculationResult calculationResult = new CalculationResult();
		calculationResult.setResult(result);
		return calculationResult;
	}

	@Override
	public CalculationResult division(Calculation calculation) {
		int result = calculation.getNumber1() / calculation.getNumber2();
		CalculationResult calculationResult = new CalculationResult();
		calculationResult.setResult(result);
		return calculationResult;
	}

	@Override
	public CalculationResult subtraction(Calculation calculation) {
		int result = calculation.getNumber1() - calculation.getNumber2();
		CalculationResult calculationResult = new CalculationResult();
		calculationResult.setResult(result);
		return calculationResult;
	}

	@Override
	public CalculationResult power(Calculation calculation) {
		int result = (int) Math.pow((int) calculation.getNumber1(), (int) calculation.getNumber2());
		CalculationResult calculationResult = new CalculationResult();
		calculationResult.setResult(result);
		return calculationResult;
	}

}
