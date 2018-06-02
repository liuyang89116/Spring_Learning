package com.yang.demo1;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("Hello, Spring is ready");
    }
}
