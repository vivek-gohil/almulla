package com.almulla.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almulla.main.dao.CalculationDAOInterface;
import com.almulla.main.pojo.Calculation;
import com.almulla.main.pojo.CalculationResult;

@Service
public class CalculationService implements CalculationServiceInterface {

	@Autowired
	private CalculationDAOInterface calculationDAO;

	@Override
	public CalculationResult addition(Calculation calculation) {
		return calculationDAO.addition(calculation);
	}

	@Override
	public CalculationResult multiplication(Calculation calculation) {
		return calculationDAO.multiplication(calculation);
	}

	@Override
	public CalculationResult division(Calculation calculation) {
		return calculationDAO.division(calculation);
	}

	@Override
	public CalculationResult subtraction(Calculation calculation) {
		return calculationDAO.subtraction(calculation);
	}

	@Override
	public CalculationResult power(Calculation calculation) {
		return calculationDAO.power(calculation);
	}

}
