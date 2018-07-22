package com.yang.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {

    @Test
    // Bean 完整生命周期
    public void demo1() {
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        customerService.add();
        customerService.find();

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

}
