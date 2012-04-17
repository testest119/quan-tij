package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import source.CalcParser;

public class CalcParserTest {

	@Test
	public void testCalcParser() {
		CalcParser parser = new CalcParser();
		parser.parse("5 + 3");
		Assert.assertEquals(5, parser.getLeftOperand());
		Assert.assertEquals(3, parser.getRightOperand());
		Assert.assertEquals("+", parser.getOperator());
	}

}
