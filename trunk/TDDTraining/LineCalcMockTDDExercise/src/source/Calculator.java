package source;

public class Calculator {

	public int gAdd(int leftOperand, int rightOperand) {
		int sum = 0;
		for (int i = rightOperand; i > 0; i--) {
			sum += i;
		}
		sum += leftOperand;
		return sum;
	}
}
