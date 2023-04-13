package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.entity.Order;

import java.util.List;

public interface OrderService {
    public void save(Order order);
    public void delete(Order order);
    public List<Order> getAll();

    public List<Order> getAllByFilter(OrdersFilter filter);
    public Order getOrder(int id);
}
