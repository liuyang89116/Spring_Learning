package com.yang.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    @Test
    // 无参数的构造方法
    public void testBean1() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        System.out.println("bean1: " + bean1);
    }

    @Test
    // 静态工厂的实例化
    public void testBean2() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println("bean2: " + bean2);
    }

    @Test
    // 实例工厂的实例化
    public void testBean3() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");
        Bean3 bean3 = (Bean3) context.getBean("bean3");
        System.out.println("bean3: " + bean3);
    }
}
