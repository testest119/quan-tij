package TIJ.TIJ05.example;

public class Flower {
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor 2/ int arg only, petalCounter="
				+ petalCount);
	}

	Flower(String ss) {
		System.out.println("Coustructor w/ Syring arg only, s=" + ss);
		s = ss;
	}

	public Flower(String s, int petals) {
		this(petals);
		// this(s); can not call two.
		this.s = s;
		System.out.println("String & int args");
	}

	public Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void printPetalCount() {
		// this(11) not inside non-constructor!
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
