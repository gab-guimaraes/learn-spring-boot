package com.gabguimaraes.learnspringboot.jdbc;

import com.gabguimaraes.learnspringboot.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            "INSERT INTO CARS (ID, MAKE, MODEL, CAR_YEAR) VALUES (?,?,?,?)";

    private static String DELETE_QUERY =
            "delete from cars where id=?";

    private static String SELECT_QUERY =
            "select * from cars where id=?";

    //insert into cars(id, make, model, car_year)
    //values(1, 'mitsubishi', 'lancer', 2012);

    public void insert(Car car) {
        jdbcTemplate.update(INSERT_QUERY, car.getId(), car.getMake(), car.getModel(), car.getYear());
    }

    public void deleteById(int id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Car findById(int id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Car.class), id);
    }
}
