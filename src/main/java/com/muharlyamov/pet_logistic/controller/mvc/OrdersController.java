package com.muharlyamov.pet_logistic.controller.mvc;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.entity.enums.OrderStatus;
import com.muharlyamov.pet_logistic.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping(value = "/orders", produces = "text/html; charset=utf-8")
    public String getOrders(Model model) {
        List<Order> allOrders = orderService.getAll();
        model.addAttribute("orders", allOrders);
        model.addAttribute("statusList", OrderStatus.getStatusListForSelect());
        model.addAttribute("filter", filter);

        return "index";
    }

    @GetMapping(value = "/clearFilters", produces = "text/html; charset=utf-8")
    public String clearFilters(Model model) {
        return "redirect: /orders";
    }

    @PostMapping(value = "/orders", produces = "text/html; charset=utf-8")
    public String getOrdersByFilters(@ModelAttribute("filter") OrdersFilter filter, Model model) {
        List<Order> allOrders = orderService.getAllByFilter(filter);
        model.addAttribute("orders", allOrders);
        model.addAttribute("statusList", OrderStatus.getStatusListForSelect());
        model.addAttribute("filter", filter);

        return "index";
    }

}
