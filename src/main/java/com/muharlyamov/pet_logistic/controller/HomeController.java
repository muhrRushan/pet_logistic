package com.muharlyamov.pet_logistic.controller;

import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/")
    public String getHomePage() {
        List<Order> allOrders = orderService.getAll();
        System.out.println(allOrders);
        System.out.println(allOrders.size());
        return "index";
    }
}
