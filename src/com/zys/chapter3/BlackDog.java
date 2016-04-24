package com.zys.chapter3;

public class BlackDog implements Dog {
	private Cat cat;
	
	public BlackDog() {
	}
	public BlackDog(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void bark() {
		System.out.println("I am black dog and I hate the "+cat.toString());
	}

}
