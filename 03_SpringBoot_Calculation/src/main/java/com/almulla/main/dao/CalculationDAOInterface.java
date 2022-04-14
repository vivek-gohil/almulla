package com.almulla.main.dao;

import com.almulla.main.pojo.Calculation;
import com.almulla.main.pojo.CalculationResult;

public interface CalculationDAOInterface {

	public CalculationResult addition(Calculation calculation);

	public CalculationResult multiplication(Calculation calculation);

	public CalculationResult division(Calculation calculation);

	public CalculationResult subtraction(Calculation calculation);

	public CalculationResult power(Calculation calculation);
}
