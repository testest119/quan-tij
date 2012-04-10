package com.quan.exercise;

import java.util.Random;

public class E02 {
	static Random random = new Random(47);

	public static void compare() {
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("a = " + a + "b = " + b);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println(" a= b");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 25; i++) {
			compare();
		}
	}
}
