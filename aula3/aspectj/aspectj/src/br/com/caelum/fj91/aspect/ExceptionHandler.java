package br.com.caelum.fj91.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExceptionHandler {
	
	@AfterThrowing(pointcut="execution (* *(*))  && within( br.com.caelum.fj91.modelo.*)", throwing="ex")
	public void handle(JoinPoint jp, RuntimeException ex) throws Throwable {
		System.err.println("ExceptionHandler: " + jp.getSignature());
	}

}
