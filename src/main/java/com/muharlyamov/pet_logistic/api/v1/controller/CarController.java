package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Car;
import com.muharlyamov.pet_logistic.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/car")
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping("all")
    public List<Car> getAll() {
        return service.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable int id) {
        Car car = service.getCar(id);
        if (car == null) {
            throw new NoSuchElementException("There is no such car by ID = " + id);
        }
        return car;
    }

    @PostMapping("/")
    public Car addNew(@RequestBody Car car){
        service.save(car);
        return car;
    }

    @PutMapping("/{id}")
    public Car update(@RequestBody Car car,
                                       @PathVariable int id){
        Car checkCar = service.getCar(id);
        if (checkCar == null){
            throw new NoSuchElementException("There is no such car by ID = " + id);
        }
        car.setId(id);
        service.save(car);
        return car;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        Car car = service.getCar(id);
        if (car == null){
            throw new NoSuchElementException("There is no such car by ID = " + id);
        }
        service.delete(car);
        return "Car by ID = " + id + " was deleted";
    }
}
