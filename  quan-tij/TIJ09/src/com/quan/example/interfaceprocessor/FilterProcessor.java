package com.quan.example.interfaceprocessor;

import com.quan.example.BandPass;
import com.quan.example.Filter;
import com.quan.example.HighPass;
import com.quan.example.LowPass;
import com.quan.example.Waveform;

class FilterAdapter implements Processor {
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
