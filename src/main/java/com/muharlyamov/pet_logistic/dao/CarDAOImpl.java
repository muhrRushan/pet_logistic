package com.muharlyamov.pet_logistic.dao;

import com.muharlyamov.pet_logistic.dao.interfaces.CarDAO;
import com.muharlyamov.pet_logistic.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = session.get(Car.class, id);
        return  car;
    }

    @Override
    public void delete(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(car);
    }

    @Override
    public List<Car> getAllCars() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> allCars = session.createQuery("from Car", Car.class).getResultList();
        return allCars;
    }
}
