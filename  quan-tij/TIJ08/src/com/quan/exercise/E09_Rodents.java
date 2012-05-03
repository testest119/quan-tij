package com.quan.exercise;

class Rodent {
	public void hop() {
		System.out.println("Rodent hopping");
	}

	public void scurry() {
		System.out.println("Rodent scurrying");
	}

	public void reproduce() {
		System.out.println("Making more Rodents");
	}

	@Override
	public String toString() {
		return "Rodent";
	}
}

class Mouse extends Rodent {
	public void hop() {
		System.out.println("Mouse hopping");
	}

	public void scurry() {
		System.out.println("Mouse scurrying");
	}

	public void reproduce() {
		System.out.println("Making more Mice");
	}

	@Override
	public String toString() {
		return "Mouse";
	}
}

class Gerbil extends Rodent {
	public void hop() {
		System.out.println("Gerbil hopping");
	}

	public void scurry() {
		System.out.println("Gerbil scurrying");
	}

	public void reproduce() {
		System.out.println("Making more Gerbils");
	}

	@Override
	public String toString() {
		return "Gerbil";
	}
}

class Hamster extends Rodent {
	public void hop() {
		System.out.println("Hamster hopping");
	}

	public void scurry() {
		System.out.println("Hamster scurrying");
	}

	public void reproduce() {
		System.out.println("Making more Hamsters");
	}

	@Override
	public String toString() {
		return "Hamster";
	}
}

public class E09_Rodents {
	public static void main(String[] args) {
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster(), };
		for (Rodent rodent : rodents) {
			rodent.hop();
			rodent.scurry();
			rodent.reproduce();
			System.out.println(rodent);
		}
	}
}
