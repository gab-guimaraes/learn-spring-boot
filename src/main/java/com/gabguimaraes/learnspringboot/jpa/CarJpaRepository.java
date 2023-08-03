package com.gabguimaraes.learnspringboot.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CarJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(CarJPA carJPA) {
        entityManager.merge(carJPA);
    }
    public CarJPA findById(int id) {
        return  entityManager.find(CarJPA.class, id);
    }
    public void deleteById(int id) {
        CarJPA carJPA = findById(id);
        entityManager.remove(carJPA);
    }

}
