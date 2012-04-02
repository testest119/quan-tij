package TIJ.TIJ05.example;

public class OverloadingVarargs {
	static void f(Character... characters) {
		System.out.print("first");
		for (Character character : characters) {
			System.out.print(" " + character);
		}
		System.out.println();
	}

	static void f(Integer... integers) {
		System.out.print("second");
		for (Integer integer : integers) {
			System.out.print(" " + integer);
		}
		System.out.println();
	}

	static void f(Long... longs) {
		System.out.println("third");
	}

	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0L);
		// !f();
	}
}
