package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {
	public static void main(String[] args) {
	 ApplicationContext context =
  		   new ClassPathXmlApplicationContext("config3ref.xml");
  
 A a1 = (A) context.getBean("aref");
 
 System.out.println(a1);
}
}