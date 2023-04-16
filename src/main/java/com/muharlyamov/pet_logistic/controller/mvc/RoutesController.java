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

import java.util.List;

@Controller
public class RoutesController {

    @GetMapping(value = "/routes", produces = "text/html; charset=utf-8")
    public String getRoutes(Model model) {
        return "routes";
    }

}
