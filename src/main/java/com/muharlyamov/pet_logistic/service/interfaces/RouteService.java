package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Route;

import java.util.List;

public interface RouteService {
    public void save(Route route);
    public void delete(Route route);
    public List<Route> getAll();
    public Route getRoute(int id);
}
