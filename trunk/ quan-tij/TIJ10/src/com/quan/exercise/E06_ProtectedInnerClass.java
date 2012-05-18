package com.quan.exercise;

import com.quan.exercise.e6a.SimpleInterface;
import com.quan.exercise.e6b.SimpleClass;

public class E06_ProtectedInnerClass extends SimpleClass {
	public SimpleInterface get() {
		return new Inner();
	}

	public static void main(String[] args) {
		new E06_ProtectedInnerClass().get().f();
	}
}
