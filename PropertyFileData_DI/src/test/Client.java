package test;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import beans.CP;


public class Client {
public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");

	///////////////
	
	CP cp=(CP)ap.getBean("cp");
	cp.createConnection();
}
}

