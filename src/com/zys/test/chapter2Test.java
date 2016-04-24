package com.zys.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zys.chapter2.Auditorium;
import com.zys.chapter2.Instrumentalist;
import com.zys.chapter2.OneManBand;
import com.zys.chapter2.PerformanceException;
import com.zys.chapter2.Performer;
import com.zys.chapter2.PoeticJuggler;
import com.zys.chapter2.Stage;

public class chapter2Test {

	@Test
	public void testJuggler() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPoeticJuggler() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("poticDuke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testStage() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Stage stage = (Stage)ctx.getBean("stage");
	}
	
	@Test
	public void testAuditorium() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");
	}
	
	@Test
	public void testInstrumentalist() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny");
		try {
			instrumentalist.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	} 
	
	@Test
	public void testNamespace() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Instrumentalist kenny3 = (Instrumentalist) ctx.getBean("kenny3");
		try {
			kenny3.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOneManBand() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		OneManBand hank = (OneManBand) ctx.getBean("hank");
		hank.perform();
	}
	
	@Test
	public void testAutoWireByName() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny4");
		try {
			instrumentalist.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAutoWireByType() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny5");
		try {
			instrumentalist.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAutoWireConstructor() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLutil/spring-idol.xml");
		PoeticJuggler duke2 = (PoeticJuggler) ctx.getBean("duke2");
		try {
			duke2.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
}
