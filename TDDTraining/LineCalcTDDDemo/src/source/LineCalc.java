package source;

public class LineCalc {

	public int calc(String string) {
		CalcParser parser = new CalcParser();
		parser.parse(string);
		Calculator calc = new Calculator();
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
