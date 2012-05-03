package com.quan.exercise;

import com.quan.example.Note;

class Electronic extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Electronic.play()" + n);
	}

	@Override
	public String toString() {
		return "Electronic";
	}
}

public class E07_NewInstrument {
	static Instrument[] orchestra = { new Wind(), new Percussion(),
			new Stringed(), new Brass(), new Woodwind(), new Electronic() };

	public static void main(String[] args) {
		for (Instrument i : orchestra) {
			i.play(Note.MIDDLE_C);
			i.adjust();
			System.out.println(i);
		}
	}
}
