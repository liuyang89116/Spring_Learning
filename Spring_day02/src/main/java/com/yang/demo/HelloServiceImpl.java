package com.yang.demo;

import lombok.Setter;

public class HelloServiceImpl implements HelloService {
    @Setter
    private String info;

    @Override
    public void sayHello() {
        System.out.println("Hello Spring!" + info);
    }
}
