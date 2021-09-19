package com.example.myproject.staticdemo;

import com.example.myproject.staticdemo.controller.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Tester {

    @Autowired private CarController carController;

    @PostConstruct
    public void test() {
        carController.saveCar();
    }
}
