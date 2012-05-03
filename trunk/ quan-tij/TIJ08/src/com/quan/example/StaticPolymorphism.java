package com.quan.example;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	@Override
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper super1 = new StaticSub();
		System.out.println(super1.staticGet());
		System.out.println(super1.dynamicGet());
	}
}
