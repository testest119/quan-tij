package com.quan.exercise;

class ImplementInterface implements AnInterface {
	public void f() {
		System.out.println("ImplementInterface.f");
	}

	@Override
	public void g() {
		System.out.println("ImplementInterface.g");
	}

	@Override
	public void h() {
		System.out.println("ImplementInterface.h");
	}
}

public class E05_ImplementInterface {
	public static void main(String[] args) {
		AnInterface anInterface = new ImplementInterface();
		anInterface.f();
		anInterface.g();
		anInterface.h();
	}
}
