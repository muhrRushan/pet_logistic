package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Order;

import java.util.List;

public interface OrderDAO {
    public void save(Order order);
    public void delete(Order order);
    public List<Order> getAll();

    public Order getOrder(int id);
}
