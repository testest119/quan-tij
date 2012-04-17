package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import source.LineCalc;

public class LineCalcTest {

	@Test
	public void testCalc() {
		MockCalcParser mockCalcParser = new MockCalcParser(3, 2, "+");
		LineCalc calc = new LineCalc(mockCalcParser);
		int result = calc.calc("3 + 2");
		Assert.assertEquals(6, result);
		MockCalcParser mockCalcParser2 = new MockCalcParser(5, 3, "+");
		LineCalc calc2 = new LineCalc(mockCalcParser2);
		result = calc2.calc("5 + 3");
		Assert.assertEquals(11, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOtherOperand() {
		MockCalcParser mockCalcParser3 = new MockCalcParser(5, 3, "%");
		LineCalc calc3 = new LineCalc(mockCalcParser3);
		calc3.calc("5 + 3");
	}
}
