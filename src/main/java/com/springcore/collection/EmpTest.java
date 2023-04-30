package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Employee;

public class EmpTest {
	public static void main( String[] args )
    {
       ApplicationContext context =
    		   new ClassPathXmlApplicationContext("config2collection.xml");
    
    Employee emp1 = (Employee) context.getBean("emp1");
   
   System.out.println(emp1);
    }


}
