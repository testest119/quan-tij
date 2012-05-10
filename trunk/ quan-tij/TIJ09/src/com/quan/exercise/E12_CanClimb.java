package com.quan.exercise;

interface CanClimb {
	void climb();
}

class Hero2 extends ActionCharacter implements CanFight, CanSwim, CanFly,
		CanClimb {

	@Override
	public void climb() {
	}

	@Override
	public void fly() {
	}

	@Override
	public void swim() {
	}

}

public class E12_CanClimb {
	static void t(CanFight x) {
		x.fight();
	}

	static void u(CanSwim x) {
		x.swim();
	}

	static void v(CanFly x) {
		x.fly();
	}

	static void z(CanClimb x) {
		x.climb();
	}

	static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero2 hero2 = new Hero2();
		t(hero2);
		u(hero2);
		v(hero2);
		z(hero2);
		w(hero2);
	}
}
