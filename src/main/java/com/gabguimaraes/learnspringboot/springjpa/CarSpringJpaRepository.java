package com.gabguimaraes.learnspringboot.springjpa;

import com.gabguimaraes.learnspringboot.model.CarJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarSpringJpaRepository extends JpaRepository<CarJPA, Integer> {

}
