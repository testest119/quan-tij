package TIJ.TIJ05.exercise;

public class E09 {
	E09(String s) {
		System.out.println("s = " + s);
	}

	public E09(int i) {
		this("i = " + i);
	}

	public static void main(String[] args) {
		new E09("String call");
		new E09(47);
	}
}
