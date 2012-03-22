package TIJ.TIJ05.exercise;

public class E02 {
	String s1 = "Initialized at definition";
	String s2;

	public E02(String si) {
		// TODO Auto-generated constructor stub
		s2 = si;
	}

	public static void main(String[] args) {
		E02 e02 = new E02("Initialized at construction");
		System.out.println("s1: " + e02.s1);
		System.out.println("s2: " + e02.s2);
	}
}
