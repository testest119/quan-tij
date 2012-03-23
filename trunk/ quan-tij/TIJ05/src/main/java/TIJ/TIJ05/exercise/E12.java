package TIJ.TIJ05.exercise;

class Tank {
	String status = "empty";

	public Tank(String status) {
		this.status = status;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		if (this.status != "empty") {
			System.out.println("Error,a tank is not empty!");
		}
	}
}

public class E12 {
	public static void main(String[] args) {
		new Tank("empty");
		new Tank("full");
		new Tank("half");
		System.gc();
	}
}
