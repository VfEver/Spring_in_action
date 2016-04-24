package com.zys.chapter4;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public Audience() {
	}
	public void takeSeat() {
		System.out.println("The audience is taking their seats to the stage!");
	}
	
	public void turnOffCellphone() {
		System.out.println("The audience is turning off their cellphone");
	}
	
	public void applaud() {
		System.out.println("CLAP CLAP CLAP~~~~~");
	}
	
	public void refuse() {
		System.out.println("The audience is very angry!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats to the stage!");
			System.out.println("The audience is turning off their cellphone");
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			System.out.println("CLAP CLAP CLAP~~~");
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		} catch (Throwable e) {
			System.out.println("The audience is very angry!");
		}
	}
}
