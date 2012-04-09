package exercise;

class WithProtected {
	protected int i;
}

public class E06_ProtectedManipulation {
	public static void main(String[] args) {
		WithProtected withProtected = new WithProtected();
		withProtected.i = 47;
		System.out.println("withProtected.i = " + withProtected.i);
	}
}
