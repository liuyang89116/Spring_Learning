package com.yang.demo;

import com.yang.demo1.AppConfig;
import com.yang.demo1.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloServiceTest {
    @Test
    public void demo() {
        // 创建工厂类
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.sayHello();
    }

}
