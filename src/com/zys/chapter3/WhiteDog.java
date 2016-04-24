package com.zys.chapter3;

public class WhiteDog implements Dog {
	private Cat cat;
	
	public WhiteDog() {
	}
	
	public WhiteDog(Cat cat) {
		this.cat = cat;
	}
	@Override
	public void bark() {
		System.out.println("I am white dog and I hate the "+ cat.toString());
	}

}
