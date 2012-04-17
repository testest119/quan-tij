package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import source.Calculator;

public class CalculatorTest extends Calculator {

	@Test
	public void testgAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.gAdd(5, 3);
		Assert.assertEquals(11, result);
	}

}
