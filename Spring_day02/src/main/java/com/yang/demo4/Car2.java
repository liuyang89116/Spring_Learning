package com.yang.demo4;

import lombok.Setter;

@Setter
public class Car2 {
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Car2{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
