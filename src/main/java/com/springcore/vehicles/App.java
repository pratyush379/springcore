package com.springcore.vehicles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configVehicle.xml");

        Vehicle vehicle = (Vehicle) applicationContext.getBean("vehicle");
        
        vehicle.run();
        
        //Annotation based configuration
        
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("configVehicle2Annotation.xml");

        Vehicle vehicle2 = (Vehicle) applicationContext2.getBean("car");
        
        vehicle.run();
    }
}
