package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import source.LineCalc;

public class LineCalcTest {

	@Test
	public void testAdd() {
		MockCalculator mockCalculator = new MockCalculator();
		LineCalc calc = new LineCalc(mockCalculator);
		int result = calc.calc("5 + 3");
		Assert.assertEquals(8, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOtherOperand() {
		MockCalculator mockCalculator = new MockCalculator();
		LineCalc calc = new LineCalc(mockCalculator);
		calc.calc("5 * 3");
	}
}
