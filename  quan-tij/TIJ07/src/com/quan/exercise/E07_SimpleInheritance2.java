package com.quan.exercise;

class A2 {
	public A2(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("A2(): " + s);
	}
}

class B2 {
	public B2(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("B2(): " + s);
	}
}

class C2 extends A2 {
	B2 b2;

	public C2(String s) {
		super(s);
		b2 = new B2(s);
	}
}

public class E07_SimpleInheritance2 {
	public static void main(String[] args) {
		new C2("Init string");
	}
}
