package com.zys.chapter4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnotherAudience {
	/*
	 * 注意！星号后面必须要有空格.
	 */
	@Pointcut("execution(* com.zys.chapter4.Action.startAction(..))")
	public void start() {
	}
	
	@Before("start()")
	public void takeSeat() {
		System.out.println("The audience is taking their seats!");
	}
	
	@AfterReturning("start()")
	public void applaud() {
		System.out.println("The audience is very happy to see this show!");
	}
	
	@AfterThrowing("start()")
	public void disappoint() {
		System.out.println("I want my money back!");
	}
	
	@Around("start()")
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("first~~~~");
			System.out.println("second!!!!");
			joinpoint.proceed();
			System.out.println("finally!");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
