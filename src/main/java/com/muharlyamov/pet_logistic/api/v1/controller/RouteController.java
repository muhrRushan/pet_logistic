package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Route;
import com.muharlyamov.pet_logistic.service.interfaces.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/route")
public class RouteController {
    @Autowired
    private RouteService service;

    @GetMapping("all")
    public List<Route> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Route getById(@PathVariable int id) {
        Route route = service.getRoute(id);
        if (route == null) {
            throw new NoSuchElementException("There is no such route by ID = " + id);
        }
        return route;
    }

    @PostMapping("/")
    public Route addNew(@RequestBody Route route){
        service.save(route);
        return route;
    }

    @PutMapping("/{id}")
    public Route update(@RequestBody Route route,
                                       @PathVariable int id){
        Route checkRoute= service.getRoute(id);
        if (checkRoute == null){
            throw new NoSuchElementException("There is no such route by ID = " + id);
        }
        route.setId(id);
        service.save(route);
        return route;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        Route route = service.getRoute(id);
        if (route == null){
            throw new NoSuchElementException("There is no such route by ID = " + id);
        }
        service.delete(route);
        return "Route by ID = " + id + " was deleted";
    }
}
