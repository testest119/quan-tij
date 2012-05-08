package com.quan.example;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	@Override
	public void adjust() {

	}

	@Override
	public String what() {
		return "Wind";
	}
}

class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	@Override
	public String what() {
		return "Percussion";
	}

	@Override
	public void adjust() {

	}
}

class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	@Override
	public void adjust() {
	}

	@Override
	public String what() {
		return "Stringed";
	}
}

class Brass extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	@Override
	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
