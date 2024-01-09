package com.springcore.vehicles;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
