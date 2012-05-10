package com.quan.example;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drikBlood();
}

class VeryBadVampire implements Vampire {
	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void kill() {

	}

	@Override
	public void drikBlood() {

	}
}

public class HorrorShow {
	static void u(Monster m) {
		m.menace();
	}

	static void v(DangerousMonster dm) {
		dm.menace();
		dm.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
