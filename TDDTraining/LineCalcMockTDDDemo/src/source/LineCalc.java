package source;

public class LineCalc {

	ICalculator calc;

	public LineCalc(ICalculator calculator) {
		this.calc = calculator;
	}

	public int calc(String string) {
		CalcParser parser = new CalcParser();
		parser.parse(string);
		int result = 0;
		if (parser.getOperator().equals("+")) {
			result = calc
					.add(parser.getLeftOperand(), parser.getRightOperand());
			return result;
		}

		else
			throw new IllegalArgumentException("illegal operator");
	}
}
