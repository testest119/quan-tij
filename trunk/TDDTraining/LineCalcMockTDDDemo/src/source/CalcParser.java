package source;

public class CalcParser {
	private int left;
	private int right;
	private String operator;

	public void parse(String string) {
		String[] split;
		split = string.split(" ");
		left = Integer.parseInt(split[0]);
		right = Integer.parseInt(split[2]);
		operator = split[1];
	}

	public int getLeftOperand() {
		return left;
	}

	public int getRightOperand() {
		return right;
	}

	public String getOperator() {
		return operator;
	}
}
