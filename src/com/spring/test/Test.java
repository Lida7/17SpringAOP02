package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.contoller.UserController;
import com.spring.vo.User;

public class Test {
	
	/**
	 * Spring AOP 使用方法(xml形式)
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//通过springioc获取bean
		UserController ctrl = (UserController) ctx.getBean("userController");
		//调用bean方法
		ctrl.saveUser(new User("Super Man", 20));
		//测试异常通知：ctrl.saveUser(new User("Super Man", 20));
	}
}
