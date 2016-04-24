package com.zys.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zys.chapter3.Dog;
import com.zys.chapter3.SayWord;

public class Chapter3Test {

	@Test
	public void testChineseSay() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-annotation.xml");
		SayWord china = (SayWord) ctx.getBean("china");
		china.say();
		SayWord england = (SayWord) ctx.getBean("england");
		england.say();
	}
	
	@Test
	public void testAmericanSay() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-annotation.xml");
		SayWord americ = (SayWord) ctx.getBean("americ");
		americ.say();
	}
	
	@Test
	public void testDog() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-java.xml");
		Dog whiteDog = (Dog) ctx.getBean("whiteDog");
		whiteDog.bark();
		
		Dog blackDog = (Dog) ctx.getBean("blackDog");
		blackDog.bark();
	}
}