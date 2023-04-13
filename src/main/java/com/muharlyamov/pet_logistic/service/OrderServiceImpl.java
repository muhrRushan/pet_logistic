package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.OrderDAO;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDAO orderDAO;

    @Transactional
    @Override
    public void save(Order order) {
        orderDAO.save(order);
    }

    @Transactional
    @Override
    public void delete(Order order) {
        orderDAO.delete(order);
    }

    @Transactional
    @Override
    public List<Order> getAll() {
        return orderDAO.getAll();
    }

    @Transactional
    @Override
    public Order getOrder(int id) {
        return orderDAO.getOrder(id);
    }
}
