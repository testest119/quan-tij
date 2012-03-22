package com.quan.exercise;

public class E07 {

	static void increment() {
		StaticTest.i++;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E07 e07 = new E07();
		e07.increment();
		E07.increment();
		increment();
	}

}

class StaticTest {
	static int i = 47;
}
