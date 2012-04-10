package com.quan.exercise;

public class E06 {
	static boolean test(int testval, int begin, int end) {
		if (testval >= begin && testval <= end) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(5, 7, 10));
		System.out.println(test(6, 5, 10));
	}

}
