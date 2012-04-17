package source;

public class ScreenCalc {

	private IScreen screen;

	public ScreenCalc(IScreen screen) {
		this.screen = screen;
	}

	public void add(int i, int j) {
		String result = i +"+"+j+"="+(i+j);
		screen.println(result);
	}
}
