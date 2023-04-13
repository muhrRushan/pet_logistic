package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Car;
import com.muharlyamov.pet_logistic.entity.Driver;

import java.util.List;

public interface CarDAO {
    void save(Car car);
    Car getCar(int id);
    void delete(Car car);
    List<Car> getAllCars();
}
