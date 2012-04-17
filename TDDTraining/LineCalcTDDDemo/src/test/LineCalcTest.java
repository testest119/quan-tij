package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import source.LineCalc;

public class LineCalcTest {

	@Test
	public void testAdd() {
		LineCalc calc = new LineCalc();
		int result = calc.calc("5 + 3");
		Assert.assertEquals(8, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOtherOperand() {
		LineCalc calc = new LineCalc();
		calc.calc("5 * 3");
	}
}
