package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.dao.interfaces.OrderDAO;
import com.muharlyamov.pet_logistic.entity.Order;
import com.sun.tools.javac.comp.Todo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(order);
    }

    @Override
    public void delete(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(order);
    }

    @Override
    public List<Order> getAll() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("SyntaxError") List<Order> allOrders = session.createQuery("from Order", Order.class).getResultList();
        return allOrders;
    }

    // TODO
    @Override
    public List<Order> getAllByFilter(OrdersFilter filter) {
        Session session = sessionFactory.getCurrentSession();
        HashMap<String, Object> filledFilters = filter.getFlledFilters();
        @SuppressWarnings("SyntaxError") List<Order> allOrders = session.createQuery("from Order", Order.class).getResultList();

        return allOrders;
    }

    @Override
    public Order getOrder(int id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.get(Order.class, id);
        return order;
    }
}
