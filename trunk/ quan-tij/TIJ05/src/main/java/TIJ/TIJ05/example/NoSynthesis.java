package TIJ.TIJ05.example;

class Bird2 {
	Bird2(int i) {

	}

	Bird2(double d) {

	}
}

public class NoSynthesis {
	Bird2 bird2 = new Bird2(1);
	Bird2 bird22 = new Bird2(1.0);
	//Bird2 bird23 = new Bird2(); No default
}
