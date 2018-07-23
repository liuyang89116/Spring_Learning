package com.yang.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest4 {
    @Test
    public void demo1() {
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println("name: " + car.getName() + "; price: " + car.getPrice());
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        Car2 car = (Car2) applicationContext.getBean("car2");
        System.out.println(car.toString());
    }
}
