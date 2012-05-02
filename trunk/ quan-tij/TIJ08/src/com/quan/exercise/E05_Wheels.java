package com.quan.exercise;

public class E05_Wheels {
	public static void ride(Cycle c) {
		System.out.println("Num. of wheels: " + c.wheels());
	}

	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}
}
