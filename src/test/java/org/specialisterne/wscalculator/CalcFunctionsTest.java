package org.specialisterne.wscalculator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CalcFunctionsTest {

	CalcFunctions calcFunctions;
	
	@Before
	public void setupTest(){
		calcFunctions = new CalcFunctions();
	}
	
	@Test
	public void givenAreTwoIntegers_whenAddValuesIsExecuted_thenNumbersAreAddedUp(){
		//given
		int number1 = 1;
		int number2 = 2;
		int expectedResult = 3;
		
		
		//when
		int result = calcFunctions.addValues(number1, number2);
		
		//then
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void givenAreTwoDoubles_whenAddValuesIsExecuted_thenNumbersAreAddedUp(){
		//given
		double number1 = 1.2345;
		double number2 = 2.345;
		double expectedResult = 3.5795;
		
		//when
		double result = calcFunctions.addValues(number1, number2);
		
		//then
		assertEquals(expectedResult, result, 0.000000001);
	}
	
	@Test
	public void givenAreTwoBigDecimals_whenAddValuesIsExecuted_thenNumbersAreAddedUp(){
		//given
		BigDecimal number1 = new BigDecimal("1.2345");
		BigDecimal number2 = new BigDecimal("2.345");
		BigDecimal expectedNumber = new BigDecimal("3.5795");
		
		//when
		BigDecimal result = calcFunctions.addValues(number1, number2);
		
		//then
		assertEquals(expectedNumber, result);
	}
	
}
