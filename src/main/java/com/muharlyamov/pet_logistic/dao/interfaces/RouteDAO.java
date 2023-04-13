package com.muharlyamov.pet_logistic.dao.interfaces;

import com.muharlyamov.pet_logistic.entity.Client;
import com.muharlyamov.pet_logistic.entity.Order;
import com.muharlyamov.pet_logistic.entity.Route;

import javax.print.attribute.standard.OrientationRequested;
import java.util.List;

public interface RouteDAO {
    public void save(Route route);
    public void delete(Route route);
    public void addOrderToRoute(Route route, Order order);
    public void removeOrderFromRoute(Order order);
    public List<Route> getAll();
    public Route getRoute(int id);
}
