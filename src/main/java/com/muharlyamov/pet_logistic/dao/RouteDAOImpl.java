package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.dao.interfaces.RouteDAO;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.entity.Route;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RouteDAOImpl implements RouteDAO {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public void save(Route route) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(route);
    }

    @Override
    public void delete(Route route) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(route);
    }

    @Override
    public void addOrderToRoute(Route route, Order order) {
        Session session = sessionFactory.getCurrentSession();
        order.setRoute(route);
        session.saveOrUpdate(order);
    }

    @Override
    public void removeOrderFromRoute(Order order) {
        Session session = sessionFactory.getCurrentSession();
        order.setRoute(null);
        session.saveOrUpdate(order);
    }

    @Override
    public List<Route> getAll() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("SyntaxError") List<Route> allRoutes = session.createQuery("from Route ", Route.class).getResultList();
        return allRoutes;
    }

    @Override
    public Route getRoute(int id) {
        Session session = sessionFactory.getCurrentSession();
        Route route = session.get(Route.class, id);
        return route;
    }
}
