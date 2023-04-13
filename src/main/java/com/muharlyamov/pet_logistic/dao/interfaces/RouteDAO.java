package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.entity.Route;

import javax.print.attribute.standard.OrientationRequested;
import java.util.List;

public interface RouteDAO {
    void save(Route route);
    void delete(Route route);
    void addOrderToRoute(Route route, Order order);
    void removeOrderFromRoute(Order order);
    List<Route> getAll();
    Route getRoute(int id);
}
