package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appcontext =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 Country countryobj=(Country) appcontext.getBean("Countrybean");
		 String countryName=countryobj.getCountryName();
	     String capitalName=countryobj.getCapital().getCapitalName();
	     System.out.println(capitalName+" is capital of "+countryName);

	}

}
