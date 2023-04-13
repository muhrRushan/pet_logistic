package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Car;

import java.util.List;

public interface CarService {
    void save(Car car);
    Car getCar(int id);
    void delete(Car car);
    List<Car> getAllCars();
}
