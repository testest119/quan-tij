package TIJ.TIJ05.example;

class Rock2 {
	Rock2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Rock " + i + " ");
	}
}

public class SimpleConstructor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			new Rock();
			new Rock2(i);
		}
	}

}
