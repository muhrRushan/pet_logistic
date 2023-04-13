package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Car;
import com.muharlyamov.pet_logistic.entity.Driver;

import java.util.List;

public interface CarDAO {
    public void save(Car car);
    public Car getCar(int id);
    public void delete(Car car);
    public List<Car> getAllCars();
}
