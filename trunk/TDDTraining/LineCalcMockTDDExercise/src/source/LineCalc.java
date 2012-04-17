package source;

public class LineCalc {

	ICalcParser calcParser;

	public LineCalc(ICalcParser calcParser) {
		this.calcParser = calcParser;
	}

	public int calc(String string) {
		Calculator calculator = new Calculator();
		if (calcParser.getOperator().equals("+")) {
			int result = calculator.gAdd(calcParser.getLeftOperand(),
					calcParser.getRightOperand());
			return result;
		} else
			throw new IllegalArgumentException("Illegal Argument");

	}

}
