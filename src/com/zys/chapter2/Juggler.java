package com.zys.chapter2;

public class Juggler implements Performer {
	private int beanBags;
	public Juggler() {
		
	}
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Juggling " + beanBags + " beanbags!");
	}

}
