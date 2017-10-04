package br.com.caelum.fj91.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {
	
	@Around("execution (public * *.get*(..)) && within( br.com.caelum.fj91.modelo.*)")
	public Object around(ProceedingJoinPoint jp) throws Throwable {

		System.out.println("antes do getter - around pointcut");

		// continua
		Object retorno = jp.proceed();

		System.out.println("depois do getter - around pointcut");
		
		return retorno;
	}
}
