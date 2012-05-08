package com.quan.exercise;

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bred()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLanch()");
	}
}

class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich();
	}
}

interface FastFood {
	void rushOrdewr();

	void gobble();
}

class FastSandwich extends Sandwich implements FastFood {

	@Override
	public void rushOrdewr() {
		System.out.println("Rushing your sandwich order");
	}

	@Override
	public void gobble() {
		System.out.println("Chomp! Snort! Gobble!");
	}

}

public class E08_FastFood {
	public static void main(String[] args) {
		FastSandwich burger = new FastSandwich();
		System.out.println("Fires with that?");
		System.out.println("Super Size?");
		burger.rushOrdewr();
		burger.gobble();
	}
}
