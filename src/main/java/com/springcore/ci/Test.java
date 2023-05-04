package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context =
	  		   new ClassPathXmlApplicationContext("com/springcore/ci/config4ci.xml");
	  
	Person p = (Person) context.getBean("person");
	System.out.println(p);
			
	Addition a = (Addition) context.getBean("add");
	System.out.println(a);
	}
	}