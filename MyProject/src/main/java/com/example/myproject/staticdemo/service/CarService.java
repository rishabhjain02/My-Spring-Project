package com.example.myproject.staticdemo.service;

import com.example.myproject.staticdemo.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car addCar(String registrationNo, String color) {
        return Car.builder()
                .registrationNo(registrationNo)
                .name("Tata SUV")
                .color(color)
                .price(1500000L)
                .build();
    }
}
