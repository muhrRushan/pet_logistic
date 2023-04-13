package com.muharlyamov.pet_logistic.service.interfaces;

import com.muharlyamov.pet_logistic.entity.Route;

import java.util.List;

public interface RouteService {
    void save(Route route);
    void delete(Route route);
    List<Route> getAll();
    Route getRoute(int id);
}
