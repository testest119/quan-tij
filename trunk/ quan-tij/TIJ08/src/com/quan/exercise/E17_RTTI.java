package com.quan.exercise;

public class E17_RTTI {
	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] { new Unicycle(), new Bicycle(),
				new Tricycle() };
		// Compile time: method not found in Cycle
		// cycles[0].balance();
		// cycles[1].balance();
		// cycles[2].balance();
		((Unicycle) cycles[0]).balance();
		((Bicycle) cycles[1]).balance();
		((Unicycle) cycles[2]).balance(); //Exception throw
	}
}
