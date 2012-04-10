package com.quan.exercise;

public class E04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (int i = 1; i < 100; i++) {
		// boolean prime = true;
		// for (int j = 2; j < i; j++) {
		// if (i % j == 0) {
		// prime = false;
		// }
		// }
		// if (prime == true) {
		// System.out.println(i + " is shushu");
		// }
		// }
		outer: for (int i = 1; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue outer;
				}
			}
			System.out.println(i + " is shushu");
		}
	}

}
