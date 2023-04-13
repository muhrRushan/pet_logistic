package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.entity.Order;

import java.util.List;

public interface OrderService {
    void save(Order order);
    void delete(Order order);
    List<Order> getAll();

    List<Order> getAllByFilter(OrdersFilter filter);
    Order getOrder(int id);
}
