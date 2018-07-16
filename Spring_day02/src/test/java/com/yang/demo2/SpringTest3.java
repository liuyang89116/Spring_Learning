package com.yang.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {

    @Test
    // 测试 scope
    public void demo1() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");

        Customer c1 = (Customer) context.getBean("customer");
        System.out.println("c1 地址： " + c1);

        Customer c2 = (Customer) context.getBean("customer");
        System.out.println("c2 地址： " + c2);
    }

    @Test
    // 测试初始化和销毁
    public void demo2() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("Config/applicationContext.xml");

        Product p1 = (Product) context.getBean("product");

        // 必须关闭工厂才可以销毁 bean
        context.close();
    }

}
