package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Driver;

import java.util.List;

public interface DriverDAO {
    void save(Driver driver);
    void delete(Driver driver);
    List<Driver> getAll();

    Driver getDriver(int id);
}
