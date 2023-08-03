package com.gabguimaraes.learnspringboot;

import com.gabguimaraes.learnspringboot.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {

    @RequestMapping("/cars")
    public List<Car> retrieveAllCars() {
        return Arrays.asList(
                new Car(1,"Ferrari", "F40", 1992),
                new Car(2,"subaru", "impreza", 1999),
                new Car(3,"mitsubishi", "lancer", 2005));
    }



}

