package TIJ.TIJ05.exercise;

public class E18 {
	public static void main(String[] args) {
		Test[] array = new Test[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Test(Integer.toString(i));
		}
	}
}
