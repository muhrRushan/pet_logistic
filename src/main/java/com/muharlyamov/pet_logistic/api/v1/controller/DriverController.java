package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Driver;
import com.muharlyamov.pet_logistic.service.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/driver")
public class DriverController {
    @Autowired
    private DriverService service;

    @GetMapping("all")
    public List<Driver> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Driver getById(@PathVariable int id) {
        Driver driver = service.getDriver(id);
        if (driver == null) {
            throw new NoSuchElementException("There is no such driver by ID = " + id);
        }
        return driver;
    }

    @PostMapping("/")
    public Driver addNew(@RequestBody Driver driver){
        service.save(driver);
        return driver;
    }

    @PutMapping("/{id}")
    public Driver update(@RequestBody Driver driver,
                                       @PathVariable int id){
        Driver checkDriver = service.getDriver(id);
        if (checkDriver == null){
            throw new NoSuchElementException("There is no such driver by ID = " + id);
        }
        driver.setId(id);
        service.save(driver);
        return driver;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        Driver driver = service.getDriver(id);
        if (driver == null){
            throw new NoSuchElementException("There is no such driver by ID = " + id);
        }
        service.delete(driver);
        return "Driver by ID = " + id + " was deleted";
    }
}
