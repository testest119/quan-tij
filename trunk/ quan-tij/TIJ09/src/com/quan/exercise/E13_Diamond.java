package com.quan.exercise;

interface BaseInterface {
	void f();
}

interface IntermediateInterface1 extends BaseInterface {
	@Override
	public void f();
}

interface IntermediateInterface2 extends BaseInterface {
	@Override
	public void f();
}

interface CombinedInterface extends IntermediateInterface1,
		IntermediateInterface2 {
	@Override
	public void f();
}

class CombinedImpl implements CombinedInterface {
	@Override
	public void f() {
		System.out.println("CombinedImpl.f()");
	}
}

public class E13_Diamond {
	public static void main(String[] args) {
		new CombinedImpl().f();
	}
}
