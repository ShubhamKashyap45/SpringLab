package com.demo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("before getbean");
		HelloWorld hw = (HelloWorld)ctx.getBean("hwbean");
		System.out.println("After getbean");
		hw.sayHello();
		
		

	}

}
