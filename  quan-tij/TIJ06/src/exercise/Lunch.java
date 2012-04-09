package exercise;

class Soup1 {
	private Soup1() {

	}

	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {

	}

	private static Soup2 soup2 = new Soup2();

	public static Soup2 access() {
		return soup2;
	}

	public void f() {

	}
}

public class Lunch {
	void testPrivate() {
		// ! Soup1 soup1 = new Soup1(); Can't do this! Private constructor;
	}

	void testStatic() {
		Soup1 soup1 = Soup1.makeSoup();
	}

	void testSingleton() {
		Soup2.access().f();
	}
}
