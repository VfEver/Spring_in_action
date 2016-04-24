package com.zys.chapter2;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;

	public Instrumentalist() {
	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + ":");
		instrument.play();
	}
	
}
