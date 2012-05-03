package com.quan.exercise;

import com.quan.example.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play()" + n);
	}

	@Override
	public String toString() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	@Override
	public String toString() {
		return "Percussion";
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	@Override
	public String toString() {
		return "Stringed";
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	@Override
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	@Override
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class E06_MusicToString {
	static Instrument[] orchestra = { new Wind(), new Percussion(),
			new Stringed(), new Brass(), new Woodwind() };

	public static void printAll(Instrument[] orch) {
		for (Instrument instrument : orch) {
			System.out.println(instrument);
		}
	}

	public static void main(String[] args) {
		printAll(orchestra);
	}
}
