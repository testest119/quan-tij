package com.quan.exercise;

public class E09_2 {
	static int fib(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fib(n - 2) + fib(n - 1);
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(fib(i) + ",");
		}
	}
}
