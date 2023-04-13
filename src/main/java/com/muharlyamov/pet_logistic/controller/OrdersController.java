package com.muharlyamov.pet_logistic.controller;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Member;
import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    OrdersFilter filter;

    @Autowired
    OrderService orderService;

    @GetMapping("/")
    public String getHome(){
        return "redirect: /orders";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<Order> allOrders = orderService.getAll();
        model.addAttribute("orders", allOrders);
        model.addAttribute("filter", filter);
        return "index";
    }

    @PostMapping("/orders")
    public String getOrdersByFilters(@ModelAttribute("filter") OrdersFilter filter) {
        List<Order> allOrders = orderService.getAllByFilter(filter);
        return "index";
    }

}
