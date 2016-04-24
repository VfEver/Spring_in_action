package com.zys.chapter3;

import javax.annotation.Resource;

public class AmericanSay implements SayWord {
	
	@Resource(name="american")
	People people;
	
	public AmericanSay() {
	}
	public AmericanSay(People people) {
		this.people = people;
	}
	@Override
	public void say() {
		people.sayHello();
		System.out.println("He is an American!");
	}

}
