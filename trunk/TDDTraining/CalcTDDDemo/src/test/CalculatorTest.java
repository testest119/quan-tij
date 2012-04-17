package test;

import junit.framework.Assert;

import org.junit.Test;

import source.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd1() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 3);
		Assert.assertEquals(8, result);
	}

	@Test
	public void testAdd2() {
		Calculator calc = new Calculator();
		int result = calc.add(6, 3);
		Assert.assertEquals(9, result);
	}

}
