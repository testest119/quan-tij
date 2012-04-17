package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import source.ScreenCalc;

public class ScreenCalcTest {

	@Test
	public void test() {
		MockScreen screen = new MockScreen();
		ScreenCalc calc = new ScreenCalc(screen);
		calc.add(5, 3);
		Assert.assertEquals("5+3=8", screen.seeScreen());
	}
}
