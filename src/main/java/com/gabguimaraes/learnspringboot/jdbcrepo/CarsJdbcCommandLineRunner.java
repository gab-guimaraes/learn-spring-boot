package com.gabguimaraes.learnspringboot.jdbcrepo;

import com.gabguimaraes.learnspringboot.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Car(1, "mitsubishi", "lancer", 2012));
        repository.insert(new Car(2, "subaru", "impreza", 1999));
        repository.insert(new Car(3, "ferrari", "f40", 1992));
        repository.insert(new Car(4, "mazda", "rx7", 1995));
        repository.deleteById(2);
        System.out.println(repository.findById(1).toString());

    }
}
