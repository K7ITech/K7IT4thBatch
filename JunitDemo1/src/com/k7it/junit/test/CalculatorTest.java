package com.k7it.junit.test;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.k7it.junit.Calculator;

import org.junit.internal.runners.statements.ExpectException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class CalculatorTest 
{
	Calculator c = new Calculator();
	ExpectedException exceptionRule = ExpectedException.none();
	@Test
	public void addTest() 
	{
		assertEquals(25, c.add(10,15));
	}
	@Test
	public void negativeCaseAddTest()
	{
		assertNotEquals(25, c.add(20,50));
	}
	

		
}
