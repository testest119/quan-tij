package exercise.local;

public class E05_AccessControl {
	public int a;
	private int b;
	protected int c;
	int d;

	public void f1() {

	}

	private void f2() {

	}

	protected void f3() {

	}

	void f4() {

	}

	public static void main(String[] args) {
		E05_AccessControl e05_AccessControl = new E05_AccessControl();
		e05_AccessControl.a = 1;
		e05_AccessControl.b = 2;
		e05_AccessControl.c = 3;
		e05_AccessControl.d = 4;
		e05_AccessControl.f1();
		e05_AccessControl.f2();
		e05_AccessControl.f3();
		e05_AccessControl.f4();
	}
}
