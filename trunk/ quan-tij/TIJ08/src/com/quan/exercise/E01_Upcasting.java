package com.quan.exercise;

class Cycle {
	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {
	@Override
	public int wheels() {
		return 1;
	}

	public void balance() {

	}
}

class Bicycle extends Cycle {
	@Override
	public int wheels() {
		return 2;
	}

	public void balance() {

	}
}

class Tricycle extends Cycle {
	@Override
	public int wheels() {
		return 3;
	}
}

public class E01_Upcasting {
	public static void ride(Cycle c) {
	}

	public static void main(String[] args) {
		ride(new Cycle());
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}
}
