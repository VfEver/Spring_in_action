package com.zys.chapter4;

public class Volunteer implements Thinker {
	private String thought;
	@Override
	public void thinkOfSomething(String thought) {
		this.thought = thought;
	}

	public String getThought() {
		return thought;
	}
}
