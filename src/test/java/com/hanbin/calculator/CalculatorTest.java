package com.hanbin.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator c = null;
	
	@BeforeClass
	public static void makeCalculator() throws Exception{
		c = new Calculator();
	}
	
	@Test
	public void sum() throws Exception{
		assertEquals(c.sum(3, 2) , 5);
	}

	@Test
	public void minus() throws Exception{
		assertEquals(c.minus(3, 2), 1);
	}
}
