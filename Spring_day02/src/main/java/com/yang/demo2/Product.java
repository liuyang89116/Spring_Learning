package com.yang.demo2;

public class Product {
    private String name;

    public void setup() {
        System.out.println("初始化方法执行...");
    }

    public void teardown() {
        System.out.println("销毁方法执行...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
