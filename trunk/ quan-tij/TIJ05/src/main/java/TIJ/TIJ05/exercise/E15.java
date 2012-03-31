package TIJ.TIJ05.exercise;

public class E15 {
	String s;
	{
		s = "instance initialization";
	}

	public E15() {
		System.out.println("Default constructor; s=" + s);
	}

	E15(int i) {
		System.out.println("int constructor; s=" + s);
	}

	public static void main(String[] args) {
		new E15();
		new E15(1);
	}
}
