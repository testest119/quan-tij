package TIJ.TIJ05.example;

public class VarargType {
	static void f(Character... characters) {
		System.out.print(characters.getClass());
		System.out.println(" length " + characters.length);
	}

	static void g(int... is) {
		System.out.print(is.getClass());
		System.out.println(" length " + is.length);
	}

	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}
}
