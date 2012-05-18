package com.quan.exercise;

class Outer4 {
	class Inner {
		private int j;

		private void h() {
			System.out.println("Inner.h called");
			System.out.println("Inner.j = " + j);
		}
	}

	public void testInnerAccess() {
		Inner i = new Inner();
		i.j = 47;
		i.h();
	}
}

public class E08_OutAccessingInner {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.testInnerAccess();
	}
}
