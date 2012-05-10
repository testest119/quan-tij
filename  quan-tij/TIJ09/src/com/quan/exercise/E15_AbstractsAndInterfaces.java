package com.quan.exercise;

abstract class Abstract {
	String s;

	public Abstract(String s) {
		this.s = s;
	}

	abstract void af();
}

class All2 extends Abstract implements Multipe {

	public All2() {
		super("All2");
	}

	@Override
	public void f1() {
		System.out.println("All.f1");
	}

	@Override
	public void g1() {
		System.out.println("All.g1");
	}

	@Override
	public void f2() {
		System.out.println("All.f2");
	}

	@Override
	public void g2() {
		System.out.println("All.g2");
	}

	@Override
	public void f3() {
		System.out.println("All.f3");
	}

	@Override
	public void g3() {
		System.out.println("All.g3");
	}

	@Override
	public void h() {
		System.out.println("All.h");
	}

	@Override
	void af() {
		System.out.println("All.af");
	}

}

public class E15_AbstractsAndInterfaces {
	static void takes1(Interface1 i) {
		i.f1();
		i.g1();
	}

	static void takes2(Interface2 i) {
		i.f2();
		i.g2();
	}

	static void takes3(Interface3 i) {
		i.f3();
		i.g3();
	}

	static void takesAll(All2 a) {
		a.f1();
		a.g1();
		a.f2();
		a.g2();
		a.f3();
		a.g3();
		a.h();
	}

	static void takesAbstract(Abstract a) {
		a.af();
	}

	public static void main(String[] args) {
		All2 a2 = new All2();
		takes1(a2);
		takes2(a2);
		takes3(a2);
		takesAll(a2);
		takesAbstract(a2);
	}
}
