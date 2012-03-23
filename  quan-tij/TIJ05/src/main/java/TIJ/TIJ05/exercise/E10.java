package TIJ.TIJ05.exercise;

public class E10 {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize() called");
	}

	public static void main(String[] args) {
		new E10();
	}
}
