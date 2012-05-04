package com.quan.exercise;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}

	@Override
	public String toString() {
		return "Shared " + id;
	}

	@Override
	protected void finalize() throws Throwable {
		if (refcount != 0) {
			System.out.println("Error: object is not properly cleaned-up!");
		}
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	@Override
	public String toString() {
		return "Composing " + id;
	}
}

public class E13_VerifiedRefCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for (Composing composing : composings) {
			composing.dispose();
		}
		System.gc();
		new Composing(new Shared());
		System.gc();
	}
}
