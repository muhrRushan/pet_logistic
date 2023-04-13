package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Driver;

import java.util.List;

public interface DriverDAO {
    public void save(Driver driver);
    public void delete(Driver driver);
    public List<Driver> getAll();

    public Driver getDriver(int id);
}
