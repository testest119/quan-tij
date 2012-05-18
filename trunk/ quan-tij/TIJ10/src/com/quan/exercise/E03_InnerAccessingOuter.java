package com.quan.exercise;

class Outer2 {
	private final String data;

	class Inner {
		@Override
		public String toString() {
			return data;
		}
	}

	public Outer2(String data) {
		this.data = data;
	}

	Inner getInner() {
		return new Inner();
	}
}

public class E03_InnerAccessingOuter {
	public static void main(String[] args) {
		Outer2 o = new Outer2("Inner accessing outer!");
		Outer2.Inner inner = o.getInner();
		// Outer2.Inner inner = o.new Inner();
		System.out.println(inner.toString());
	}
}
