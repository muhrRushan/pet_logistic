package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.controller.filters.OrdersFilter;
import com.muharlyamov.pet_logistic.dao.interfaces.OrderDAO;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.entity.enums.OrderStatus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

        @SuppressWarnings("SyntaxError") List<Order> allOrders = session.createQuery("from Order", Order.class).getResultList();

        if(!filter.getStatusViewPart().equals("")) {
            if (!OrderStatus.getStatusByRussianView(filter.getStatusViewPart()).equals(OrderStatus.ALL)) {
                allOrders = allOrders
                        .stream()
                        .filter(order -> (order.getStatus().equals(filter.getStatusViewPart())))
                        .collect(Collectors.toList());
            }
        }

        if(!filter.getShipmentDateBegin().equals("")) {
            LocalDateTime shipmentDateBegin = LocalDateTime.parse(filter.getShipmentDateBegin());
            allOrders = allOrders
                    .stream()
                    .filter(order -> (order.getShipment_date().isAfter(shipmentDateBegin)))
                    .collect(Collectors.toList());
        }

        if(!filter.getShipmentDateEnd().equals("")) {
            LocalDateTime shipmentDateEnd = LocalDateTime.parse(filter.getShipmentDateEnd());
            allOrders = allOrders
                    .stream()
                    .filter(order -> (order.getShipment_date().isBefore(shipmentDateEnd)))
                    .collect(Collectors.toList());
        }


        if (!filter.getOrganizationViewPart().equals("")) {
            allOrders = allOrders
                    .stream()
                    .filter(order -> (order.getOrganization() != null
                            && order.getOrganization().getView().toLowerCase().contains(filter.getOrganizationViewPart().toLowerCase())))
                    .collect(Collectors.toList());
        }

        if (!filter.getClientViewPart().equals("")) {
            allOrders = allOrders
                    .stream()
                    .filter(order -> (order.getClient() != null
                            && order.getClient().getView().toLowerCase().contains(filter.getClientViewPart().toLowerCase())))
                    .collect(Collectors.toList());
        }

        if (!filter.getCarViewPart().equals("")) {
            allOrders = allOrders
                    .stream()
                    .filter(order -> (order.getRoute() != null
                            && order.getRoute().getCar().getView().toLowerCase().contains(filter.getCarViewPart().toLowerCase())))
                    .collect(Collectors.toList());
        }
        return allOrders;
    }

    @Override
    public Order getOrder(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Order.class, id);
    }
}
