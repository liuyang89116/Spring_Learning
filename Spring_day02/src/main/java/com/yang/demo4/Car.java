package com.yang.demo4;

import lombok.Getter;

@Getter
public class Car {
    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
