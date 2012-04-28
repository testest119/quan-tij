package com.quan.exercise;

class A {
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A()");
	}
}

class B {
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B()");
	}
}

class C extends A {
	B b = new B();
}

public class E05_SimpleInheritance {
	public static void main(String[] args) {
		new C();
	}
}
