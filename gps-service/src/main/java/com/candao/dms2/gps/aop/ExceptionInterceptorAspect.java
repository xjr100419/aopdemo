package com.candao.dms2.gps.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *  拦截器  处理异常包装类
 * 
 * @author xiao
 * @date 2017年12月27日 下午7:30:55
 */
@Aspect  
@Component 
public class ExceptionInterceptorAspect {
	
	@Pointcut("execution(* com.candao.dms2.gps.controller..*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void controllerMethodPointcut(){}
	
	@Around("controllerMethodPointcut()")
	public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
		
		long startTime = System.currentTimeMillis();
		
		RspData repData;
		
		try {
			repData = (RspData) pjp.proceed();
			
			System.out.println(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
			
		} catch (Throwable e) {
			repData = handlerException(pjp, e);
			e.printStackTrace();
		}
		
		return repData;
	}
	
	private RspData handlerException(ProceedingJoinPoint pjp, Throwable e) {
		RspData result = new RspData();
		

		return result;
	}
}
