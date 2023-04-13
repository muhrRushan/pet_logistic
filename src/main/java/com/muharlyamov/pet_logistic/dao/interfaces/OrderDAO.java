package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Order;

import java.util.List;

public interface OrderDAO {
    void save(Order order);
    void delete(Order order);
    List<Order> getAll();

    List<Order> getAllByFilter(OrdersFilter filter);

    Order getOrder(int id);
}
