package exercise;

import exercise.local.E05_AccessControl;

public class E05_Other {
	public E05_Other() {
		E05_AccessControl e05_AccessControl = new E05_AccessControl();
		e05_AccessControl.a = 1;
		//! e05_AccessControl.b=2; //Can't access: private
		//! e05_AccessControl.c = 3;  //Can't access: protected
		//! e05_AccessControl.d = 4; //Can't access: package
		e05_AccessControl.f1();
		//! e05_AccessControl.f2(); //Can't access: private
		//! e05_AccessControl.f3(); //Can't access: protected
		//! e05_AccessControl.f4(); //Can't access: package
	}
}
