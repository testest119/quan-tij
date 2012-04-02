package TIJ.TIJ05.example;

public class OverloadingVarargs2 {
	static void f(float i, Character... characters) {
		System.out.println("first");
	}

	static void f(char c, Character... characters) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
