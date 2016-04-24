package com.zys.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EnglishSay implements SayWord {
	@Autowired
	@Qualifier("english")
	private People people;
	public EnglishSay() {
	}
	public EnglishSay(People people) {
		this.people = people;
	}
	@Override
	public void say() {
		people.sayHello();
		System.out.println("Hello!");
	}

}
