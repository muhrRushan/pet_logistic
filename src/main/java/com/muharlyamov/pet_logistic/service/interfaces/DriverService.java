package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Driver;

import java.util.List;

public interface DriverService {
    void save(Driver driver);
    void delete(Driver driver);
    List<Driver> getAll();

    Driver getDriver(int id);
}
