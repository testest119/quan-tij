package com.quan.exercise;

import com.quan.example.Note;

interface Instrument2 {
	void adjust();
}

interface Playable {
	void play(Note n);
}

class Wind2 implements Instrument2, Playable {
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
		return "Wind2";
	}
}

class Percussion2 implements Instrument2, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed2 implements Instrument2, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass2 extends Wind2 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind2 extends Wind2 {
	public String toString() {
		return "Woodwind";
	}
}

public class E10_PlayableMusic5 {
	static void tune(Playable p) {
		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] playables) {
		for (Playable playable : playables) {
			tune(playable);
		}
	}

	public static void main(String[] args) {
		Playable[] orchestra = { new Wind2(), new Percussion2(),
				new Stringed2(), new Brass2(), new Woodwind2() };
		tuneAll(orchestra);
	}
}
