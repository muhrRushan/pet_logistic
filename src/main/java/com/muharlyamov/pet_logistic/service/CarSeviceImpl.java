package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.CarDAO;
import com.muharlyamov.pet_logistic.entity.Car;
import com.muharlyamov.pet_logistic.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarSeviceImpl implements CarService {

    @Autowired
    CarDAO carDAO;

    @Transactional
    @Override
    public void save(Car car) {
        carDAO.save(car);
    }

    @Transactional
    @Override
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Transactional
    @Override
    public void delete(Car car) {
        carDAO.delete(car);
    }

    @Transactional
    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
