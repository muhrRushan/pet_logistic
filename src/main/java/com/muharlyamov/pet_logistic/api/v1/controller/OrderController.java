package com.muharlyamov.pet_logistic.api.v1.controller;

import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping("all")
    public List<Order> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable int id) {
        Order order = service.getOrder(id);
        if (order == null) {
            throw new NoSuchElementException("There is no such order by ID = " + id);
        }
        return order;
    }

    @PostMapping("/")
    public Order addNew(@RequestBody Order order){
        service.save(order);
        return order;
    }

    @PutMapping("/{id}")
    public Order update(@RequestBody Order order,
                                       @PathVariable int id){
        Order checkOrder = service.getOrder(id);
        if (checkOrder == null){
            throw new NoSuchElementException("There is no such order by ID = " + id);
        }
        order.setId(id);
        service.save(order);
        return order;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        Order order = service.getOrder(id);
        if (order == null){
            throw new NoSuchElementException("There is no such order by ID = " + id);
        }
        service.delete(order);
        return "Order by ID = " + id + " was deleted";
    }
}
