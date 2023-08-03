package com.gabguimaraes.learnspringboot.jdbc;

import com.gabguimaraes.learnspringboot.model.CarJPA;
import com.gabguimaraes.learnspringboot.springjpa.CarSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsJdbcCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CarJdbcRepository repository;
//
//    @Autowired
//    private CarJpaRepository carJpaRepository;

    @Autowired
    private CarSpringJpaRepository carSpringJpaRepository;

    public CarsJdbcCommandLineRunner() {
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Car(1, "mitsubishi", "lancer", 2012));
//        repository.insert(new Car(2, "subaru", "impreza", 1999));
//        repository.insert(new Car(3, "ferrari", "f40", 1992));
//        repository.insert(new Car(4, "mazda", "rx7", 1995));
//        repository.deleteById(2);
//        System.out.println(repository.findById(1).toString());
        //carJpaRepository.insert(new CarJPA(1, "mitsubishi", "lancer", 2012));
        carSpringJpaRepository.save(new CarJPA(1, "ferrari", "monza", 200));

    }
}
