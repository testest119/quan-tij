package exercise.local;

public class E05_Other {
	public E05_Other() {
		E05_AccessControl e05_AccessControl = new E05_AccessControl();
		e05_AccessControl.a = 1;
		// ! e05_AccessControl.b=2; //Can't access: private
		e05_AccessControl.c = 3;
		e05_AccessControl.d = 4;
		e05_AccessControl.f1();
		// ! e05_AccessControl.f2(); //Can't access: private
		e05_AccessControl.f3();
		e05_AccessControl.f4();
	}
}
