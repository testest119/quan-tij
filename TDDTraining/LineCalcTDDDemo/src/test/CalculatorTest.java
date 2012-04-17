package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import source.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(5,3);
		Assert.assertEquals(8,result);
	}

}
