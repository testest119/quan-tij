package com.quan.example;

class Letter {
	char c;
}

public class PassObject {

	static void f(Letter letter) {
		letter.c = 'z';
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter letter = new Letter();
		letter.c = 'a';
		System.out.println("1: letter.c= " + letter.c);
		f(letter);
		System.out.println("2: letter.c= " + letter.c);
	}

}
