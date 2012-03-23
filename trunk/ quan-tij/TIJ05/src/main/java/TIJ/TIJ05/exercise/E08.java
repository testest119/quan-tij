package TIJ.TIJ05.exercise;

public class E08 {
	public void b() {
		System.out.println("b() called.");
	}

	public void a() {
		b();
		this.b();
	}

	public static void main(String[] args) {
		new E08().a();
	}
}
