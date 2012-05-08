package com.quan.example.music3;

import com.quan.example.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play()" + n);
	}

	String what() {
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

	String what() {
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
	String what() {
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
	String what() {
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
	String what() {
		return "Woodwind";
	}
}

public class music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
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