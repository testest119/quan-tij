package com.quan.exercise;

class Base1 {
	public Base1() {
		// TODO Auto-generated constructor stub
		System.out.println("Base1");
	}
}

class Derived1 extends Base1 {
	public Derived1() {
		// TODO Auto-generated constructor stub
		System.out.println("Derived1");
	}
}

class Derived2 extends Derived1 {
	public Derived2() {
		// TODO Auto-generated constructor stub
		System.out.println("Derived2");
	}
}

public class E04_ConstructorOrder {
	public static void main(String[] args) {
		new Derived2();
	}
}
