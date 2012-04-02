package TIJ.TIJ05.example;

public class AutoboxingVarargs {
	public static void f(Integer... integers) {
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		f(new Integer(1), new Integer(2));
		f(4, 5, 6, 7, 8, 9);
		f(10, new Integer(11), 12);
	}
}
