package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =
    		   new ClassPathXmlApplicationContext("config.xml");
    
    Student stud1 = (Student) context.getBean("student1");
    Student stud2 = (Student) context.getBean("student2");
   System.out.println(stud1);
   System.out.println(stud2);
    }
}
