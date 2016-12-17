package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LoggingTools {

	
	/**
	 * 前置通知
	 * @param joinpoint
	 */
	public void beforeLog(JoinPoint joinpoint){
		Signature sign = joinpoint.getSignature();
		System.out.println(" 前置通知 beforeAdvice ... "+sign.getName()+" params ... "+joinpoint.getArgs());
	}
	
	/**
	 * 后置通知 (即使有无异常都回执行，大致上等于java里的finally块)
	 * @param jp
	 */
	public void afterLog(JoinPoint jp){
		System.out.println(" 后置通知 afterAdvice ... "+jp.getSignature().getName());
	}
	
	/**
	 * 返回通知：相当于调用方法成功获取到返回值
	 * @param jp
	 * @param result
	 */
	public void afterReturningLog(JoinPoint jp,Object result){
		System.out.println(" 返回通知 afterReturingAdvice ... "+jp.getSignature().getName()+" the result is "+result);
	}
	
	/**
	 * 异常通知：运行异常触发一下事件，大致相当于catch块
	 * @param jp
	 * @param e
	 */
	public void afterThrowingLog(JoinPoint jp,Exception e){
		System.out.println(" 异常通知 afterThrowingAdvice ... "+jp.getSignature().getName()+" exception is ... "+e);
	}
	
	
	
	/**
	 * 环绕通知，是上面4种通知的完整版本
	 * 能够实现上面所有通知功能
	 * 参数使用proceedingJoinPoint
	 * @param pjd
	 * @return 
	 */
	/*public Object aroundLog(ProceedingJoinPoint pjd){
		Signature sign = pjd.getSignature();
		Object[] args = pjd.getArgs();
		Object result = null;
		try {
			System.out.println(" 前置通知 beforeAdvice ... "+sign.getName());
			
			//if(args[0] instanceof User){
				//return 0;
			//}
			
			result = pjd.proceed();//调用方法。。。
			System.out.println(" 返回通知 afterReturingAdvice ... "+sign.getName()+" the result is "+result);
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(" 异常通知 afterThrowingAdvice ... "+sign.getName()+" exception is ... "+e);
			throw new RuntimeException(e);
		} finally{
			System.out.println(" 后置通知 afterAdvice ... "+sign.getName());
		}
		
		return result;
	}*/
	
	
}

