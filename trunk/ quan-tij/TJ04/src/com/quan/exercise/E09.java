package com.quan.exercise;

public class E09 {
	static public void fib(int n) {
		switch (n) {
		case 1:
			System.out.print("1");
			break;
		case 2:
			System.out.print("1 1");
			break;

		default:
			System.out.print("1 1 ");
			int last1 = 1,
			last2 = 1;
			for (int i = 3; i <= n; i++) {
				int now = last1 + last2;
				last1 = last2;
				last2 = now;
				System.out.print(" " + now + " ");
			}
			break;
		}
	}

	public static void main(String[] args) {
		fib(10);
	}
}
