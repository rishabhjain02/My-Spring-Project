package com.example.myproject.staticdemo.controller;

import com.example.myproject.staticdemo.service.CarService;
import com.example.myproject.staticdemo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Autowired private CarService carService;

    public void saveCar() {
        String registrationNo = "UP20AW2345";
        String color = "Black";
        Car car = carService.addCar(registrationNo, color);
        System.out.println(car);
    }
}
