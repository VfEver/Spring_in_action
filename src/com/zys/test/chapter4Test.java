package com.zys.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zys.chapter4.Action;
import com.zys.chapter4.AnotherAudience;
import com.zys.chapter4.Audience;
import com.zys.chapter4.Contestant;
import com.zys.chapter4.MindReader;
import com.zys.chapter4.Thinker;

public class chapter4Test {

	@Test
	public void testAOP() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-aop.xml");
		Action action = (Action) ctx.getBean("action");
		try {
			action.startAction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAround() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-aop.xml");
		Audience audience = (Audience) ctx.getBean("audience");
		audience.watchPerformance(null);    //此处会跑出nullpointerexception异常，导致catch语句执行
	} 
	
	@Test
	public void testArgs() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-aop.xml");
		Thinker thinker = (Thinker) ctx.getBean("volunteer");
		thinker.thinkOfSomething("I want to marray you!");
		MindReader mindreader = (MindReader) ctx.getBean("magician");
		System.out.println(mindreader.getThoughts());
	}
	
	@Test
	public void testNewFunction() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-aop.xml");
		Contestant mindReader = (Contestant) ctx.getBean("magician2");
		mindReader.receiveAward();
	}
	
	@Test
	public void testAspectj() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-aspectj.xml");
		Action action = (Action) ctx.getBean("action");
		try {
			action.startAction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
