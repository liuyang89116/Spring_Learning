package com.yang.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
    @Test
    // 传统方式
    public void demo1() {
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHello();
    }

    @Test
    // Spring method
    public void demo2() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.sayHello();
    }

}
