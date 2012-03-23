package TIJ.TIJ05.exercise;

public class E11 {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize() called");
	}

	public static void main(String[] args) {
		new E11();
		System.gc();
		System.runFinalization();
	}
}
