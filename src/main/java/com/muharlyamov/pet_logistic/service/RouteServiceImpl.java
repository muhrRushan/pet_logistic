package com.muharlyamov.pet_logistic.service;

import com.muharlyamov.pet_logistic.dao.interfaces.RouteDAO;
import com.muharlyamov.pet_logistic.entity.Route;
import com.muharlyamov.pet_logistic.service.interfaces.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    RouteDAO routeDAO;

    @Transactional
    @Override
    public void save(Route route) {
        routeDAO.save(route);
    }

    @Transactional
    @Override
    public void delete(Route route) {
        routeDAO.delete(route);
    }

    @Transactional
    @Override
    public List<Route> getAll() {
        return routeDAO.getAll();
    }

    @Transactional
    @Override
    public Route getRoute(int id) {
        return routeDAO.getRoute(id);
    }
}
