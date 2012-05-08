package com.quan.exercise;

import com.quan.example.Note;

abstract class Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	public abstract String toString();
}

class Wind extends Instrument {

	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument {

	@Override
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument {
	@Override
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	@Override
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class E09_AbstractMusic5 {
	static void tune(Instrument i) {
		i.adjust();
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] instruments) {
		for (Instrument instrument : instruments) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
