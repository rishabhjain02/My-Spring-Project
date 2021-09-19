package com.example.myproject.staticdemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String registrationNo;
    private String name;
    private String color;
    private long price;
}
