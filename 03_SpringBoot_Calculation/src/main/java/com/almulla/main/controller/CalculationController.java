package com.almulla.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.almulla.main.pojo.Calculation;
import com.almulla.main.pojo.CalculationResult;
import com.almulla.main.service.CalculationServiceInterface;

@RestController
@RequestMapping("calculationapi")
public class CalculationController {

	@Autowired
	private CalculationServiceInterface calculationService;

	@RequestMapping(value = "addition", method = RequestMethod.POST)
	public CalculationResult addition(@RequestBody Calculation calculation) {
		return calculationService.addition(calculation);
	}

	@RequestMapping(value = "multiplication", method = RequestMethod.POST)
	public CalculationResult multiplication(@RequestBody Calculation calculation) {
		return calculationService.multiplication(calculation);
	}

	@RequestMapping(value = "division", method = RequestMethod.POST)
	public CalculationResult division(@RequestBody Calculation calculation) {
		return calculationService.division(calculation);
	}

	@RequestMapping(value = "subtraction", method = RequestMethod.POST)
	public CalculationResult subtraction(@RequestBody Calculation calculation) {
		return calculationService.subtraction(calculation);
	}

	@RequestMapping(value = "power", method = RequestMethod.POST)
	public CalculationResult power(@RequestBody Calculation calculation) {
		return calculationService.power(calculation);
	}

}
