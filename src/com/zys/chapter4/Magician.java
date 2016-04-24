package com.zys.chapter4;

public class Magician implements MindReader {
	private String thought;
	@Override
	public void interceptThoughts(String thought) {
		System.out.println("Intercept the volenteer's thoughts");
		this.thought = thought;
	}

	@Override
	public String getThoughts() {
		return thought;
	}

}
