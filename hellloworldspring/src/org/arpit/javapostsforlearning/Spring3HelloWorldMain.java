package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring3HelloWorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext beanfactory =new ClassPathXmlApplicationContext("Spring3HelloWorld.xml");
		Spring3HelloWorld mybean = (Spring3HelloWorld) beanfactory .getBean("Spring3HelloWorldBean");
		mybean.printHello();

	}

}
