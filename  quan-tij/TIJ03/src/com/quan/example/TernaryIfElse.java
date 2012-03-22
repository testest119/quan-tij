package com.quan.example;

public class TernaryIfElse {

	/**
	 * @param args
	 */
	static int ternary(int i) {
		return i < 10 ? 1 * 100 : i * 10;
	}

	static int standardIfElse(int i) {
		if (i < 10) {
			return i * 100;
		} else {
			return i * 10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ternary(9));
		System.out.println(ternary(10));
		System.out.println(standardIfElse(9));
		System.out.println(standardIfElse(10));
	}
}
