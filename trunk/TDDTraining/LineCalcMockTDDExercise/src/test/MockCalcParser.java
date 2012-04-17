package test;

import source.ICalcParser;

public class MockCalcParser implements ICalcParser {

	int left;
	int right;
	String operator;

	public MockCalcParser(int left, int right, String operator) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public int getLeftOperand() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public int getRightOperand() {
		// TODO Auto-generated method stub
		return right;
	}

	public String getOperator() {
		return operator;
	}

}
