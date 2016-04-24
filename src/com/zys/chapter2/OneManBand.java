package com.zys.chapter2;

import java.util.*;
public class OneManBand implements Performer{
	Collection<Instrument> instruments;

	public OneManBand() {
	}
	
	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public void perform() {
		System.out.println("This is one man's show!");
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}
	
}
