package org.vtl.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.vtl.beans.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===========ApplicationContext started================");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Car bean =context.getBean(Car.class);
		bean.drive();
	}

}
