package com.quan.exercise;

class BaseNonDefault {
	public BaseNonDefault(int i) {

	}
}

class DerivedTwoConstructors extends BaseNonDefault {
	public DerivedTwoConstructors() {
		super(47);
	}

	public DerivedTwoConstructors(int i) {
		super(47);
	}
}

public class E08_CallBaseConstructor {
	public static void main(String[] args) {
		new DerivedTwoConstructors();
		new DerivedTwoConstructors(74);
	}
}
