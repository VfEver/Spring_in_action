package com.zys.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChineseSay implements SayWord {
	@Autowired
	@Qualifier("chinese")
	private People people;
	public ChineseSay() {
	}
	public ChineseSay(People people) {
		this.people = people;
	}
	public void say() {
		people.sayHello();
		System.out.println("nihao!");
	}

}
