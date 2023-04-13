package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.DriverDAO;
import com.muharlyamov.pet_logistic.entity.Driver;
import com.muharlyamov.pet_logistic.service.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverDAO driverDAO;

    @Transactional
    @Override
    public void save(Driver driver) {
        driverDAO.save(driver);
    }

    @Transactional
    @Override
    public void delete(Driver driver) {
        driverDAO.delete(driver);
    }

    @Transactional
    @Override
    public List<Driver> getAll() {
        return driverDAO.getAll();
    }

    @Transactional
    @Override
    public Driver getDriver(int id) {
        return driverDAO.getDriver(id);
    }
}
