package com.zys.chapter3;

public class People {
	String kind;
	
	public People(){
	}
	public People(String kind) {
		this.kind = kind;
	}
	
	public void sayHello() {
		System.out.println("This is " + kind + " saying:");
	}
}
