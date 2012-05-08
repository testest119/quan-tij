package com.quan.example;

interface Instrument1 {
	// Compile-time constant
	int Value = 5; // static & final

	// Cannot have method definitions
	void play(Note n);

	void adjust();
}

class Wind1 implements Instrument1 {
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion1 implements Instrument1 {
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Percussion1";
	}
}

class Stringed1 implements Instrument1 {
	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Stringed1";
	}
}

class Brass1 extends Wind1 {
	@Override
	public String toString() {
		return "Brass";
	}
}

class Woodwind1 extends Wind1 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind1";
	}
}

public class Music5 {
	static void tune(Instrument1 i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument1[] e) {
		for (Instrument1 instrument1 : e) {
			tune(instrument1);
		}
	}

	public static void main(String[] args) {
		Instrument1[] orchestra = { new Wind1(), new Stringed1(),
				new Percussion1(), new Brass1(), new Woodwind1() };
		tuneAll(orchestra);
	}
}
