package test;

import source.IScreen;

public class MockScreen implements IScreen {

	private String screenLine;;

	public String seeScreen() {
		return screenLine;
	}

	@Override
	public void println(String result) {
		screenLine = result;
		
	}

}
