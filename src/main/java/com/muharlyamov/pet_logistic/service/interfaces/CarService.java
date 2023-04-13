package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Car;

import java.util.List;

public interface CarService {
    public void save(Car car);
    public Car getCar(int id);
    public void delete(Car car);
    public List<Car> getAllCars();
}
