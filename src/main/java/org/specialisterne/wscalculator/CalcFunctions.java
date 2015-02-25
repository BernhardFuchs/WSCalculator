package org.specialisterne.wscalculator;

import java.math.BigDecimal;

public class CalcFunctions {

	public int addValues(int number1, int number2) {
		int result;
		result = number1 + number2;
		return result;
	}

	public double addValues(double number1, double number2) {
		double result;
		result = number1 + number2;
		return result;
	}

	public BigDecimal addValues(BigDecimal number1, BigDecimal number2) {
		BigDecimal result;
		result = number1.add(number2);
		return result;
	}
	
}
